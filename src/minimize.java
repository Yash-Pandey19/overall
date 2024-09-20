import java.util.Scanner;
public class minimize {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();  // Read the number of test cases

            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();  // Read a
                int b = sc.nextInt();  // Read b

                // The minimum possible value is simply b - a
                System.out.println(b - a);
            }

            sc.close();
        }
    }

