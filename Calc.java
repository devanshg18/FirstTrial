package com.firstjava;

import java.util.Scanner;

class FirstJava{
    public static void main(String[] args){
        char operator;
        double n1 , n2 , result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator ");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        n1 = input.nextDouble();

        System.out.println("Enter second number");
        n2 = input.nextDouble();

        switch (operator) {
            case '+' -> {
                result = n1 + n2;
                System.out.println("The sum is " + result);
            }
            case '-' -> {
                result = n1 - n2;
                System.out.println("The difference is " + result);
            }
            case '*' -> {
                result = n1 * n2;
                System.out.println("the product is " + result);
            }
            case '/' -> {
                result = n1 / n2;
                System.out.println("The difference is " + result);
            }
            default -> System.out.println("Invalid expression");
        }


    }

}