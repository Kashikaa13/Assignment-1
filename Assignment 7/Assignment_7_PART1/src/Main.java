import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first rational number (in the form a/b): ");
            String[] num1 = scanner.nextLine().split("/");
            int a = Integer.parseInt(num1[0]);
            int b = Integer.parseInt(num1[1]);
            RationalNumber rational1 = new RationalNumber(a, b);
            System.out.print("Enter second rational number (in the form a/b): ");
            String[] num2 = scanner.nextLine().split("/");
            int c = Integer.parseInt(num2[0]);
            int d = Integer.parseInt(num2[1]);
            RationalNumber rational2 = new RationalNumber(c, d);
            System.out.println("Addition: " + rational1.add(rational2));
            System.out.println("Subtraction: " + rational1.subtract(rational2));
            System.out.println("Multiplication: " + rational1.multiply(rational2));
            System.out.println("Division: " + rational1.divide(rational2));
            System.out.println("Comparison: " + (rational1.toDouble() == rational2.toDouble() ?
                    "Equal" : "Not Equal"));
            System.out.println("Absolute value of first number: " + rational1.abs());
            System.out.println("Absolute value of second number: " + rational2.abs());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter integers separated by '/'.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}