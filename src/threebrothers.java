import java.util.Scanner;

public class threebrothers {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int one = sc.nextInt();
            int two = sc.nextInt();
            int late = 6 - one - two ;
            System.out.println(late);
        }
}
