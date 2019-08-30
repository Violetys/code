package something1;

import java.util.HashSet;
import java.util.Iterator;

public class hset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("one");
		String s2=new String("two");
		String s3=new String("three");
		HashSet hs=new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		Iterator i=hs.iterator();
		for(;i.hasNext();) {
			System.out.println(i.next());
		}
	}

}
