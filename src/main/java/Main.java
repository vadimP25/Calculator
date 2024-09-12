import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
            double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
            double secondNumber = scanner.nextDouble();


        boolean cycle = true;
        while (cycle) {
            scanner.nextLine();
            System.out.println("Enter what do you want to do with these numbers ('+' '-' '/' '*'):");
            String symbol = scanner.nextLine();

            switch (symbol) {
                case "+":
                    System.out.println("Result: " + calculator.addition(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println("Result: " + calculator.subtraction(firstNumber, secondNumber));
                    break;
                case "/":
                    if (secondNumber != 0) {
                        System.out.println("Result: " + calculator.division(firstNumber, secondNumber));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case "*":
                    System.out.println("Result: " + calculator.multiplication(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Enter a correct operator.");
                    break;
            }

            // Запит на продовження або завершення циклу
            System.out.println("Do you want to perform another operation? (yes/no):");
            String continueOperation = scanner.nextLine();
            if (!continueOperation.equalsIgnoreCase("yes")) {
                cycle = false;
            }
        }

        scanner.close();
    }
}
