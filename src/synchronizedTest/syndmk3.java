package synchronizedTest;
/*
 * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种： 
		1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象； 
		2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象； 
		3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象； 
		4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。

 * */
	/*
	 * 修改一个代码块--指定要给某个对象加锁
	 * */
/**
 * 银行账户类
 */
class Account {
   String name;
   float amount;

   public Account(String name, float amount) {
      this.name = name;
      this.amount = amount;
   }
   //存钱
   public  void deposit(float amt) {
      amount += amt;
      try {
         Thread.sleep(100);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
   //取钱
   public  void withdraw(float amt) {
      amount -= amt;
      try {
         Thread.sleep(100);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   public float getBalance() {
      return amount;
   }
}

/**
 * 账户操作类
 */
class AccountOperator implements Runnable{
   private Account account;
   public AccountOperator(Account account) {
      this.account = account;
   }

   public void run() {
      synchronized (account) {
         account.deposit(500);
         account.withdraw(500);
         System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
      }
   }
}

public class syndmk3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("zhang san", 10000.0f);
		AccountOperator accountOperator = new AccountOperator(account);

		final int THREAD_NUM = 5;
		Thread threads[] = new Thread[THREAD_NUM];
		for (int i = 0; i < THREAD_NUM; i ++) {
		   threads[i] = new Thread(accountOperator, "Thread" + i);
		   threads[i].start();
		}

	}

}
/*
 * 	在AccountOperator 类中的run方法里，我们用synchronized 给account对象加了锁。这时，当一个线程访问account对象时，其他试图访问account对象的线程将会阻塞，直到该线程访问account对象结束。也就是说谁拿到那个锁谁就可以运行它所控制的那段代码。 
	当有一个明确的对象作为锁时，就可以用类似下面这样的方式写程序。
	public void method3(SomeObject obj)
	{
	   //obj 锁定的对象
	   synchronized(obj)
	   {
	      // todo
	   }
	}
	
	当没有明确的对象作为锁，只是想让一段代码同步时，可以创建一个特殊的对象来充当锁：
	class Test implements Runnable
	{
	   private byte[] lock = new byte[0];  // 特殊的instance变量
	   public void method()
	   {
	      synchronized(lock) {
	         // todo 同步代码块
	      }
	   }
	
	   public void run() {
	
	   }
	}

 * 
 * 
 * */
