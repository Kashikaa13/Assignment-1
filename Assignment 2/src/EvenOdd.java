import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size :");
        int n = sc.nextInt();

        int[] even = new int[n];
        int[] odd = new int[n];

        int evenIndex = 0;
        int oddIndex = 0;

        for(int i=0; i < n; i++){
            System.out.println("Enter the Number" + (i + 1) + ":");
            int num = sc.nextInt();

            if(num % 2 == 0){
                even[evenIndex++] = num;
            }
            else{
                odd[oddIndex++] = num;
            }
        }

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }


        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

    }
}
