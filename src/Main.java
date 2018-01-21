import java.util.Scanner;

/**
 * Created by John5 on 1/14/18.
 */

public class Main {

    public static void main(String [] args) {

        //TODO figure out how to make this loop until the user decides to exit the program.
//did u fart.
        int selection;

        //Tell the compiler to do the following code first, "Hey computer, do this for me"
        do {
            System.out.println("Enter Selection: \n");
            System.out.println(
                            "1 - Addition\n" +
                            "2 - Subtraction\n" +
                            "3 - Multiplication\n" +
                            "4 - Division\n" +
                            "5 - Exit Program\n"
            );

            Scanner kb = new Scanner(System.in);
            selection = kb.nextInt();

            switch (selection) {
                case 1: {
                    System.out.println("Please enter two numbers to be added: ");
                    double one = kb.nextDouble();
                    double two = kb.nextDouble();
                    Calculator.addition(one, two);
                    break;
                }

                case 2: {
                    System.out.println("Please enter two numbers to be subtract: ");
                    double one = kb.nextDouble();
                    double two = kb.nextDouble();
                    Calculator.subtraction(one, two);
                    break;
                }

                case 3: {
                    System.out.println("Please enter two numbers to be multiplied: ");
                    double one = kb.nextDouble();
                    double two = kb.nextDouble();
                    Calculator.multiply(one, two);
                    break;
                }

                case 4: {
                    System.out.println("Please enter two numbers to be divded: ");
                    double one = kb.nextDouble();
                    double two = kb.nextDouble();
                    Calculator.divide(one, two);
                    break;
                }

                case 5: break;

                default: break;

            }
        } while (selection!=5); //This tell the compiler to check after running the above code, if the selection is 5
        //If the selection is 5, then the program will exit, if it is not 5, it will loop back up the beginning of the "Do" block
        //"Hey computer, check to see if they entered '5', if they didn't, keep going until the do"

        System.exit(0);

    }

}
