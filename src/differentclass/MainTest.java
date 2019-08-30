package differentclass;

import java.util.HashMap;
import java.util.Map;

/*
 * test1
 * 
 * */
//public class MainTest {
//	public static void main(String[] args) {
//		ThreadA a=new ThreadA();
//		a.setName("A");
//		a.start();
//		ThreadB b=new ThreadB();
//		b.setName("B");
//		b.start();
//	}
//}


/*
 * test2
 * 
 * */
public class MainTest {
	public static void main(String[] args) {
	/*实例化两个对象，同步synchronized(*.class)代码块的作用其实和synchronized static
		*方法作用一样。Class锁对类的所有对象实例起作用
		*/
		HashMap map=new HashMap();
		ObjectService service1=new ObjectService();  
		ObjectService service2=new ObjectService();
		System.out.println(service1.hashCode());
		map.put(service1.hashCode(),service1);
		ObjectService o=(ObjectService) map.get(service1.hashCode());
		StringBuilder s=new StringBuilder();
		s.append("xxx");
		System.out.println(s);
		ThreadA a=new ThreadA(service1);
		a.setName("A");
		a.start();
		s.append("zzz");
		System.out.println(s);
		ThreadB b=new ThreadB(service2);
		b.setName("B");
		b.start();
		ThreadB c=new ThreadB(o);
		c.setName("C");
		c.start();
	}
}