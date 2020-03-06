package bysxzy;

import java.util.Scanner;

/**
 * 十进制整数转二进制
 * 
 *
 */
public class day13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			day13.getErjinzhi(num);
		}
	}
	
	public static void getErjinzhi(int n) {
		String str = "";
		while (n != 0) {
			str = n % 2 + str;
			n = n / 2;
		}
		System.out.println(str);
	}
}
