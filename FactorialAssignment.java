/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialassignment;

import java.util.Scanner;

/**
 *
 * @author OP
 */
public class FactorialAssignment {
    private int number;


    public FactorialAssignment(int number) {
        this.number = number;
    }

    
    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    
    public int calculateFactorial() {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        FactorialAssignment calculator = new FactorialAssignment(inputNumber);
        int result = calculator.calculateFactorial();
        System.out.println("Factorial of " + inputNumber + " is: " + result);

        // Using the second class
        FactorialHelper helper = new FactorialHelper(calculator);
        helper.printNumber();
    }
}


class FactorialHelper {
    private FactorialAssignment factorialAssignment;

    
    public FactorialHelper(FactorialAssignment factorialAssignment) {
        this.factorialAssignment = factorialAssignment;
    }

    
    public void printNumber() {
        System.out.println("The number stored in FactorialAssignment is: " + factorialAssignment.getNumber());
    }
}
