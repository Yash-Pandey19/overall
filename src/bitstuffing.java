import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bitstuffing {

    public static void bitStuff(List<Character> data) {
        int count = 0;
        for (int i = 0; i < data.size(); i++) {
            count = (data.get(i) == '1') ? (count + 1) : 0;

            if (count == 5 && data.get(i + 1) == '1') {
                data.add(i + 1, '0');
                count = 0;
            }
        }
    }

    public static void deStuff(List<Character> data) {
        int count = 0;
        for (int i = 0; i < data.size(); i++) {
            count = (data.get(i) == '1') ? (count + 1) : 0;

            if (count == 5 && data.get(i + 1) == '0' && data.get(i + 2) == '1') {
                data.remove(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Data: ");
        String input = sc.nextLine();

        List<Character> data = new ArrayList<>();
        for (char c : input.toCharArray()) {
            data.add(c);
        }

        System.out.print("\nSender Input (before stuffing):     ");
        for (char bit : data) {
            System.out.print(bit);
        }
        System.out.println();

        bitStuff(data);

        System.out.print("Data in Transit (after stuffing):   ");
        for (char bit : data) {
            System.out.print(bit);
        }
        System.out.println();

        deStuff(data);
        System.out.print("Received Data (after de-stuffing):  ");
        for (char bit : data) {
            System.out.print(bit);
        }
        System.out.println();

        sc.close();
    }
}