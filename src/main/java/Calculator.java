import java.util.Scanner; // Importation to read console

public class Calculator {

    public static void main(String[] theArgs) {
        // Declaring Scanner as input; Instantiation of the Scanner by keyword 'new'
        Scanner input = new Scanner(System.in);
        // Boolean for calc repeat status
        boolean repeat = true;

        // Do-While Loop for Calc continuation functionality
        do {
            // Asking the client their 2 numbers
            System.out.println("What is the first number?");
            int num1 = ClintNumInput(input);
            System.out.println("What is the second number?");
            int num2 = ClintNumInput(input);

            // Asking the client what operation
            System.out.print("What operation? \n");

            String[] operationArray = {"Addition", "Subtraction", "Multiplication", "Division",
                                        "Modules", "Exponents", "Square Roots", "Trig"};

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 1; j++) {
                    String operationOutput = String.format("%-3s%-17s%-3s%-17s",
                                                            i + 1 + ")", operationArray[i],
                                                            i + 5 + ")", operationArray[i + 4]);
                    System.out.println(operationOutput);
                    // System.out.print(operationArray[i]);
                    // System.out.println(operationArray[i + 4]);

                }
            }

            System.out.println("Choose from 1 - 8");
            int operation = ClintNumInput(input);

            // Outputting the results of the operation
            System.out.print("This is answer \n ");
            OperationOutput(operation, num1, num2);

            // Asking the client to continue (y/n)
            repeat = continuationStatus(input, repeat);
        } while (repeat);
    }

    // Method to read the console for int, and returning that int
    public static int ClintNumInput (Scanner theInput) {
        return theInput.nextInt();
    }

    // Method to handle the operation
    public static void OperationOutput(int theOperation, int theNum1, int theNum2) {
        // theOperation # is base on the choices of operation
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

    // Method to handle Calc continuation functionality
    public static boolean continuationStatus(Scanner input, boolean theRepeat) {
        boolean status = true;
        System.out.println("Do you wish to continue? (y/n)");
        String answer = input.next();
        if (answer.equals("n")) {
            status = false;
        }
        return status;
    }

    // Very first Calc Design
    public static void SimpleCalcV1() {
        // First Run
        System.out.println("Test Water");
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 + num2);
    }
}
