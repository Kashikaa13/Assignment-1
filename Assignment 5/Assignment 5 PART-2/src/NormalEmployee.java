import java.util.Scanner;

public class NormalEmployee extends Employee {
    private double bonusPercentage;

    // Parameterized constructor
    public NormalEmployee(String name, String address, int basicSalary, double bonusPercentage) {
        super(name, address, basicSalary);
        this.bonusPercentage = bonusPercentage;
    }

    // Default constructor
    public NormalEmployee() {
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

        System.out.println("Personal Info:");
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Date of Joining: " + getDoj());
        System.out.println("Account Number: " + getBankAcctNo());
        System.out.println("Leaves Taken: " + getLeavesTaken());
        System.out.println("Department: " + getEmpDept());
        System.out.println("Employee ID: " + getEmpId());
        System.out.println("UAN Number: " + getUAN());
        System.out.println();

        // Print Earnings
        System.out.println("Earnings:");
        System.out.println("Basic Wage: ₹" + basicWage);
        System.out.println("HRA: ₹" + hra);
        System.out.println("Conveyance Allowance: ₹" + conveyanceAllowance);
        System.out.println("Medical Allowance: ₹" + medicalAllowance);
        System.out.println("Other Allowance: ₹" + otherAllowance);
        System.out.println("Total Earnings: ₹" + totalEarnings);
        System.out.println();

        // Print Deductions
        System.out.println("Deductions:");
        System.out.println("EPF: ₹" + epf);
        System.out.println("ESI: ₹" + esi);
        System.out.println("Total Deductions: ₹" + totalDeductions);
        System.out.println();

        // Print Net Salary
        System.out.println("Net Salary: ₹" + netSalary);

    }
}