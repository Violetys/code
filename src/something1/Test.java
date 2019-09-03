package something1;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Test extends Date{
	public static void main(String[] args) throws ClassNotFoundException {
		new Test().test();
	}
	public void test() throws ClassNotFoundException{
		System.out.println(super.getClass().getName());
		System.out.println(getClass().getName());
		System.out.println(getClass().getSuperclass().getName());

	}
}
