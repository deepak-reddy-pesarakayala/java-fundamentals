import java.util.Scanner;
public class GameCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("=== GAME CALCULATOR ===");

        while (true) {

            System.out.println("\nSelect Operation:");
            System.out.println("1 -> Add");
            System.out.println("2 -> Subtract");
            System.out.println("3 -> Multiply");
            System.out.println("4 -> Divide");
            System.out.println("5 -> Quit");

            System.out.print("Enter choice: ");
            option = input.nextInt();

            if (option == 5) {
                System.out.println("Exiting Game Calculator...");
                break;
            }

            if (option < 1 || option > 5) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            System.out.print("Enter first value: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second value: ");
            double num2 = input.nextDouble();

            double result;

            switch (option) {

                case 1:
                    result = num1 + num2;
                    System.out.println("Answer: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Answer: " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Answer: " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Answer: " + result);
                    }
                    break;

                default:
                    System.out.println("Unexpected error!");
            }
        }

        input.close();
    }
}