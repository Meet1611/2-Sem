import java.util.*;

public class FtoC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit : ");
        double f = sc.nextDouble();

        double c = ((f - 32) * 5) / 9;

        System.out.println("Temparature in Celsius is " + c);
    }
}
