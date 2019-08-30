package something1;

public class JBSJLX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final StringBuffer a=new StringBuffer("immutable");
	//	a=new StringBuffer("");
			a.append(" broken!");
			String s = "123";
		  byte b=1;
		  long l=1;
		  short sh=1;
		  double d=1.0;
		  float f=(float) 0.1;
		  int i=2<<3;
		  int i1=2147483647+1;
		  int i2=0b01111111111111111111111111111111;
		  long l1=(long) 9223372036854775806L;  //加上L不然默认int
		  System.out.println(i1);
		  System.out.println(i2);
		  System.out.println(0x7fffffff);
		  System.out.println(l1);
//		  switch(s) {
//		  	
//		  }
//		  
		  
	}

}
