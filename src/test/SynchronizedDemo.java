package test;

public class SynchronizedDemo implements Runnable {
	
  private static int count = 0;

  public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
          Thread thread = new Thread(new SynchronizedDemo());
          thread.start();
      }
      try { 
      	
          Thread.sleep(1000);  
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      System.out.println("result: " + count);
  }

  @Override
  public void run() {
  	synchronized (SynchronizedDemo.class) {  //不使用的话得不到1000000，因为多个线程同时访问count的时候前一个线程做+1操作前
  																								//另一个线程读取count，导致后一个线程+1后count只+1
  		  		
  		for (int i = 0; i < 1000000; i++)
        count++;
  	}
	}
      
}