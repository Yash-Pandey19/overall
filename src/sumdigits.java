import java.util.Scanner;

public class sumdigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i < n ; i++) {
            int x = sc.nextInt();
            int b = x % 10;
            int a = x / 10;
            System.out.println(a + b);
        }
    }
}
