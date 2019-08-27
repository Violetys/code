package syn;

public class push implements Runnable{
	//public static int[] k= {1};
	k k=null;
	public push(k k) {
		this.k=k;
	}
	
	public void run() {		
		System.out.println("push");
		for(int i=0;i<10;i++) {
			k.push();		
		}
	}
}
