package something1;

public class SingleTon {
	private SingleTon(){}//实例化放在静态代码块里可提高程序的执行效率，但也可能更占用空间
	private final static SingleTon instance =new SingleTon();
	public static SingleTon getInstance(){
		return instance;
	}
}

