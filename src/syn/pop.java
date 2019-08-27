package syn;

public class pop implements Runnable{
	k k=null;
	public pop(k k) {
		this.k=k;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("pop");
		for(int i=0;i<10;i++) {
			k.pop();
		}
	}
}
