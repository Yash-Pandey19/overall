import java.util.Scanner;
public class robinhoodgold {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int test = 0; test < t; test++) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int robinGold = 0;
                int peopleHelped = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] >= k) {
                        robinGold += a[i];
                    } else if (a[i] == 0 && robinGold > 0) {
                        peopleHelped++;
                        robinGold--;
                    }
                }
                System.out.println(peopleHelped);
            }

            sc.close();
        }
    }


