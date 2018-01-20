import java.util.Scanner;

/**
 * Created by John5 on 1/14/18.
 */


public class Calculator {

    public static void addition(int num1, int num2) {

        int numberOne = num1;
        int numberTwo = num2;

        int sum = numberOne + numberTwo;

        System.out.println(numberOne + " plus " + numberTwo + " = " + sum);

    }

    public static void subtraction(int num1, int num2) {

        int numberOne = num1;
        int numberTwo = num2;

        int sum = numberOne - numberTwo;

        System.out.println(numberOne + " subtracting " + numberTwo + " = " + sum);

    }

    public static void multiply(int num1, int num2) {

        int numberOne = num1;
        int numberTwo = num2;

        int result = numberOne * numberTwo;

        System.out.println(numberOne + " multipled by " + numberTwo + " = " + result);
    }

    public static void divide(double num1, double num2) {

        double numberOne = num1;
        double numberTwo = num2;

        double quotient = (numberOne / numberTwo);

        System.out.println(numberOne + " divided by " + numberTwo + " = " + quotient);
    }

}




