import java.util.Scanner;

public class Calculator {
    public static void main(String[] theArgs) {
        boolean repeat = true;

        do {
            // Asking clint their 2 numbers
            System.out.println("What is the first number?");
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            System.out.println("What is the second number?");
            int num2 = input.nextInt();

            // Asking clint what operation
            System.out.print("What operation? \n");
            System.out.println("Addition, Subtraction, Multiplication, Division");
            System.out.println("Choose from 1, 4");
            int operation = input.nextInt();

            // Printing
            System.out.print("This is the total of the two numbers: \n");

            // Logic for operation
            if (operation == 1) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (operation == 2) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (operation == 3) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }

            // Asking user to continue
            System.out.println("Do you wish to continue? (y/n)");
            String answer = input.next();
            if (answer.equals("n")) {
                repeat = false;
            }
        } while (repeat);
    }

    public static void SimpleCalcV1() {
        // First Run
        System.out.println("Test Water");
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 + num2);
    }

}
