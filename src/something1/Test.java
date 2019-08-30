package something1;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
public class Test extends Date{
	public static void main(String[] args) {
		new Test().test();
	}
	public void test(){
		System.out.println(super.getClass().getName());
		System.out.println(getClass().getName());
		System.out.println(getClass().getSuperclass().getName());
		
	}
}
