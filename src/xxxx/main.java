package xxxx;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Consumer c=new Consumer(p);
		Producer pr=new Producer(p);
		Thread t1=new Thread (c);
		Thread t2=new Thread(pr);
		t1.start();
		t2.start();
	}

}
