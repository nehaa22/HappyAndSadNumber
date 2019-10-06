package com.thoughtworks.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class HappySad {
    int lastDigit; // TODO - does this need to be here?
    int result = 0;
    int temp;
    List<Integer> possiballySadNumber = new ArrayList<>();

    boolean isHappy(int number) {

        if (possiballySadNumber.contains(temp)) {
            return false;
        }

        temp = getSumOfSquares(number);

        if (temp == 1) {
            return true;
        }

        possiballySadNumber.add(temp);
        isHappy(temp);
        return false;
    }


    private int getSumOfSquares(int number) {
        int result = 0;
        while (number > 0) {
            result += square(getLastDigit(number));
            number /= 10;
        }
        return result;
    }

    private int square(int digit) {
        return digit * digit;
    }

    private int getLastDigit(int number) {
        return number % 10;
    }

}









