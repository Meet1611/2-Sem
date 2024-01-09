import java.util.*;

public class AreaofCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle : ");
        double r = sc.nextDouble();

        double Area = 3.14 * r * r;

        System.out.println(Area);
    }
}
