import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str) {
        if (str.length() > 1) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                str = str.substring(1, str.length() - 1);
                return palindrome(str);
            } else {
                return false;
            }
        }
        return true;
    }
}