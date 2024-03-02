import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxsize = 100;
        Student[] student = new Student[maxsize];
        int count = 0;

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Update Student Details");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    if(count < maxsize){
                        System.out.print("Enter PRN :");
                        double Prn = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Name :");
                        String name = sc.nextLine();
                        System.out.println("Enter Date of Birth :");
                        String dob = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();

                        student[count] = new Student(Prn, name, dob, marks);
                        count++;
                        System.out.println("Student added Successfully...");
                    }else{
                        System.out.println("Maximum Number of Students Reached. Cannot add more");
                    }
                    break;
                case 2:
                    System.out.println("List of Students :");
                    for (int i=0; i<count; i++){
                        student[i].display();
                    }
                    break;
                case 3:
                    System.out.println("Enter PRN to Search :");
                    int searchPrn = sc.nextInt();
                    boolean foundbyPrn = false;
                    for (int i=0; i<count; i++){
                        if(student[i].getPrn() == searchPrn){
                            student[i].display();
                            foundbyPrn = true;
                            break;
                        }
                    }
                    if(!foundbyPrn){
                        System.out.println("Student with PRN "+ searchPrn + "not found.");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter Name to Search :");
                    String searchName = sc.nextLine();
                    boolean foundByName = false;
                    for(int i=0; i<count; i++){
                        if(student[i].getName().equalsIgnoreCase(searchName)){
                            student[i].display();
                            foundByName = true;
                        }
                    }
                    if (!foundByName){
                        System.out.println("Student with Name"+ searchName+"not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter PRN of student to update: ");
                    int updatePrn = sc.nextInt();
                    boolean foundForUpdate = false;
                    for (int i = 0; i < count; i++) {
                        if (student[i].getPrn() == updatePrn) {
                            System.out.println("Enter updated details:");
                            System.out.print("Name: ");
                            sc.nextLine(); // Consume newline
                            String updatedName = sc.nextLine();
                            System.out.print("Date of Birth: ");
                            String updatedDob = sc.nextLine();
                            System.out.print("Marks: ");
                            double updatedMarks = sc.nextDouble();

                            student[i] = new Student(updatePrn, updatedName, updatedDob, updatedMarks);
                            foundForUpdate = true;
                            System.out.println("Student details updated successfully!");
                            break;
                        }
                    }
                    if (!foundForUpdate) {
                        System.out.println("Student with PRN " + updatePrn + " not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter PRN of student to delete: ");
                    int deletePrn = sc.nextInt();
                    boolean foundForDelete = false;
                    for (int i = 0; i < count; i++) {
                        if (student[i].getPrn() == deletePrn) {
                            for (int j = i; j < count - 1; j++) {
                                student[j] = student[j + 1];
                            }
                            count--;
                            foundForDelete = true;
                            System.out.println("Student deleted successfully!");
                            break;
                        }
                    }
                    if (!foundForDelete) {
                        System.out.println("Student with PRN " + deletePrn + " not found.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
