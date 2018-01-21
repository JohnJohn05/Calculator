/**
 * Created by John5 on 1/14/18.
 */


public class Calculator {

    /*
    Hi!
     */

    public static void addition(double num1, double num2) {

        double numberOne = num1;
        double numberTwo = num2;

        double sum = numberOne + numberTwo;

        System.out.println(numberOne + " plus " + numberTwo + " = " + sum + "\n");

    }

    public static void subtraction(double num1, double num2) {

        double numberOne = num1;
        double numberTwo = num2;

        double sum = numberOne - numberTwo;

        System.out.println(numberOne + " subtracting " + numberTwo + " = " + sum + "\n");

    }

    public static void multiply(double num1, double num2) {

        double numberOne = num1;
        double numberTwo = num2;

        double result = numberOne * numberTwo;

        System.out.println(numberOne + " multipled by " + numberTwo + " = " + result + "\n");
    }

    public static void divide(double num1, double num2) {

        double numberOne = num1;
        double numberTwo = num2;

        double quotient = (numberOne / numberTwo);

        System.out.println(numberOne + " divided by " + numberTwo + " = " + quotient + "\n");
    }

}




