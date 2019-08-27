package syn;

public class k {
	public int k=0;
	private boolean isempty=true;
	public synchronized void push() {
		try {
			while(isempty) {			
				this.wait();			
			}
			Thread.sleep(1000);
			k--;
			System.out.println("push k="+k);
			isempty=true;
			this.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void pop() {
		try {
			while(!isempty) {			
				this.wait();			
			}
			Thread.sleep(1000);
			k++;
			System.out.println("pop k="+k);
			isempty=false;
			this.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
