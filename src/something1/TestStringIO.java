package something1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.hamcrest.core.Is;

public class TestStringIO {
  public static void main(String[] args) throws IOException {

      String s1 = "Java";				//字符串常量池存在于堆中
      String s2 = "从0到1";
      String s3 = s1 + s2;				//创建s3的时候会把S1,S2从字符串常量池复制到常量池以外的堆中然后创建S3
      String s4 = "Java从0到1";

      System.out.println(s3 == s4);		//常量池中没有这些对象的话，一共创建6个对象
      
      
      String s5=new String("violet");
      String s6=new String("violet");
      System.out.println(s5==s6);						
      System.out.println(s5.intern()==s6.intern());			//intern()返回字符串常量池中对象

    
      String s7="one,two,three,four,five";
      String [] result1 = s7.split(",");				// .split(",")   jdk的api自带函数，按","分割字符串
      System.out.println(result1[0]);
      
      String s8="1 2 3 4 5 6";
      String [] result2 = s8.split(" ");
      System.out.println(result2[0]+result2[1]+result2[2]);
      
      /*
       * 翻转字符串，选择其中部分子串不翻转，例如abcgfedhijklmn，选择defg，输出nmlkjihdefgcba
       * */
      String str1="abcdefghijklmn";
      String str11="defg";
      int indexof=str1.indexOf(str11);					//indexof找出子串出现的位置
      System.out.println(indexof);
      Stack stack=new Stack();
      for(int m=0;m<str1.length();m++) {
    	  if(m<indexof||m>(indexof+3)) {
    		  stack.push(str1.charAt(m));
    		  System.out.print(stack.peek());			//peek()查看栈顶元素，不移除
    	  }else {
    		  stack.push(str11.charAt(6-m));
    		  System.out.print(stack.peek());
    	  }   	  
      }
      System.out.println();
      while(!stack.isEmpty()) {							//输出栈中元素，后进先出
    	  System.out.print(stack.pop());
      }
      
      
   /*
    * scanner赋值
    * */   
      Scanner s = new Scanner(System.in);
  		String str2=s.next();
  		System.out.println(str2);
  
  		
  	/*
  	 * hashmap的使用
  	 * */	
     HashMap smap=new HashMap<>();
     int k=0;
			try {
				FileInputStream fis=new FileInputStream("D:\\Repository\\code\\src\\something1\\File.txt");
				try {					
					InputStreamReader isr = new InputStreamReader(fis);
					try {
						BufferedReader br=new BufferedReader(isr);
						String s9=null;
						while((s9=br.readLine())!=null) {
							String []sarr=s9.split(",");
							if(!smap.containsValue(sarr[1])) {
									smap.put(sarr[1].hashCode(), sarr[1]);
							}else {
								k++;		//若要统计重复有哪些可以再用集合存起来
							}
						}
					}finally {
					}
				}finally {					
				}
			} finally{				
			}
			//smap.put(1143448, "asda");
			Set set=smap.entrySet();		//entryset   返回的是一个视图，当我们改变map的数据，set也会变。key和value
			
			set.add("sss");					//不能改变set
			
			smap.put(1143448, "asda");		//改变map数据  赵六覆盖
			Iterator iterator=set.iterator();
			for(;iterator.hasNext();) {
				System.out.println(iterator.next());
			}
			System.out.println(k);
      
			
			
			
			
  }
}
