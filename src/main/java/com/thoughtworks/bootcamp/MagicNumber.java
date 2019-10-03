package com.thoughtworks.bootcamp;

public class MagicNumber {

    private  int remainder;
    private int result=0;

    boolean isHappy(int number) {
        int temp;
        while (number>0) {
            remainder = number % 10;
            result += remainder * remainder;
            number /= 10;
        }
        return (result==1);
    }
}
