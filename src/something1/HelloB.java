package something1;
/*
 * 上面吧main入口放在B类中，对象的初始化顺序：
 * （1）类加载之后，按从上到下（从父类到子类）执行被static修饰的语句；
 * （2）当static语句执行完之后,再执行main方法；
 * （3）如果有语句new了自身的对象，将从上到下执行构造代码块、构造器（两者可以说绑定在一起）。
 * 下面代码把main放在AB类之外
 * 
 * */
class HelloA { 
	public HelloA() {
		System.out.println("HelloA");
	}

	{ 
		System.out.println("I'm A class"); 
	} 
	static { 
		System.out.println("static A"); 
	}

	} 
public class HelloB extends HelloA { 
	public HelloB() {
		System.out.println("HelloB");
	}

	{ 
		System.out.println("I'm B class"); 
	} 
	static { 
		System.out.println("static B"); 
	} 
	public static void main(String[] args) { 
		System.out.println("main start");
		System.out.println("5" + 2);		//输出52，Java会自动将2转换为字符串。
		new HelloB(); 
		System.out.println("main end");
	}

}



//class HelloA { 
//	public HelloA() {
//  	System.out.println("HelloA");
//	}
//
//	{ 
//		System.out.println("I'm A class"); 
//	} 
//	static { 
//		System.out.println("static A"); 
//	}
//
//} 
//class HelloB extends HelloA { 
//	public HelloB() {
//		System.out.println("HelloB");
//	}
//
//	{ 
//		System.out.println("I'm B class"); 
//	} 
//	static { 
//		System.out.println("static B"); 
//	} 
//}
//public class ClassStatic{
//	public static void main(String[] args) { 
//		System.out.println("main start");
//		new HelloB(); 
//		System.out.println("main end");
//	}
//}
