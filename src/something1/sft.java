package something1;

public class sft {
/*
 * Doodle秋招时候发的笔试题
 * 传入分解后char数组，获取数组开头的字符，从后往前遍历，查找最后匹配的字符对应的下标
 * 根据最后匹配的字符下标把数组分为前后两部分，调用findnext()，在后一部分数组中查找与
 * 前一部分数组中匹配的字符，返回下标，选出最大下标，循环递归find()。
 * 
 * */
	public static int find(char []c,char s,int i) {
		char s1 = c[i];						//这段数组的第一个字符
		int n=i;
		int right;
		for(int j=c.length-1; j>i ;j--) {
			if(s1==c[j]) {
				n=j;						//记录将数组分开的点
				break;
			}
		}
		for(int k=i+1;k<n;k++) {			//向后找到记录下这点，继续找新的部分		
			right=findnext(c,c[k],n);
			if(right>n) {
				n=right;
			}
		}
		for(int m=i;m<n+1;m++) {
			System.out.print(c[m]);
		}
		System.out.println();
		
		if(c.length<=n+1) {						//递归终止条件
			return 0;
		}
		return find(c,c[n+1],n+1);
		
	}
	/*
	 * 从后面的数组中查找
	 * 
	 * */
	public static int findnext(char []c,char s,int i) {
		for(int j=c.length-1; j>i ;j--) {
			if(s==c[j]) {
				return j;						//返回后部分数组中该字符位置
			}
			
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbbacceddefgkifk";
		char str[]= s.toCharArray();
		
		for(int i=0;i<s.length();i++) {			
			str[i]=s.charAt(i);
		}
		find(str,str[0],0);

	}
}
