package syn;

public class main {

	public static void main(String[] args) {
		k k=new k();
		pop p1=new pop(k);
		push p2=new push(k);
		
			Thread t1=new Thread(p1);
			Thread t2=new Thread(p2);
			t1.start();
			t2.start();
//			t2.run();
		
	}
}
