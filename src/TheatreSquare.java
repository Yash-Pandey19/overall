import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long length = (long) Math.ceil((double)n / a);
        long width = (long) Math.ceil((double)m / a);
        long total = length*width;
        System.out.println(total);
    }
}
