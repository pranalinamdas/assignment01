package com.thoughtworks.bootcamp.assignment01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TripExpenditureTest {

    @Test
    void givenZeroSpentMoney_WhenCalculateExpenditure_ThenShouldReturnZero(){
        List<SpentMoney> spentMoney =new ArrayList<SpentMoney>();

        TripExpenditure expenditure = new TripExpenditure(spentMoney);
        Assertions.assertEquals(0,expenditure.calculate());
    }
}
