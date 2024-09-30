import java.util.Scanner;

public class robinhoodandmajoroak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int start = n-k+1;
            int end = n;
            int oddcount = end-start+1/2;
            if(oddcount%2==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
