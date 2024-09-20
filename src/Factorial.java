import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input the integer N
        int N = sc.nextInt();

        // Variable to store factorial result
        long factorial = 1;

        // Calculate factorial
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }

        // Output the factorial
        System.out.println(factorial);

        // Close the scanner
        sc.close();
    }
}
