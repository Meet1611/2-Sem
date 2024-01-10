import java.util.*;

public class Stringpalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Input your : ");
        String s = sc.next();

        int start = 0;
        int end = s.length() - 1;
        int c = 0;

        if (s.length() % 2 == 0) {
            while (start < end) {
                if (s.charAt(start) == '-') {
                    start++;
                } else if (s.charAt(start) != s.charAt(end)) {
                    c = -1;
                    break;
                } else {
                    start++;
                    end--;
                }
            }

            if (c == 0) {
                System.out.println("Input is Palindrome");
            } else {
                System.out.println("Input is not Plalindrome");
            }
        }

        else {
            while (start <= end) {
                if (s.charAt(start) == '-') {
                    start++;
                } else if (s.charAt(start) != s.charAt(end)) {
                    c = -1;
                    break;
                } else {
                    start++;
                    end--;
                }
            }

            if (c == 0) {
                System.out.println("Input is Palindrome");
            } else {
                System.out.println("Input is not Plalindrome");
            }
        }
    }
}