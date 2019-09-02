package com.thoughtworks.bootcamp.assignment01;

import java.util.List;

//This class calculates each expenditure and how much a person owes money and how much a person gives money.
public class TripExpenditure {

    List<Friends> friends;
   float spentMoney;

    TripExpenditure(List<Friends> friends, float spentMoney) {
        this.friends = friends;
        this.spentMoney =  spentMoney;
    }

    public float calculateBill() {
        return spentMoney;
    }

    public float divideAmount() {
        return spentMoney/4;
    }
}