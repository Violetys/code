package bysxzy;
import java.util.*;
public class count {
	

		    /**
	     * 输出以下字符串中所有的字符, 符号, 空格出现的次数
	     * 输出示例:
	     *  C 1
	     *  H 2
	     *  e 14
	     *  ...
	     */
	public static void countStr(String s) {
		Integer num;
	    char[] sarr=s.toCharArray();
	    	//因为HashMap为键值对形式存值，所以初步思路为使用字符作为key,封装类作为值，每出现一次就对值加一
	    HashMap hmap=new HashMap();			
	    for(char c:sarr) {
	    	if(hmap.containsKey(c)) {
	    		num=(Integer) hmap.get(c);
	    		hmap.put(c, num+1);
	    	}else {
	    		hmap.put(c, 1);
	    	}    	
	    }
	    Iterator i=hmap.entrySet().iterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next().toString());
	    }
	}
	
	public static void main(String[] args) {
		
	    String s = "We provide high-quality medical institutions with integrated information solutions including HIS, EMR, HRP, CRM, focusing on the core needs of the two industries: improving medical quality and enhancing medical trust";
	        // TODO 请编写代码实现题目要求
	    countStr(s);
	}
	
}
