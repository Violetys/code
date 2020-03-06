package something1;

import java.util.LinkedList;
import java.util.Queue;

public class test3 {

	public static int[] sortArray(int []arr) {
		Queue q1=new LinkedList();			//偶数
		Queue q2=new LinkedList();			//奇数
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				q1.add(arr[i]);        		//入队列
			}else {
				q2.add(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i]=(int) q1.remove();	//出队列
			}else {
				arr[i]=(int) q2.remove();
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,2,5,7,3,4};
		arr=sortArray(arr);
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
