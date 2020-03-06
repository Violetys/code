package synchronizedTest;


/*
 * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种： 
		1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象； 
		2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象； 
		3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象； 
		4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。

 * */
/**
 * 修饰一个代码块
 */
class SyncThread implements Runnable {
   private static int count;

   public SyncThread() {
      count = 0;
   }
   public  void run() {
      synchronized(this) {										//同步代码块
         for (int i = 0; i < 5; i++) {
            try {
               System.out.println(Thread.currentThread().getName() + ":" + (count++));
               Thread.sleep(100);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
   }

   public int getCount() {
      return count;
   }
}
public class syndmk1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncThread syncThread = new SyncThread();				//
		Thread thread1 = new Thread(syncThread, "SyncThread1");
		Thread thread2 = new Thread(syncThread, "SyncThread2");
		thread1.start();
		thread2.start();
		/*	SyncThread1:0 
			SyncThread1:1 
			SyncThread1:2 
			SyncThread1:3 
			SyncThread1:4 
			SyncThread2:5 
			SyncThread2:6 
			SyncThread2:7 
			SyncThread2:8 
			SyncThread2:9

		 * */
		
//		Thread thread1 = new Thread(new SyncThread(), "SyncThread1");
//		Thread thread2 = new Thread(new SyncThread(), "SyncThread2");
//		thread1.start();
//		thread2.start();
		/*	SyncThread1:0 
			SyncThread2:1 
			SyncThread1:2 
			SyncThread2:3 
			SyncThread1:4 
			SyncThread2:5 
			SyncThread2:6 
			SyncThread1:7 
			SyncThread1:8 
			SyncThread2:9
		这样相当于是两个不同的对象，所以没有像上面一样
		 * */
	
	}

}
