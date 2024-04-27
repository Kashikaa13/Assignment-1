import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number to find its factorial (or type 'exit' to quit): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                int num = Integer.parseInt(input);
                if (num < 0 || num > 15) {
                    throw new FactorialException(num);
                }
                System.out.println("Factorial of " + num + " is: " + factorial(num));
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Invalid input format.");
            } catch (FactorialException e) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}