package differentclass;
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
		ObjectService service1=new ObjectService();  //实例化两个对象，同步synchronized(*.class)代码块的作用其实和synchronized static方法作用一样。
																									//Class锁对类的所有对象实例起作用
		ObjectService service2=new ObjectService();
		ThreadA a=new ThreadA(service1);
		a.setName("A");
		a.start();
		ThreadB b=new ThreadB(service2);
		b.setName("B");
		b.start();
	}
}