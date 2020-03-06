package something1;

import java.util.ArrayList;

public class test2 {

	public static String delete(String str,char c) {
		ArrayList arr=new ArrayList();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				arr.add(str.charAt(i));
			}
		}
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.size();i++) {
			sb.append(arr.get(i));
		}
		
		str=sb.toString();
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcddef";
		char c='d';
		str=delete(str,c);
		System.out.println(str);
	}

}
