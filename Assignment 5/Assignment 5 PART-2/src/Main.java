import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is this employee a bonus employee? (yes/no): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter monthly bonus amount: ");
            double bonusAmount = scanner.nextDouble();
            BonusEmployee b = new BonusEmployee("John Doe", "123 Street, City", 2000, bonusAmount);
            b.getEmployeeDetails();
            b.salaryCalculation();
        } else {
            NormalEmployee n = new NormalEmployee();
            n.getEmployeeDetails();
            n.salaryCalculation();
        }
    }
}
