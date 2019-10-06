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

//    @Test
//    void givenNumberTen_WhenCheck_ThenShouldBeHappyNumber() {
//        HappySad number = new HappySad();
//        Assertions.assertEquals(1,number.isHappy(10));
//    }

//    @Test
//    void givenNumberTwelve_WhenCheck_ThenShouldNotBeHappyNumber() {
//        HappySad number = new HappySad();
//        Assertions.assertNotEquals(1,number.isHappy(12));
//    }

//    @Test
//    void givenNumberFifteen_WhenCheck_ThenShouldNotBeHappyNumber() {
//        HappySad number = new HappySad();
//        Assertions.assertEquals(1,number.isHappy(19));
//    }



}



