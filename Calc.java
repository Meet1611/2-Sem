import java.util.*;

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		double n1 = sc.nextDouble();

		System.out.print("Enter Second Number : ");
		double n2 = sc.nextDouble();

		double div = n1 / n2;

		System.out.print("Enter Operation you want to perform : ");
		char ops = sc.next().charAt(0);

		switch (ops) {
			case '+':
				System.out.println(n1 + n2);
				break;

			case '-':
				System.out.println(n1 - n2);
				break;

			case '*':
				System.out.println(n1 * n2);
				break;

			case '/':
				System.out.println(n1 / n2);
				break;

			case '%':
				System.out.println(n1 % n2);
				break;
			default:
				break;
		}
	}
}