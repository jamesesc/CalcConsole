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

    // Printing the various operation choices
    public static void printOperationChoices() {
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
    }

    // Methods here


    public static int ClintNumInput (Scanner theInput) {
        int num = 0;
        boolean isInt = false;
        while (!isInt) {
            if (theInput.hasNextInt()) {
                num = theInput.nextInt();
                isInt = true;
            } else {
                System.out.println("Not an integer, Try again");
                theInput.next();
            }
        }
        return num;
    }



    // Getting the client desire operation
    public static int operationChoice(Scanner theInput) {
        System.out.println("Choose from 1 - 8");
        return ClintNumInput(theInput);
    }


    public static void operationChoicesBehavior(Scanner theInput, int theOperation) {
        int num1 = 0;
        int num2 = 0;

        switch (theOperation) {
            case 1, 2, 3, 4, 5:
                // Asking the client their 2 numbers
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

        // Sending over our Operation and Num
        operationOutput(theOperation, num1, num2);
    }

    // Method to handle the operation
    public static void operationOutput(int theOperation, int theNum1, int theNum2) {
        // Outputting the results of the operation
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
            // Exponents
            System.out.println("The exponent of " + theNum1 + " to " + theNum2 + " = " + Math.pow(theNum1, theNum2));
        } else if (theOperation == 7) {
            System.out.println("Square root of " + theNum1 + " = " + Math.sqrt(theNum1)); // Square root
        } else if (theOperation == 8) {
            System.out.println("The trig sin of " + theNum1 + " = " + Math.sin(theNum1)); //
        }
    }

    // Method to handle Calc continuation functionality
    public static boolean continuationStatus(Scanner theInput, boolean theRepeat) {
        System.out.println("Do you wish to continue? (y/n)");
        return continuationInputHandle(theInput);


//        boolean status = true;
//        System.out.println("Do you wish to continue? (y/n)");
//        String answer = input.next();
//        if (answer.equals("n")) {
//            status = false;
//        }
//        return status;
    }


    public static boolean continuationInputHandle(Scanner theInput) {
        String[] validAnswer = {"Yes", "yes", "Y", "y", "No", "no", "N", "n"};
        boolean realAnswer = false;
        boolean isAnswerValid = false;

        while (!isAnswerValid) {
            String answer = theInput.nextLine();
            for (int i = 0; i < validAnswer.length; i++) {
                if (answer.equals(validAnswer[i])) {
                    isAnswerValid = true;

                    if (validAnswer[i].toLowerCase().contains("y")) {
                        realAnswer = true;
                    }
                }
            }

            if (!isAnswerValid) {
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
