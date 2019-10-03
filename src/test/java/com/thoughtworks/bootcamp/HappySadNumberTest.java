package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HappySadNumberTest {

    @Test
    void givenNumberOne_WhenCheck_ThenShouldBeHappyNumber() {
        MagicNumber number = new MagicNumber();
        assertTrue(number.isHappy(1));
    }

    @Test
    void givenNumberTwo_WhenCheck_ThenShouldNotBeHappyNumber() {
        MagicNumber number = new MagicNumber();
        assertFalse(number.isHappy(2));
    }

    @Test
    void givenNumberThree_WhenCheck_ThenShouldNotBeHappyNumber() {
        MagicNumber number = new MagicNumber();
        assertFalse(number.isHappy(3));
    }

    @Test
    void givenNumberNine_WhenCheck_ThenShouldNotBeHappyNumber() {
        MagicNumber number = new MagicNumber();
        assertFalse(number.isHappy(9));
    }

    @Test
    void givenNumberTen_WhenCheck_ThenShouldBeHappyNumber() {
        MagicNumber number = new MagicNumber();
        assertTrue(number.isHappy(10));
    }

    @Test
    void givenNumberTwelve_WhenCheck_ThenShouldNotBeHappyNumber() {
        MagicNumber number = new MagicNumber();
        assertFalse(number.isHappy(12));
    }



}



