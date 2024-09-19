import java.util.Scanner;

public class CRC {

    // XOR operation between two binary strings
    static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }
    static String mod2Divide(String dividend, String divisor) {
        int divisorLength = divisor.length();
        StringBuilder tmp = new StringBuilder(dividend.substring(0, divisorLength));

        for (int i = divisorLength; i < dividend.length(); i++) {

            if (tmp.charAt(0) == '1') {
                tmp = new StringBuilder(xor(tmp.toString(), divisor));
            } else {
                tmp = new StringBuilder(xor(tmp.toString(), "0".repeat(divisorLength)));
            }
            tmp.append(dividend.charAt(i));
            tmp.setLength(divisorLength);
        }
        if (tmp.charAt(0) == '1') {
            tmp = new StringBuilder(xor(tmp.toString(), divisor));
        } else {
            tmp = new StringBuilder(xor(tmp.toString(), "0".repeat(divisorLength)));
        }

        return tmp.toString();
    }
    static String encode(String data, String key) {
        String appendedData = data + "0".repeat(key.length() - 1);
        return data + mod2Divide(appendedData, key);
    }
    static boolean check(String receivedData, String key) {
        return mod2Divide(receivedData, key).contains("1");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        String data = scanner.nextLine();
        System.out.print("Enter key: ");
        String key = scanner.nextLine();
        String encodedData = encode(data, key);
        System.out.println("Encoded Data: " + encodedData);
        boolean hasError = check(encodedData, key);
        System.out.println(hasError ? "Data received correctly" : "Error in received data");

        scanner.close();
    }
}
