import java.util.Scanner;

public class blenderproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c = sc.nextInt();
            if(x>c){
                System.out.println((int)Math.ceil(n/c));
            }
            else{
                System.out.println((int)Math.ceil(n/x));
            }
        }

    }
}
