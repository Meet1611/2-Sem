import java.util.*;

public class L42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Input : ");
        String in = sc.nextLine();

        int con = 0;
        int vow = 0;

        for (int i = 0; i < in.length(); i++) {
            char j = in.charAt(i);
            if (j == 'A' || j == 'I' || j == 'U' || j == 'E' || j == 'O' || j == 'a' || j == 'i' || j == 'u' || j == 'e'
                    || j == 'o') {
                vow++;
            } else if (j != ' ') {
                con++;
            }
        }

        System.out.println("number of Consonants and vowels are " + con + " and " + vow);
    }
}
