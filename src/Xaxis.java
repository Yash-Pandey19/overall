import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Xaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();
            int[] arr = {x1,x2,x3};
            Arrays.sort(arr);
            System.out.println(arr[2]-arr[0]);
        }

    }
}
