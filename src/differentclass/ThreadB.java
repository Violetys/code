package differentclass;
/*
 * test1
 * 
 * */
//public class ThreadB extends Thread {
//	@Override
//	public void run() {
//		ObjectService.methodB();
//	}
//}


/*
 * test2
 * 
 * */

public class ThreadB extends Thread {
	private ObjectService objectService;
 
	public ThreadB(ObjectService objectService) {
		super();
		this.objectService = objectService;
	}
	@Override
	public void run() {
		objectService.methodB();
	}
}