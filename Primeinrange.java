import java.util.*;

public class Primeinrange {
    static boolean prime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }

        System.err.print("are Prime Numbers in given Range");
    }
}
