import java.util.Scanner;

public class sumdigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            int x = sc.nextInt();
            int b = x % 10;
            int a = x / 10;
            System.out.println(a + b);
        }
    }
}
