package something1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		String [][]s= {{"xys","123456"},{"xc","xy9811xc"},{"violet","xys9811"}};
		for(int i=0;i<s.length;i++) {
			//for(int l=0;l<s[i].length;)
			map.put(s[i][0], s[i][1]);
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(map.get(s[i][0]));
		}
		System.out.println(map.size());
		
		Collection l=new ArrayList();
		l=map.values();				
		Iterator i=l.iterator();
		for(;i.hasNext();) {
			System.out.println(i.next());
		}
		int a=2;
		assert a==6;
		System.out.println("zzzz");
		
	}
}
