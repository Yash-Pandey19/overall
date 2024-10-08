import java.util.Scanner;
public class freyathefrog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long k = scanner.nextLong();

            // Calculate the minimum number of moves for x and y directions using Math.ceil
            long xMoves = (x + k - 1) / k;  // Equivalent to Math.ceil((double)x / k)
            long yMoves = (y + k - 1) / k;  // Equivalent to Math.ceil((double)y / k)

            // Total moves required
            long totalMoves = Math.max(xMoves, yMoves) * 2;
            if ((totalMoves / 2) > xMoves) totalMoves--; // Adjust in case Freya overshoots x

            // Output the result
            System.out.println(totalMoves);
        }

        scanner.close();
    }
}
