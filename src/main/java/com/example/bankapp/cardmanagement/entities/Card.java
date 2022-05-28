package com.example.bankapp.cardmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public abstract class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long card_id;
    private long cardNumber;
    private boolean isActive;
    private int CCV;

    @Temporal(TemporalType.DATE)
    private Date expiredDate;
}
