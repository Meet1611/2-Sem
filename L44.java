import java.util.*;

public class L44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int s = sc.nextInt();

        int arr[] = new int[s];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter : arr[" + i + "] : ");
            arr[i] = sc.nextInt();

        }

        System.out.print("Array in reverse order : ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
