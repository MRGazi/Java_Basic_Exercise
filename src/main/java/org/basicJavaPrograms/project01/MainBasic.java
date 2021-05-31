package org.basicJavaPrograms.project01;

import java.util.Scanner;

public class MainBasic {
    public static void main(String[] args) {
        //palindrome(515);
//        palindromeFromKeyboard();
        //calculateFibonacci(10);
        System.out.println(calculateFibonacci1(6));
    }

    public static void palindrome(int number){
        /*Palindrome: in this following logic I am going to check if a reverse number of a number is palindrome or
        not. Example: number = 121 of which palindrome is 121.
        1. I will take a temporary Number variable (tempNumber),
        2.second variable would be for remainder;
        3.third variable would be for reverse number;
        4.Number would be assigned to temNumber variable;
        5.rule is any number is divided by 10 if the number is end with 0 and greater then 10. Any smaller integer is
         divided by larger integer will result 0. In Java remainder/modulus operator is % (percent sign) and division
         operator is / (forward slash).
        */
        int tempNumber;
        int remainder;
        int reverseNumber = 0;
        tempNumber = number;

        while (number > 0){
            remainder = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        if( reverseNumber == tempNumber){
            System.out.println("Numeber " + tempNumber+" is Palindrome");
        }else {
            System.out.println("Number " + tempNumber+ " is not Palindrome");
        }
    }

    public static void palindromeFromKeyboard(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the number here for Palindrome: ");
        int myNumber = keyboard.nextInt();
        palindrome(myNumber);
    }

    public static int fibonacciNumber(int number){
        int fibo1 = 0, fibo2 = 1, fibonacci = 0;
        for(int i = 0; i <= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }

    public static void calculateFibonacci(int number){
        for (int i = 0; i < number; i++){
            System.out.println("Tibonacci Number: " + fibonacciNumber(i));
        }
    }

    public static int calculateFibonacci1(int number){
        if(number == 1||number == 2){
            return  1;
        }
        return calculateFibonacci1(number - 1) + calculateFibonacci1(number - 2);
    }
}
