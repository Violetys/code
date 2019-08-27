package xxxx;

public class Consumer implements Runnable{
  //共享资源对象
  Person p = null;
  public Consumer(Person p) {
      this.p = p;
  }
   
  @Override
  public void run() {
      for(int i = 0 ; i < 50 ; i++){
          //消费对象
          p.pop();
      }
  }
}