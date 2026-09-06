import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " array elements:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of array elements
        int arraySum = 0;

        for (int i = 0; i < n - 1; i++) {
            arraySum = arraySum + arr[i];
        }

        // Find the missing number
        int missing = totalSum - arraySum;

        System.out.println("Missing Number: " + missing);

        sc.close();
    }
}
