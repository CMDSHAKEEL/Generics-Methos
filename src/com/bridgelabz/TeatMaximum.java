package com.bridgelabz;

public class TeatMaximum {
    public static void main(String[] args) {
        Integer number1 = 5;                // giving interger values
        Integer number2 = 10;                //for number 1,2,3
        Integer number3 = 15;
        Integer maximumNum = testMax(number1,number2,number3);
        System.out.println("Maximum Integer is: " +maximumNum);


}

    private static Integer testMax(Integer number1, Integer number2, Integer number3) {         //creating a method of testMax
        Integer maximumnumber = number1;
        if(number2.compareTo(maximumnumber) > 0);                                               //logic for comparinng the numbers
        {
            maximumnumber = number2;
        }
        if(number3.compareTo(maximumnumber) > 0);
        {
            maximumnumber = number3;
        }
        return maximumnumber;
    }
}
