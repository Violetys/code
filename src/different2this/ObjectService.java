package different2this;

//public class ObjectService {
//  private String uname;
//  private String pwd;
//  //String lock=new String();和放在方法内的不同 ，两个线程都持有此对象，
//  public void setUserNamePassWord(String userName,String passWord){
//      try {
//      	String lock=new String();
//          synchronized (lock) {
//              System.out.println("thread name="+Thread.currentThread().getName()
//+" 进入代码快:"+System.currentTimeMillis());
//              uname=userName;
//              Thread.sleep(3000);
//              pwd=passWord;
//              System.out.println("thread name="+Thread.currentThread().getName()
//+" 进入代码快:"+System.currentTimeMillis()+"入参uname:"+uname+"入参pwd:"+pwd);
//          }
//      } catch (InterruptedException e) {
//          e.printStackTrace();
//      }
//  }
//}

public class ObjectService {
  private String lock=new String();
  public void methodA(){
      try {
          //synchronized (this) { this会锁这个对象，所以执行A方法时B方法不可用
      		synchronized (lock) {
          System.out.println("a begin");
          Thread.sleep(3000);
          System.out.println("a end");
          }
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
  public synchronized void methodB(){
      System.out.println("b begin");
      System.out.println("b end");
  }
}
