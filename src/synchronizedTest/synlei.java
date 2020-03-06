package synchronizedTest;
/*
 * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种： 
		1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象； 
		2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象； 
		3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象； 
		4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。

 * */
//  Synchronized还可作用于一个类
/* class ClassName {
		public void method() {
		   synchronized(ClassName.class) {
		      // todo
		   }
		}
	}
*/
class SyncThread5 implements Runnable {
	   private static int count;
	   public SyncThread5() {
	      count = 0;
	   }

	   public static void method() {
	      synchronized(SyncThread5.class) {
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

	   public synchronized void run() {
	      method();
	   }
	}
public class synlei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncThread5 syn1=new SyncThread5();
		SyncThread5 syn2=new SyncThread5();
		Thread t1= new Thread(syn1,"syn1");
		Thread t2= new Thread(syn2,"syn2");
		t1.start();
		t2.start();
	}

}
//synchronized作用于一个类T时，是给这个类T加锁，T的所有对象用的是同一把锁
