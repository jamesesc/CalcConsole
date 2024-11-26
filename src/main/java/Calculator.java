import java.util.Scanner;

public class Calculator {

    public static void main(String[] theArgs) {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);

        do {
            // Asking clint their 2 numbers
            System.out.println("What is the first number?");
            int num1 = ClintNumInput(input);
            System.out.println("What is the second number?");
            int num2 = ClintNumInput(input);

            // Asking clint what operation
            System.out.print("What operation? \n");
            System.out.println("Addition, Subtraction, Multiplication, Division");
            System.out.println("Choose from 1, 4");
            int operation = ClintNumInput(input);

            // Printing
            System.out.print("This is the total of the two numbers: \n");
            OperationOutput(operation, num1, num2);

            // Asking user to continue
            repeat = continuationStatus(input, repeat);

        } while (repeat);
    }

    public static int ClintNumInput (Scanner theInput) {
        return theInput.nextInt();
    }

    public static void OperationOutput(int theOperation, int theNum1, int theNum2) {
        // Logic for operation
        if (theOperation == 1) {
            System.out.println(theNum1 + " + " + theNum2 + " = " + (theNum1 + theNum2));
        } else if (theOperation == 2) {
            System.out.println(theNum1 + " - " + theNum2 + " = " + (theNum1 - theNum2));
        } else if (theOperation == 3) {
            System.out.println(theNum1 + " * " + theNum2 + " = " + (theNum1 * theNum2));
        } else {
            System.out.println(theNum1 + " / " + theNum2 + " = " + (theNum1 / theNum2));
        }
    }

    public static boolean continuationStatus(Scanner input, boolean theRepeat) {
        boolean status = true;
        System.out.println("Do you wish to continue? (y/n)");
        String answer = input.next();
        if (answer.equals("n")) {
            status = false;
        }
        return status;
    }


    public static void SimpleCalcV1() {
        // First Run
        System.out.println("Test Water");
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 + num2);
    }

}
