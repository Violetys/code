package something1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		//Map map1=Collections.synchronizedMap(map);  //     使用collection的方法让hashmap线程安全
		String [][]s= {{"xys","123456"},{"xc","xy9811xc"},{"violet","xys9811"}};
		for(int i=0;i<s.length;i++) {
			//for(int l=0;l<s[i].length;)
			map.put(s[i][0], s[i][1]);
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(map.get(s[i][0]));
		}
		System.out.println(map.size());
		
		Set hs=map.entrySet();        //获取内部entry数组
		Iterator is=hs.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		Collection l=new ArrayList();
		l=map.values();				//获取map的值
		Iterator i=l.iterator();
		System.out.println("");
		for(;i.hasNext();) {
			System.out.println(i.next());
		}
		int a=2;
		assert a==6;
		System.out.println("zzzz");
		
	}
}
