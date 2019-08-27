package differentthis;


public class MainTest {
   public static void main(String[] args) {
       ObjectService service=new ObjectService();
       ThreadA a=new ThreadA(service);
       a.setName("a");
       a.start();
       ThreadB b=new ThreadB(service);
       b.setName("b");
       b.start();
       System.out.println("zzzz");
   }
}