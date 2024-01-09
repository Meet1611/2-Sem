import java.util.*;

public class Percentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Marks of a SUbject : ");
        int total = sc.nextInt();

        int n1;
        do {
            System.out.print("Enter Marks of Subject 1 : ");
            n1 = sc.nextInt();
        } while (n1 > total || n1 < 0);

        int n2;
        do {
            System.out.print("Enter Marks of Subject 2 : ");
            n2 = sc.nextInt();
        } while (n2 > total || n2 < 0);

        int n3;
        do {
            System.out.print("Enter Marks of Subject 3 : ");
            n3 = sc.nextInt();
        } while (n3 > total || n3 < 0);

        int n4;
        do {
            System.out.print("Enter Marks of Subject 4 : ");
            n4 = sc.nextInt();
        } while (n4 > total || n4 < 0);

        int n5;
        do {
            System.out.print("Enter Marks of Subject 5 : ");
            n5 = sc.nextInt();
        } while (n5 > total || n5 < 0);

        double p = (((n1 + n2 + n3 + n4 + n5) / total) / 5.0) * 100;
        System.out.println(p);
        if (p >= 60) {
            System.out.println("First Division");
        } else if (p >= 50) {
            System.out.println("Second Division");
        } else if (p >= 40) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

    }
}
