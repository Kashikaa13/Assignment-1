import java.util.Scanner;
class Calculator {
    public double add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public double subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    public double multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    public double divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // NaN represents Not-a-Number
        } else {
            return dividend / divisor;
        }
    }

    public double squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number");
            return Double.NaN;
        } else {
            return Math.sqrt(num);
        }
    }

    public double power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }

    public double mean(Scanner scanner) {
        double sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter a number (or 'end' to finish): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            double num = Double.parseDouble(input);
            sum += num;
            count++;
        }
        if (count == 0) {
            System.out.println("Error: No numbers entered");
            return Double.NaN;
        } else {
            return sum / count;
        }
    }

    public double variance(Scanner scanner) {
        double sum = 0;
        double sumSquared = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter a number (or 'end' to finish): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            double num = Double.parseDouble(input);
            sum += num;
            sumSquared += num * num;
            count++;
        }
        if (count == 0) {
            System.out.println("Error: No numbers entered");
            return Double.NaN;
        } else {
            double mean = sum / count;
            return sumSquared / count - mean * mean;
        }
    }
}

