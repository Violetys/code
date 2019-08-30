package something1;

import something1.Outer.Inner1;

public class TestOuter {
	public static void main(String[] args) {
		Outer outer = new Outer();
		//outer.Inner1 inner1 = outer.new Inner1();
		
		
		/*方法外内部类加上static后就变成static nested class，在外面不需要创建外部类的实例对象
		 * 它不再具有内部类的特性，所有，从狭义上讲，它不是内部类。
		 * *Static Nested Class与普通类在运行时的行为和功能上没有什么区别
		 */
		//Inner1 inner1 = new Inner1();		
		
		}
}
