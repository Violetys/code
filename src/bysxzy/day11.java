package  bysxzy;
import  java.util.Scanner;
/*
 * 
 * 三个数选最大
 * 
 * */
public  class  day11  {
	public  static  void  main(String[]  args)  {
	  Scanner sc=new Scanner(System.in);
	  int x= sc.nextInt();
	  int y= sc.nextInt();
	  int z= sc.nextInt();
	  int max=x;
	  if(y>max) {
		  max=y;  
	  }
	  if(z>max) {
		  max=z;  
	  }
	  System.out.println(max);   
	}
}