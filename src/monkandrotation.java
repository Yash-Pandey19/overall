import java.util.Scanner;

public class monkandrotation {
    public static void rotateArray(int[] array, int N, int K) {
        K = K % N;
        for (int i = N - K; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < N - K; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }
            rotateArray(array, N, K);
        }
    }
}
