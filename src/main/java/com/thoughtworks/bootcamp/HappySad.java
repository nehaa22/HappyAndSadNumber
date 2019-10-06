package com.thoughtworks.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class HappySad {
    private List<Integer> possiblySadNumbers = new ArrayList<>();

    boolean isHappy(int number) {
        int temp = number;

        if (possiblySadNumbers.contains(number)) {
            return false;
        }
        temp = getSumOfSquares(number);

        if (temp == 1) {
            return true;
        }
        possiblySadNumbers.add(number);
        return isHappy(temp);
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









