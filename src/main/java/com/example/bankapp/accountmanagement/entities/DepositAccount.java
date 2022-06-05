package com.example.bankapp.accountmanagement.entities;

import com.example.bankapp.accountmanagement.enums.DayEnum;
import com.example.bankapp.cardmanagement.entities.DebitCard;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class DepositAccount extends Account{
    @Enumerated(EnumType.ORDINAL)
    private DayEnum day;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startingDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date finishDate;

    private double startingBalance=0.00;

}
