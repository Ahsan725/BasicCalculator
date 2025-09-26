package com.pluralsight;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Enter the first num: ");
        num1 = myScanner.nextDouble();
        System.out.println("Enter the 2nd num: ");
        num2 = myScanner.nextDouble();
        System.out.println(num1 + " " + num2);

        System.out.println("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option:
                """);
        myScanner.nextLine();
        String operation = myScanner.nextLine();
        double result = 0;
        if (operation.equals("a")){
            System.out.println("We will add these!");
            result = num1 + num2;
        }
        else if (operation.equals("s")){
            System.out.println("We will subtract these!");
            result = num1 - num2;
        }
        else if (operation.equals("m")){
            System.out.println("We will multiply these!");
            result = num1 * num2;
        }
        else if (operation.equals("d")){
            System.out.println("We will divide these!");
            result = num1 / num2;
        }
        System.out.println("The result was: " + result);

    }
}