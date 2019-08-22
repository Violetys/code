package test;

import java.util.ArrayList;
import java.util.List;

public class synchronizedTest implements Runnable {
  //共享资源
  static int i =0;
  /**
   * synchronized 修饰实例方法
   */
  public synchronized void increase(){
      i++;
  }
  
  @Override
  public void run(){
      for (int j =0 ; j<10000;j++){   		
          increase();
      }
  }

  public void show() {
  	System.out.println(i);
  }
  
  public static void main(String[] args) throws InterruptedException {
  	List l=new ArrayList();
    synchronizedTest test = new synchronizedTest();
    Thread t1 = new Thread(test);
    Thread t2 = new Thread(test);
    
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    test.show();
}
}
