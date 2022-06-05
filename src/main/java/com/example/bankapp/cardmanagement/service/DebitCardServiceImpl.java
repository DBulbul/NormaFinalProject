package com.example.bankapp.cardmanagement.service;

import com.example.bankapp.cardmanagement.entities.DebitCard;
import com.example.bankapp.cardmanagement.repositories.DebitCardRepository;
import com.example.bankapp.cardmanagement.requests.CreateDebitCardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class DebitCardServiceImpl implements DebitCardService {
    private final CardService cardService;
    private final DebitCardRepository debitCardRepository;

    @Override
    public ResponseEntity<Object> createDebitCard(CreateDebitCardRequest request) {

        DebitCard debitCard = new DebitCard();
        return cardService.createDebitCard(debitCard, request);
    }

    @Override
    public ResponseEntity<Object> deleteDebitCardByCardNumber(long cardNumber) throws IOException {

        DebitCard debitCard = debitCardRepository.findByCardNumber(cardNumber);

        if (debitCard == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Debit card is not found");
        }

        debitCardRepository.delete(debitCard);

        return ResponseEntity.status(HttpStatus.OK).body("Debit card is deleted");
    }
}
