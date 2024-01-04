package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the ticket price:");
        while (true){
            try {
                Scanner enteredValue = new Scanner(System.in);
                int ticketPrice = enteredValue.nextInt();
                int miles = ticketPrice/20;
                System.out.println("You've been credited " + miles + " miles");
                break;
            }catch (InputMismatchException e) {
                System.out.println("Please, enter the number");
            }
        }
    }

}