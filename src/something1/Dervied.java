package something1;
/*
 * 在new Dervied()的时候会先调用父类构造方法，在父类构造方法中的tellname(),
 * printname()方法因为多态会调用子类的方法实现，但是此时子类name变量还没初始化
 * 所以会输出null。。。然后调用完父类构造函数后调用子类构造函数，此时name已经被
 * 初始化了，所以输出为dervied
 * 
 * 
 * 类的初始化顺序：父类静态变量和静态代码块-->子类静态变量和静态代码块-->父类普通成员变量和代码块
 * -->父类构造方法-->子类普通成员变量和代码块-->子类构造方法
 * */
public class Dervied extends Base { 
  private String name = "dervied"; 
  public Dervied() {
        tellName();
        printName();
  } 
  public void tellName() {
  	System.out.println("Dervied tell name: " + name);
  }
  public void printName() {
  	System.out.println("Dervied print name: " + name);
  } 
	public static void main(String[] args){ 
		new Dervied();    
	}
} 
class Base { 
	private String name = "base"; 
	public Base() {
	  tellName();
	  printName();
	} 
	public void tellName() {
		System.out.println("Base tell name: " + name);
	} 
	public void printName() {
		System.out.println("Base print name: " + name);
	}
}