package differentclass;

/*
 * test1
 * 
 * */
//public class ThreadA extends Thread { 
//	@Override
//	public void run() {
//		ObjectService.methodA();
//	}
//}



/*
 * test2
 * 
 * */
public class ThreadA extends Thread {
	private ObjectService objectService;
 
	public ThreadA(ObjectService objectService) {
		super();
		this.objectService = objectService;
	}
	@Override
	public void run() {
		objectService.methodA();
	}
}