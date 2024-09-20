import java.util.Scanner;

public class alternatingsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  // Length of the sequence
            int[] a = new int[n];

            // Read the sequence
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            // Calculate the alternating sum
            int alternatingSum = 0;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {  // Even index (0-based), corresponds to odd position (1-based)
                    alternatingSum += a[j];
                } else {  // Odd index (0-based), corresponds to even position (1-based)
                    alternatingSum -= a[j];
                }
            }
            // Output the result for the current test case
            System.out.println(alternatingSum);
        }
        sc.close();
    }
}
