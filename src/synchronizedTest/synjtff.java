package synchronizedTest;
/*
 * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种： 
		1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象； 
		2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象； 
		3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象； 
		4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。

 * */
/*
 * 我们知道静态方法是属于类的而不属于对象的。同样的，synchronized修饰的静态方法锁定的是这个类的所有对象。
 * */
class SyncThread4 implements Runnable {
	   private static int count;

	   public SyncThread4() {
	      count = 0;
	   }

	   public synchronized static void method() {
	      for (int i = 0; i < 5; i ++) {
	         try {
	            System.out.println(Thread.currentThread().getName() + ":" + (count++));
	            Thread.sleep(100);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	   public void mm() {
		   for (int i = 0; i < 5; i ++) {
		         try {
		            System.out.println(Thread.currentThread().getName() + ":" + (count++));
		            Thread.sleep(100);
		         } catch (InterruptedException e) {
		            e.printStackTrace();
		         }
		      }
	   }
	   public synchronized void run() {
	      method();
		  // mm();
	   }
}

public class synjtff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncThread4 syncThread1 = new SyncThread4();
		SyncThread4 syncThread2 = new SyncThread4();
		Thread thread1 = new Thread(syncThread1, "SyncThread1");
		Thread thread2 = new Thread(syncThread2, "SyncThread2");
		thread1.start();
		thread2.start();

	}

}
/* syncThread1和syncThread2是SyncThread的两个对象，但在thread1和thread2并发执行时却保持了线程同步。
 * 这是因为run中调用了静态方法method，而静态方法是属于类的，所以syncThread1和syncThread2相当于用了同一把锁。
 * 
 * 
 * */
