package something1;

public class Outer{
	int out_x = 0;
	public void method(){
		Inner1 inner1 = new Inner1();
		class Inner2{//在方法体内部定义的内部类
		public void method(){
			out_x = 3;
			}
		}
		Inner2 inner2 = new Inner2();
		}
	public  class Inner1{
	//public static class Inner1{  //加上static 变成Static nested class
		
		
	} //在方法体外面定义的内部类
	
}
