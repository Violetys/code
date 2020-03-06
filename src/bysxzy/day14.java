package bysxzy;

import java.util.Scanner;
/**
 * 判断素数
 */
public class day14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			if(day14.isPrime(num)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}

		}
	}
	public static boolean isPrime(int n)
	{
		if (n < 2)
			return false;
			
		if (n == 2)
			return true;

		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2)

			if (n % i == 0)
				return false;

		return true;

	}
		

}
