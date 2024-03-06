import java.util.Scanner;

public abstract class Employee {
    Scanner sc=new Scanner(System.in);
    private String empName,empAddress,empDesignation,empDept,doj,bankName;
    private long UAN,PF_NO,empId,bankAcctNo;
    private int totalWorkingDays,paidDays,leavesTaken,lopDays;
    private double grosswage,totalEarning,totalDeductions,basicWage,hra,conveyanceAllowances,
            medicalAllowances,otherAllowances,epf,esi,pt,loanRecovery;

    public Employee(String empName, String empAddress, int basicWage) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.basicWage = basicWage;
    }

    public abstract void salaryCalculation();

    public void getEmployeeDetails() {
        System.out.println("Employee Id");
        long eid=sc.nextLong();
        setEmpId(eid);
        System.out.println("Employee Department");
        String dept=sc.next();
        setEmpDept(dept);
        System.out.println("Employee DOj");
        String doj=sc.next();
        setDoj(doj);
        System.out.println("Employee UAN");
        long u=sc.nextLong();
        setUAN(u);
        System.out.println("Employee PF Number");
        long pf=sc.nextLong();
        setPF_NO(pf);
        System.out.println("Employee Bank Name");
        String bn=sc.next();
        setBankName(bn);
        System.out.println("Employee Bank Account No");
        long acct=sc.nextLong();
        setBankAcctNo(acct);
        System.out.println("Employee Gross Wage");
        double gw=sc.nextDouble();
        setGrosswage(gw);
        setTotalWorkingDays(30);
        setLopDays(1);
        setPaidDays(getTotalWorkingDays()-getLopDays());
        System.out.println("Employee leaves taken");
        int lt=sc.nextInt();
        setLeavesTaken(lt);
    }

    // Setter method for bankName
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public long getUAN() {
        return UAN;
    }

    public void setUAN(long UAN) {
        this.UAN = UAN;
    }

    public long getPF_NO() {
        return PF_NO;
    }

    public void setPF_NO(long PF_NO) {
        this.PF_NO = PF_NO;
    }

    public long getBankAcctNo() {
        return bankAcctNo;
    }

    public String getBankName(){
        return bankName;
    }

    public void setBankAcctNo(long bankAcctNo) {
        this.bankAcctNo = bankAcctNo;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getPaidDays() {
        return paidDays;
    }

    public void setPaidDays(int paidDays) {
        this.paidDays = paidDays;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public int getLopDays() {
        return lopDays;
    }

    public void setLopDays(int lopDays) {
        this.lopDays = lopDays;
    }

    public double getGrosswage() {
        return grosswage;
    }

    public void setGrosswage(double grosswage) {
        this.grosswage = grosswage;
    }

    public double getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(double totalEarning) {
        this.totalEarning = totalEarning;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public double getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(double basicWage) {
        this.basicWage = basicWage;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getConveyanceAllowances() {
        return conveyanceAllowances;
    }

    public void setConveyanceAllowances(double conveyanceAllowances) {
        this.conveyanceAllowances = conveyanceAllowances;
    }

    public double getMedicalAllowances() {
        return medicalAllowances;
    }

    public void setMedicalAllowances(double medicalAllowances) {
        this.medicalAllowances = medicalAllowances;
    }

    public double getOtherAllowances() {
        return otherAllowances;
    }

    public void setOtherAllowances(double otherAllowances) {
        this.otherAllowances = otherAllowances;
    }

    public double getEpf() {
        return epf;
    }

    public void setEpf(double epf) {
        this.epf = epf;
    }

    public double getEsi() {
        return esi;
    }

    public void setEsi(double esi) {
        this.esi = esi;
    }

    public double getPt() {
        return pt;
    }

    public void setPt(double pt) {
        this.pt = pt;
    }

    public double getLoanRecovery() {
        return loanRecovery;
    }

    public void setLoanRecovery(double loanRecovery) {
        this.loanRecovery = loanRecovery;
    }


}