package something1;
/*
 * 快速排序
 * 
 * */
public class QuickSort {

public int getMiddle(int []arr,int low, int high) {
	int temp = arr[low];
	while(low < high) {
		while(low < high && arr[high] >= temp) {
			high--;
		}
		arr[low] = arr[high];
		while(low < high && arr[low] <= temp) {
			low++;
		}
		arr[high] = arr[low];
	}
	arr[low] = temp;
	return low;

}

public void quick(int []arr,int low,int high) {
	if(low < high) {
		int mid = getMiddle(arr, low, high);
		quick(arr, low, mid -1);
		quick(arr, mid + 1, high);		
	}
}

public static void main(String[]args) {
	int [] arr = {5,6,2,3,1,6,7,9,4,10};
	QuickSort quick = new QuickSort();
	quick.quick(arr, 0, arr.length - 1);
	for(int i = 0;i < arr.length;i++) {
		System.out.print(arr[i] + "\t");
	}
	
}
}

