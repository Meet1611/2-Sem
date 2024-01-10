import java.util.*;

public class Prime {
    static boolean prime(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

        if (prime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }
}
