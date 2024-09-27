import java.util.*;
public class Squareornot {
    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (isPerfectSquare(n)) {
                    System.out.println("Yes");
                }
            else {
                System.out.println("No");
            }


        }
    }
}

