import java.util.Scanner;

public class Calculator {
    public static void main(String[] theArgs) {
        System.out.println("What is the first number?");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("What is the second number?");
        int num2 = input.nextInt();
        System.out.print("This is the total of the two numbers: \n");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));





    }

    public static void SimpleCalcV1() {
        // First Run
        System.out.println("Test Water");
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 + num2);

    }


}
