import java.util.Scanner;

public class Selectionsort {
    static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            int min = i ;
            for(int j = i+1; j < n ;j++){
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

    }
    static void printarray(int[]arr){
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array:");
        printarray(arr);
        System.out.println();
        selectionsort(arr);
        System.out.println("Sorted Array:");
        printarray(arr);

    }
}
