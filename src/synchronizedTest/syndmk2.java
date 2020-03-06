package synchronizedTest;
/*
 * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种： 
		1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象； 
		2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象； 
		3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象； 
		4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。

 * */

/*
 * 修饰一个代码块----当一个线程访问对象的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该对象中的非synchronized(this)同步代码块
 * 
 * */
class Counter implements Runnable{
	   private int count;

	   public Counter() {
	      count = 0;
	   }

	   public void countAdd() {
	      synchronized(this) {
	         for (int i = 0; i < 5; i ++) {
	            try {
	               System.out.println(Thread.currentThread().getName() + ":" + (count++));
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }

	   //非synchronized代码块，未对count进行读写操作，所以可以不用synchronized
	   public void printCount() {
	      for (int i = 0; i < 5; i ++) {
	         try {
	            System.out.println(Thread.currentThread().getName() + " count:" + count);
	            Thread.sleep(100);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	   public void run() {
	      String threadName = Thread.currentThread().getName();
	      if (threadName.equals("A")) {
	         countAdd();
	      } else if (threadName.equals("B")) {
	         printCount();
	      }
	   }
	}

public class syndmk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		Thread thread1 = new Thread(counter, "A");
		Thread thread2 = new Thread(counter, "B");
		thread1.start();
		thread2.start();
/*
 * 上面代码中countAdd是一个synchronized的，printCount是非synchronized的。
 * 从结果中可以看出一个线程访问一个对象的synchronized代码块时，别的线程可以访问该对象的非synchronized代码块而不受阻塞。
 * 
 * */
	}

}
