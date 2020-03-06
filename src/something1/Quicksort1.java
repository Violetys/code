package something1;

public class Quicksort1{
    public int getMiddle(int []arr,int low,int high){
        int temp=arr[low];
        while(low< high) {
        	while(low< high && temp< arr[high] ) {
        		high--;
        	}
        	arr[low]=arr[high];
        	while(low< high && arr[low]<= temp) {
        		low++;
        	}
        	arr[high]=arr[low];
        	
        }
        arr[low]=temp;
        return low;
    	
    	
    	
    	
    	
//    	int temp=arr[low];
//        while(low<high){
//            while(low<high&&arr[high]>temp){
//                high--;
//            }
//            arr[low]=arr[high];
//            while (low<high&&arr[low]<=temp){
//                low++;
//            }
//            arr[high]=arr[low];
//            
//        }
//        arr[low]=temp;
//        return low;
    }
    public void quick(int []arr,int low,int high){
    	
    	if(low<high){
            int mid=getMiddle(arr,low,high);
            quick(arr,low,mid-1);
            quick(arr,mid+1,high);
            
        }
        
    }
    
     public static void main(String[] args) {
         int []arr={5,6,3,2,8,1,4,9,3,6,4};
         Quicksort1 quick=new Quicksort1();
         quick.quick(arr,0,arr.length-1);
         for(int i=1;i<arr.length-1;i++){
             System.out.print(arr[i]+" ");
         }
     }
    
}