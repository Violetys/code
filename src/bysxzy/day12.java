package bysxzy;
import java.util.Scanner;
/**
 * 各位数之和
 *
 */
public class day12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			System.out.println("各位数之和=" + day12.getSum(num));
		}

	}

	public static int getSum(int a) {
		int n = a % 10;
		a = a - n;
		int m = a / 10;
		int sum = 0;
		sum = sum + n;
		while (m != 0) {
			sum = sum + m % 10;
			m = m / 10;
		}
		return sum;
	}

}
