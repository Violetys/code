package ZJshiyan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

//
//1.已知有十六支国家足球队参加世界杯。写一个程序，把这16支球队随机分为4个组。
//要求：使用随机数，16只球队放在List<String>中，4个分组存储在Map<String, List<String>>中，其中第一个参数String是分组号，第二个参数List<String>存放该组的4个球队。

public class shiyan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;				//随机数
		int num=0;				//已分组队伍数量
		
		Random rand = new Random();
		String t1=new String("A");
		String t2=new String("B");
		String t3=new String("C");
		String t4=new String("D");
		String t5=new String("E");
		String t6=new String("F");
		String t7=new String("G");
		String t8=new String("H");
		String t9=new String("I");
		String t10=new String("J");
		String t11=new String("K");
		String t12=new String("L");
		String t13=new String("M");
		String t14=new String("N");
		String t15=new String("O");
		String t16=new String("P");
		
		List<String> tlist=new ArrayList();
		List<String> tlist1=new ArrayList();
		List<String> tlist2=new ArrayList();
		List<String> tlist3=new ArrayList();
		List<String> tlist4=new ArrayList();
		Map<String, List<String>> tgroup=new HashMap();
		
		tlist.add(t1);
		tlist.add(t2);
		tlist.add(t3);
		tlist.add(t4);
		tlist.add(t5);
		tlist.add(t6);
		tlist.add(t7);
		tlist.add(t8);
		tlist.add(t9);
		tlist.add(t10);
		tlist.add(t11);
		tlist.add(t12);
		tlist.add(t13);
		tlist.add(t14);
		tlist.add(t15);
		tlist.add(t16);
		
		while(!tlist.isEmpty()) {			
			if(num<4) {
				//随机数设置动态范围
				random =rand.nextInt((15-num)- 0 + 1);				
				tlist1.add(tlist.get(random));
				
				//去除已分组后的队伍
				tlist.remove(random);
				num++;
				continue;
			}
			if(num>=4&&num<8) {
				random =rand.nextInt((15-num)- 0 + 1);			
				tlist2.add(tlist.get(random));				
				tlist.remove(random);
				num++;
				continue;
			}
			if(num>=8&&num<12) {
				random =rand.nextInt((15-num)- 0 + 1);				
				tlist3.add(tlist.get(random));				
				tlist.remove(random);
				num++;
				continue;
			}
			if(num>=12&&num<16) {				
				random =rand.nextInt((15-num)- 0 + 1);
				tlist4.add(tlist.get(random));
				tlist.remove(random);
				num++;
				continue;
			}
					
		}
		
		//输出List分组中的数据
		System.out.print("First group: ");
		for(String s:tlist1) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.print("Second group: ");
		for(String s:tlist2) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.print("Third group: ");
		for(String s:tlist3) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.print("Fourth group: ");
		for(String s:tlist4) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//存入hashmap
		tgroup.put("1", tlist1);						
		tgroup.put("2", tlist2);
		tgroup.put("3", tlist3);
		tgroup.put("4", tlist4);

		Iterator i=tgroup.entrySet().iterator();  		//迭代器遍历hashmap
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
