import java.util.*;

public class maxof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int n2 = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(n1 + " is Maximum");
            } else {
                System.out.println(n3 + " is Maximum");
            }
        } else {
            if (n2 > n3) {
                System.out.println(n2 + " is Maximum");
            } else {
                System.out.println(n3 + " is Maximum");
            }
        }
    }
}
