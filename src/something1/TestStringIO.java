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
import java.util.Set;

import org.hamcrest.core.Is;

public class TestStringIO {
  public static void main(String[] args) throws IOException {

      String s1 = "Java";				//字符串常量池存在于堆中
      String s2 = "从0到1";
      String s3 = s1 + s2;			//创建s3的时候会把S1,S2从字符串常量池复制到常量池以外的堆中然后创建S3
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
      
      
      
     HashMap smap=new HashMap<>();
     int k=0;
			try {
				FileInputStream fis=new FileInputStream("D:\\esendev\\gitrepos4.8\\code\\src\\something1\\File.txt");
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
			Set set=smap.entrySet();		//entryset  key和value
			Iterator iterator=set.iterator();
			for(;iterator.hasNext();) {
				System.out.println(iterator.next());
			}
			System.out.println(k);
      
  }
}
