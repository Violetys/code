package ZJshiyan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


//3. 给定一个非空的整数集合，返回其中出现频率前 k 高的元素。
//例如：输入: [1,1,1,2,2,3], k = 2时，输出[1,2]；
//要求：输出存储在ArrayList<Integer>，每个整数频率存储在HashMap<Integer,Integer>中
//
public class shiyan3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer> ();
		List<Integer> list1=new ArrayList<Integer> ();
		List<Integer> result=new ArrayList<Integer> ();
	  	Integer i1=new Integer(1);
	  	Integer i2=new Integer(1);
	  	Integer i3=new Integer(1);
	  	Integer i4=new Integer(2);
	  	Integer i5=new Integer(2);
	  	Integer i6=new Integer(3);
	  	
	  	list.add(i1);
	  	list.add(i2);
	  	list.add(i3);
	  	list.add(i4);
	  	list.add(i5);
	  	list.add(i6);
	  	
	  	//键入K
	  	Scanner s = new Scanner(System.in);
	  	int k=s.nextInt();
  		
	  	//键是整数，值是频率
	    HashMap<Integer,Integer> smap=new HashMap<Integer,Integer>();
	    Integer num=new Integer(0);
	    
	    while(!list.isEmpty()) {
	    	if(!smap.containsKey(list.get(0))) {
	    		num=1;						//若hashmap中不存在这个键则初始化频率为1
	 			smap.put(list.get(0), num);
	 			list.remove(0);	 			//移除list中这个数字
	 		}else {
	 			num=smap.get(list.get(0));  //获取这个数字已经出现的频率
	 			num++;						//若要统计重复有哪些可以再用集合存起来
	 			smap.put(list.get(0), num);	//更新数字频率
	 			list.remove(0);				//移除list中这个数字
	 		}	
	    }
	    
	    System.out.println(smap);
	    //获取smap的值，并存入list
	    Collection c=smap.values();	
	    //System.out.println(c);
		Iterator iterator=c.iterator();
		for(;iterator.hasNext();) {
			list1.add((Integer) iterator.next());			
		}
			
		//Collections工具类从大到小排序list
		Collections.sort(list1);
		Collections.reverse(list1);
		
		//取出前K大的数
		for(int i=0;i<k;i++) {
			Integer integer=list1.get(i);		//获取K
			//根据k值来取键
			for(HashMap.Entry entry:smap.entrySet()){
			    if(integer.equals(entry.getValue())){
			    	result.add((Integer) entry.getKey());
			    }   		
			}
			
		}
		
		System.out.println(result);
	}

}
