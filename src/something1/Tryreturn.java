package something1;

public class Tryreturn {
  public int aaa() {
      int x = 1;
    	/*
			 * 如果try语句里有return，那么代码的行为如下：
					1.如果有返回值，就把返回值保存到局部变量中  （即x=2时）
					2.执行jsr指令跳到finally语句里执行
					3.执行完finally语句后，返回之前保存在局部变量表里的值
			 * 
			 * */
      try {
          return ++x;					//https://www.cnblogs.com/averey/p/4379646.html
          										//在 try 里 使用 return 还是会执行finally语句的（我们用debug的模式看到了程序会跳转到 finally语句里执行）
      } catch (Exception e) {

      } finally {
          ++x;
      }
      return x;
  }
  public  void finalize() {
  	System.out.println("gc");
  }
  public static void main(String[] args) {
  		Tryreturn t = new Tryreturn();
      int y = t.aaa();	
      System.out.println(y);
  }
}