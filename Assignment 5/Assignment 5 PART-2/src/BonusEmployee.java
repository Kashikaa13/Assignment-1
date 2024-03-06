import java.util.Scanner;

public class BonusEmployee extends Employee {
    private double bonusPercentage;

    public BonusEmployee(String name, String address, int basicSalary, double bonusPercentage) {
        super(name, address, basicSalary);
        this.bonusPercentage = bonusPercentage;
    }

    public BonusEmployee() {
        super("Default Name", "Default Address", 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is this employee eligible for bonus? (yes/no): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter bonus percentage (e.g., 0.16 for 16%): ");
            this.bonusPercentage = scanner.nextDouble();
        } else {
            this.bonusPercentage = 0;
        }
    }

    @Override
    public void salaryCalculation() {
        int totalWorkingDays = 30;
        int lopDays = 1;
        int paidLeaves = totalWorkingDays - lopDays;

        // Calculate Basic Wage
        double basicWage = (getGrosswage() / totalWorkingDays) * paidLeaves * 0.45;
        setBasicWage(basicWage);

        // Calculate HRA
        double hra = basicWage * 0.4;
        setHra(hra);

        // Calculate Conveyance Allowance
        double conveyanceAllowance = (1600.0 / totalWorkingDays) * paidLeaves;
        setConveyanceAllowances(conveyanceAllowance);

        // Calculate Medical Allowances
        double medicalAllowance = (1250.0 / totalWorkingDays) * paidLeaves;
        setMedicalAllowances(medicalAllowance);

        // Calculate Other Allowance
        double otherAllowance = (getGrosswage() / totalWorkingDays) * paidLeaves - (basicWage + hra + conveyanceAllowance + medicalAllowance);
        setOtherAllowances(otherAllowance);

        // Calculate EPF
        double epf;
        if (basicWage >= 15000) {
            epf = 15000 * 12;
        } else {
            epf = basicWage * 0.15;
        }
        setEpf(epf);

        // Calculate Total Earnings
        double totalEarnings = basicWage + hra + conveyanceAllowance + medicalAllowance + otherAllowance;

        // Calculate bonus salary
        double bonusAmount = totalEarnings * bonusPercentage;
        totalEarnings += bonusAmount;

        setTotalEarning(totalEarnings);

        // Calculate ESI
        double esi = (getGrosswage() <= 21000) ? totalEarnings * 0.0075 : 0;
        setEsi(esi);

        // Calculate Total Deductions
        double totalDeductions = epf + esi;
        setTotalDeductions(totalDeductions);

        // Calculate Net Salary
        double netSalary = totalEarnings - totalDeductions;

        // Print the details
        System.out.println("BASIC WAGE:\t\t\t\t\t₹" + basicWage);
        System.out.println("EPF:\t\t\t\t\t\t\t\t\t₹" + epf);
        System.out.println("HRA:\t\t\t\t\t\t\t\t\t₹" + hra);
        System.out.println("ESI / Health Insurance:\t\t\t₹" + esi);
        System.out.println("Conveyance Allowances:\t\t\t₹" + conveyanceAllowance);
        System.out.println("Medical Allowances:\t\t\t\t₹" + medicalAllowance);
        System.out.println("Other Allowances:\t\t\t\t₹" + otherAllowance);
        System.out.println("Total Earnings:\t\t\t\t\t₹" + totalEarnings);
        System.out.println("Total Deductions:\t\t\t\t₹" + totalDeductions);
        System.out.println("Net Salary:\t\t\t\t\t\t₹" + netSalary);
    }
}

