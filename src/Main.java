import java.util.Scanner;

/**
 * Created by John5 on 1/14/18.
 */
public class Main {

    public static void main(String [] args) {

        //TODO figure out how to make this loop until the user decides to exit the program.

        System.out.println("Enter Selection: \n");
        System.out.println(
                "1 - Addition\n" +
                        "2 - Subtraction\n" +
                        "3 - Multiplication\n" +
                        "4 - Division\n" +
                        "5 - Exit Program\n"
        );

        Scanner kb = new Scanner(System.in);
        int selection = kb.nextInt();

        switch (selection) {
            case 1: {
                System.out.println("Please enter two numbers to be added: ");
                int one = kb.nextInt();
                int two = kb.nextInt();
                Calculator.addition(one, two);
                break;
            }

            case 2: {
                System.out.println("Please enter two numbers to be subtract: ");
                int one = kb.nextInt();
                int two = kb.nextInt();
                Calculator.subtraction(one, two);
                break;
            }

            case 3: {
                System.out.println("Please enter two numbers to be multiplied: ");
                int one = kb.nextInt();
                int two = kb.nextInt();
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

        System.exit(0);

    }

}
