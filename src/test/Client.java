package test;

import org.junit.Test;

public class Client {

  @Test
  public void test1() throws InterruptedException {

      // 1. ThreadTest1 继承自 Thread 并且重写了 run（）
      // 2. 但是 ThreadTest1 在 run（） 上加了 synchronized
      // 3. 这样并不能达到同步的目的
      // 4. 因为 synchronized 把锁加在了当前执行的线程对象上
      // 5. 也就是说，这里创建的10条线程分别都可以拿到自身对象上的锁
      // 6. 所以并不能达到同步的目的

      for (int i = 0; i < 10; i++) {
          Thread thread = new ThreadTest1("thread->" + i);
          thread.start();
      }

      //为了让测试内容代码跑完
      Thread.sleep(10000L);
  }

  @Test
  public void test2() throws InterruptedException {

      // 1. 与test1不同， ThreadTest2 有一个成员变量lock（这里只是取名为'锁'，也可以取其它名字哦），可以通过有参构造到初始化
      // 2. 这里定义一个字符串 String str = "所有线程都可以访问， 但唯一的一个字符串"， 并且把它传给了每一个后续创建出来的线程
      // 3. ThreadTest2 的 run（）中是一个代码块 :synchronized(lock), 意思是把 lock 这个字符串对象加锁，然后执行代码逻辑
      // 4. 因为创建的10个线程的 lock 都引用同一个字符串 str， 所以在并发情况下，一旦 str 这个字符串被加锁，别的线程要访问它只能等待
      // 5. 所以最终形成同步

      String str = "所有线程都可以访问， 但唯一的一个字符串";
      for (int i = 0; i < 10; i++) {
          Thread thread = new ThreadTest2("thread->" + i, str);
          thread.start();
      }

      //为了让测试内容代码跑完
      Thread.sleep(10000L);
  }

  @Test
  public void test3() throws InterruptedException {

      // 1. ThreadTest3 继承自 Thread， 并重写了 run（）, 但它的run（）里跑的是 TestCode 这个类的一个静态方法
      // 2. 静态方法上的 synchronized 给类的 class 对象加了锁
      // 3. 所以最终同步
      for (int i = 0; i < 10; i++) {
          Thread thread = new ThreadTest3("thread->" + i);
          thread.start();
      }

      //为了让测试内容代码跑完
      Thread.sleep(10000L);
  }
}

class ThreadTest1 extends Thread {


  public ThreadTest1(String name) {
      super(name);
  }

  public synchronized void run() {
      new TestCode().objectRun();
  }
}

class ThreadTest2 extends Thread {

  private String lock;

  public ThreadTest2(String name, String lock) {
      super(name);
      this.lock = lock;
  }

  public void run() {
      synchronized (lock) {
          new TestCode().objectRun();
      }
  }
}

class ThreadTest3 extends Thread {

  public ThreadTest3(String name) {
      super(name);
  }

  public void run() {
      TestCode.staticRun();
  }
}

class TestCode {

  public void objectRun() {
      for (int i = 0; i < 100; i++) {
          System.out.println(Thread.currentThread().getName() + ": " + i);
          try {
              Thread.sleep(1);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }

  public synchronized static void staticRun() {
      for (int i = 0; i < 100; i++) {
          System.out.println(Thread.currentThread().getName() + ": " + i);
          try {
              Thread.sleep(1);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}


