package com.example.bankapp.cardmanagement.service;

import com.example.bankapp.cardmanagement.entities.CreditCard;
import com.example.bankapp.cardmanagement.repositories.CardRepository;
import com.example.bankapp.cardmanagement.repositories.CreditCardRepository;
import com.example.bankapp.cardmanagement.requests.CreateCreditCardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository;
    private final CardService cardService;

    @Override
    public ResponseEntity<Object> createCreditCard(CreateCreditCardRequest request) {
        CreditCard creditCard = new CreditCard();
        return cardService.createCreditCard(creditCard, request);
    }

    @Override
    public ResponseEntity<Object> deleteCreditCardByCardNumber(long cardNumber) {

        CreditCard creditCard = creditCardRepository.findByCardNumber(cardNumber);

        if (creditCard == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Credit card is not found");
        }

        double debt = creditCard.getCardLimit() - creditCard.getCardBalance();

        if (debt != 0) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Credit card has a debt.Deletion is not acceptable.");
        }
        creditCardRepository.delete(creditCard);
        return ResponseEntity.status(HttpStatus.OK).body("Credit card is deleted");
    }
}