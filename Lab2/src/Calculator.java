import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        //create a scanner to receive values from user
        Scanner scanner = new Scanner(System.in);

        //obtain values of operands with scanner
        System.out.print("Enter first operand: ");
        double response1 = scanner.nextDouble();
        System.out.print("Enter second operand: ");
        double response2 = scanner.nextDouble();

        //display calculator menu
        System.out.println("Calculator Menu\n---------------\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Which operation do you want to perform? ");
        int operator = scanner.nextInt();
askdlfj;lkadsjfkl this is an edit for lab 6

        //compares input integer to each case so chosen operator can be done correctly
        switch(operator) {
            case 1:
                System.out.println("The result of the operation is " + (response1 + response2) + ". Goodbye!");
                break;
            case 2:
                System.out.println("The result of the operation is " + (response1 - response2) + ". Goodbye!");
                break;
            case 3:
                System.out.println("The result of the operation is " + (response1 * response2) + ". Goodbye!");
                break;
            case 4:
                System.out.println("The result of the operation is " + (response1 / response2) + ". Goodbye!");
                break;
            //default is for any value not listed in calculator menu
            default:
                System.out.println("Error: Invalid selection! Terminating program.");
        }
    }
}
