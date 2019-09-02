package com.thoughtworks.bootcamp.assignment01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//This class is to test behaviour of TestExpenditure class

public class TripExpenditureTest {



    @Test
    void givenZeroSpentMoney_WhenCalculateExpenditure_ThenShouldReturnZero() {
        List<Friends> friends = new ArrayList<Friends>();
        List<SpentMoney> spentMoney = new ArrayList<SpentMoney>();

        TripExpenditure expenditureWithZeroSpentMoney = new TripExpenditure(friends,0.0f);
        Assertions.assertEquals(0, expenditureWithZeroSpentMoney.calculateBill());
    }

    @Test
    void givenOneSpentMoney_WhenCalculateExpenditure_ThenShouldReturnOne() {
        List<Friends> friends = new ArrayList<Friends>();
        List<SpentMoney> spentMoney = new ArrayList<SpentMoney>();

        TripExpenditure expenditureWithOneSpentMoney = new TripExpenditure(friends, 1.0f);
        Assertions.assertEquals(1.0f, expenditureWithOneSpentMoney.calculateBill());
    }

    @Test
    void givenFriendListIsZero_WhenDivideAmount_ThenShouldReturnZero(){
        List<Friends> friends = new ArrayList<>();

        TripExpenditure totalFriends = new TripExpenditure(friends, 0);
        Assertions.assertEquals(0,totalFriends.divideAmount());

    }

    @Test
    void givenFourSpentMoneyAndListOfFourFriends_WhenDivideAmount_ThenShouldReturnOne(){
        List<Friends> friends = new ArrayList<>();

        TripExpenditure totalFriends = new TripExpenditure(friends, 4);
        Assertions.assertEquals(1,totalFriends.divideAmount());

    }

    @Test
    void givenAnySpentMoneyAndListOfFriends_WhenDivideAmount_ThenShouldReturnAmount(){
        List<Friends> friends = new ArrayList<>();

        TripExpenditure totalFriends = new TripExpenditure(friends, 100);
        Assertions.assertEquals(25,totalFriends.divideAmount());

    }
}
