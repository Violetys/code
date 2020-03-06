package something1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/*海康威视面试时问的问题
 * 重写hashCode和equals方法使hashcode返回随机数，eqauls返回真，是否可以插入set中
 * 不一定，计算hashcode（）的时候如果随机数不相等就可以
 * 
 * */
class A{
	public int hashCode() {
		return (int)(Math.random()*100+1);
		//return 1;
	}
	public boolean equals(Object o) {			//重写的形参注意
		return true;
		
	}
}



public class Hikvision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		A a2=new A();
		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		
		HashSet hmap=new HashSet<>();
		hmap.add(a1);
		hmap.add(a2);
		
		
//		HashMap hmap=new HashMap<>();
//		hmap.put(a1,1);
//		hmap.put(a2,2);
//		
		
		//System.out.println(hmap.put(a2,2));
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		Iterator i=hmap.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next().toString());
//		}
		System.out.println(hmap);
	}

}
