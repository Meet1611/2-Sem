import java.util.*;

public class L45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input : ");
        String in = sc.nextLine();

        int i = 0;
        int len = 0;
        char arr[] = new char[in.length() + 1];

        for (int j = 0; j < in.length(); j++) {
            arr[j] = in.charAt(j);
        }

        while (arr[i] != '\0') {
            len++;
            i++;
        }

        System.out.print("Second half of input : ");

        for (int j = in.length() / 2; j < in.length(); j++) {
            System.out.print(in.charAt(j));
        }
    }
}
