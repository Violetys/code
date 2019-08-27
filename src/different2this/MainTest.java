package different2this;

public class MainTest {
  public static void main(String[] args) {
      ObjectService service=new ObjectService();
      ThreadB b=new ThreadB(service);
      b.setName("B");
      b.start();
      ThreadA a=new ThreadA(service);
      a.setName("A");
      a.start();
      
  }
}
