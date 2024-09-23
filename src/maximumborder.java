import java.util.Scanner;
public class maximumborder {
    public static int findMaxBorder(char[][] matrix, int n, int m) {
        int maxBorder = 0;
        for (int i = 0; i < n; i++) {
            int currentLength = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '#') {
                    currentLength++;
                    maxBorder = Math.max(maxBorder, currentLength);
                } else {
                    currentLength = 0;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            int currentLength = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == '#') {
                    currentLength++;
                    maxBorder = Math.max(maxBorder, currentLength);
                } else {
                    currentLength = 0;
                }
            }
        }

        return maxBorder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            // Read the number of rows and columns
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Read the matrix
            char[][] matrix = new char[n][m];
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                matrix[i] = row.toCharArray();
            }

            // Find and print the maximum border
            int result = findMaxBorder(matrix, n, m);
            System.out.println(result);
        }

        sc.close();
    }
}




