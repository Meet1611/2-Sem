import java.util.*;

public class L43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[];
        arr = new int[4];

        double avg = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter : arr[" + i + "] : ");
            arr[i] = sc.nextInt();

            sum += arr[i];
        }

        avg = sum / 4;

        System.out.println("Average of elements is : " + avg);
    }
}
