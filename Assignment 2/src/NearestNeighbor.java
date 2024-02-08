import java.util.Scanner;

public class NearestNeighbor {
    public static int findNearest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int minDistance = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int index = findNearest(arr);
        if (index != -1) {
            System.out.println("Index of the first number with the smallest distance to its neighbor: " + index);
        } else {
            System.out.println("No neighboring numbers found.");
        }

        scanner.close();
    }
}
