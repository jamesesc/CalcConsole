import java.util.Scanner; // Importation to read console

public class Calculator {

    public static void main(String[] theArgs) {
        // Declaring Scanner as input; Instantiation of the Scanner by keyword 'new'
        Scanner input = new Scanner(System.in);
        // Boolean for calc repeat status
        boolean repeat = true;

        // Do-While Loop for Calc continuation functionality
        do {
            // Printing operation choices to the client
            printOperationChoices();
            // Getting operation choices from the client
            int operation = operationChoice(input);

            // Base on the operation, there's differ behavior
            operationChoicesBehavior(input, operation);

            // Asking the client to continue (y/n)
            repeat = continuationStatus(input, repeat);
        } while (repeat);
    }

    // Our Methods

    // Read and Validate Client Num Input
    public static int ClintNumInput (Scanner theInput) {
        int num = 0; // Initialize for the Num input
        boolean isInt = false; // Used for Num = Int validation
        while (!isInt) {
            if (theInput.hasNextInt()) {
                num = theInput.nextInt(); // If num = Int: true; Assign in num
                isInt = true; // To get out of the loop
            } else {
                System.out.println("Not an integer, Try again");
                theInput.next(); // Removing token
            }
        }
        return num; // returning a valid num
    }

    // Printing the various operation choices
    public static void printOperationChoices() {
        System.out.print("What operation? \n");
        // String array to hold our Operation Choices
        String[] operationArray = {"Addition", "Subtraction", "Multiplication", "Division",
                "Modules", "Exponents", "Square Roots", "Trig"};
        // Nested For-Loop for Printing Operation List Side-by-Side
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                // String format to specifically structure the output
                String operationOutput = String.format("%-3s%-17s%-3s%-17s",
                        i + 1 + ")", operationArray[i],
                        i + 5 + ")", operationArray[i + 4]);
                System.out.println(operationOutput);
            }
        }
    }

    // Getting the client desire operation
    public static int operationChoice(Scanner theInput) {
        System.out.println("Choose from 1 - 8");
        return ClintNumInput(theInput);
    }

    // Method for each Operation behavior to ask the Num
    public static void operationChoicesBehavior(Scanner theInput, int theOperation) {
        // int var for num
        int num1 = 0;
        int num2 = 0;

        // Switch case for each operation
        switch (theOperation) {
            case 1, 2, 3, 4, 5:
                System.out.println("What is the first number?");
                num1 = ClintNumInput(theInput);
                System.out.println("What is the second number?");
                num2 = ClintNumInput(theInput);
                while(num2 == 0) {
                    System.out.println("Can't do 0. Change your second number");
                    num2 = ClintNumInput(theInput);
                }
                break;
            case 6:
                System.out.println("What is your base number?");
                num1 = ClintNumInput(theInput);
                System.out.println("What is the exponent?");
                num2 = ClintNumInput(theInput);
                break;
            case 7:
                System.out.println("What is the number you want to Square root?");
                num1 = ClintNumInput(theInput);
                break;
            case 8:
                System.out.println("What is the angle of Sin you want?");
                num1 = ClintNumInput(theInput);
                break;
        }
        operationOutput(theOperation, num1, num2); // Passing operation; Our 2 num input
    }

    // Method to handle each operation
    public static void operationOutput(int theOperation, int theNum1, int theNum2) {
        System.out.print("This is answer \n ");
        // theOperation # is base on the choices of operation
        if (theOperation == 1) {
            System.out.println(theNum1 + " + " + theNum2 + " = " + (theNum1 + theNum2));
        } else if (theOperation == 2) {
            System.out.println(theNum1 + " - " + theNum2 + " = " + (theNum1 - theNum2));
        } else if (theOperation == 3) {
            System.out.println(theNum1 + " * " + theNum2 + " = " + (theNum1 * theNum2));
        } else if (theOperation == 4) {
            System.out.println(theNum1 + " / " + theNum2 + " = " + (theNum1 / theNum2));
        } else if (theOperation == 5) {
            System.out.println(theNum1 + " % " + theNum2 + " = " + (theNum1 % theNum2));
        } else if (theOperation == 6) {
            System.out.println("The exponent of " + theNum1 + " to " + theNum2 + " = " + Math.pow(theNum1, theNum2));
        } else if (theOperation == 7) {
            System.out.println("Square root of " + theNum1 + " = " + Math.sqrt(theNum1));
        } else if (theOperation == 8) {
            System.out.println("The trig sin of " + theNum1 + " = " + Math.sin(theNum1));
        }
    }

    // Method to handle Calc continuation functionality
    public static boolean continuationStatus(Scanner theInput, boolean theRepeat) {
        System.out.println("Do you wish to continue? (y/n)");
        return continuationInputHandle(theInput);
    }

    // Method to handle the continuation Input
    public static boolean continuationInputHandle(Scanner theInput) {
        // String array for the list of valid answer
        String[] validAnswer = {"Yes", "yes", "Y", "y", "No", "no", "N", "n"};
        /* Boolean for realAnswer when found, and when Answer is valid */
        boolean realAnswer = false;
        boolean isAnswerValid = false;

        // While-loop to repeat until answer is valid
        while (!isAnswerValid) {
            String answer = theInput.nextLine(); // Storing the client answer
            for (int i = 0; i < validAnswer.length; i++) { // For-loop to cycle through the array
                if (answer.equals(validAnswer[i])) { // Checking if answer == Answer array
                    isAnswerValid = true; // When true; Set Loop conditions to end
                    if (validAnswer[i].toLowerCase().contains("y")) {
                        realAnswer = true; // Finding if Answer contains Y
                    }
                }
            }
            if (!isAnswerValid) { // If the Answer is not valid, try again
                System.out.println("Not a valid answer. Try again");
            }
        }
        return realAnswer;
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
