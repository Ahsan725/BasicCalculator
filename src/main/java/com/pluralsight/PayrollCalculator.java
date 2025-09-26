package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name;
        int hours;
        double payRate;
        int overtimeHours = 0;
        double grossPay;

        System.out.println("Enter your name: ");
        name = myScanner.nextLine();
        System.out.println("How many hours did you work?");
        hours = myScanner.nextInt();
        if (hours > 40){
            overtimeHours = hours - 40;
            hours =  hours - overtimeHours;
        }
        System.out.println("What is your pay rate?");
        payRate = myScanner.nextDouble();

        grossPay = payRate * hours + (overtimeHours * (1.5 * payRate));

        System.out.println("Name: " + name);
        System.out.println("Your Gross Pay: " + grossPay);
    }
}
