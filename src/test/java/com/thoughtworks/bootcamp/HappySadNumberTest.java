package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HappySadNumberTest {

    @Test
    void givenNumberOne_WhenCheck_ThenShouldBeHappyNumber() {
        HappySad number = new HappySad();
        assertTrue(number.isHappy(1));
    }

    @Test
    void givenNumberTwo_WhenCheck_ThenShouldNotBeHappyNumber() {
        HappySad number = new HappySad();
        assertFalse(number.isHappy(2));
    }

    @Test
    void givenNumberThree_WhenCheck_ThenShouldNotBeHappyNumber() {
        HappySad number = new HappySad();
        assertFalse(number.isHappy(3));    }

    @Test
    void givenNumberSeven_WhenCheck_ThenShouldNotBeHappyNumber() {
        HappySad number = new HappySad();
        assertTrue(number.isHappy(7));
    }

    @Test
    void givenNumberNine_WhenCheck_ThenShouldNotBeHappyNumber() {
        HappySad number = new HappySad();
        assertNotEquals(1,number.isHappy(9));
    }

    @Test
    void givenNumberTen_WhenCheck_ThenShouldBeHappyNumber() {
        HappySad number = new HappySad();
        assertTrue(number.isHappy(10));    }

    @Test
    void givenNumberNineteen_WhenCheck_ThenShouldBeBeHappyNumber() {
        HappySad number = new HappySad();
        assertTrue(number.isHappy(19));
    }

    @Test
    void givenNumberHundred_WhenCheck_ThenShouldNotBeHappyNumber() {
        HappySad number = new HappySad();
        assertTrue(number.isHappy(100));
    }

    @Test
    void givenNumberTwoThirtyNine_WhenCheck_ThenShouldNotBeHappyNumber() {
        HappySad number = new HappySad();
        assertTrue(number.isHappy(239));
    }
}








