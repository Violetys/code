package differentthis;

public class ThreadA extends Thread {
  private ObjectService objectService;
  public ThreadA(ObjectService objectService){
  super();
  this.objectService=objectService;
  }
  @Override
  public void run() {
  super.run();
  objectService.serviceMethodA();
  }
}