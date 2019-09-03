package something1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		
		
		int[] sz= {1,2,3,4,4,5,6,7,7,7,7,10,8,9};
		Set szz=new HashSet();								//利用set不能重复的性质找出数组中重复的数字
		Set szf=new HashSet();
		for(int k=0 ;k<sz.length;k++) {
			//System.out.println(szz.add(sz[k]));
			if(!szz.add(sz[k])) {
				if(szf.add(sz[k])) {							//避免重复输出
					System.out.println(sz[k]);
				}
			}
		}
		
	}

}
