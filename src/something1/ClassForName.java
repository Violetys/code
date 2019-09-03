package something1;

import java.util.Date;

class aaa{
	public aaa() {
		System.out.println("aaa!!!");
	}
	static {
		System.out.println("a!a!a!");
	}
}
public class ClassForName extends Date{
	public static void main(String[] args) throws ClassNotFoundException {
		new ClassForName().test();
	}
	public void test() throws ClassNotFoundException{
		System.out.println(Class.forName("something1.aaa"));
	}
}