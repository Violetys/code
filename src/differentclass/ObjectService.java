package differentclass;
/*
 * test1
 * 
 * */
//public class ObjectService {
//  public synchronized static void methodA(){		//synchronized应用在static方法上，那是对当前对应的*.Class进行持锁。
//      try {
//          System.out.println("static methodA begin 线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
//          Thread.sleep(3000);
//          System.out.println("static methodA end 线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
//      } catch (InterruptedException e) {
//          e.printStackTrace();
//      }
//  }
//  public synchronized static void methodB(){
//      System.out.println("static methodB begin 线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
//      System.out.println("static methodB end 线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
//  }
//}


/*
 * test2
 * 
 * */
public class ObjectService {
	public void methodA(){
		try {
			synchronized (ObjectService.class) {
				System.out.println("methodA begin 线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
				Thread.sleep(3000);
				System.out.println("methodA end   线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void methodB(){
		synchronized (ObjectService.class) {
			System.out.println("methodB begin 线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
			System.out.println("methodB end   线程名称:"+Thread.currentThread().getName()+" times:"+System.currentTimeMillis());
		}
	}
}