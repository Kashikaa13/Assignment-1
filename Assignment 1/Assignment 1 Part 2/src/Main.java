import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            double result;

            switch (choice) {
                case 1:
                    result = calculator.add();
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = calculator.subtract();
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = calculator.multiply();
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = calculator.divide();
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    result = calculator.squareRoot();
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    result = calculator.power();
                    System.out.println("Result: " + result);
                    break;
                case 7:
                    result = calculator.mean(scanner);
                    System.out.println("Mean: " + result);
                    break;
                case 8:
                    result = calculator.variance(scanner);
                    System.out.println("Variance: " + result);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }
    }
}
