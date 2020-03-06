package something1;

import java.util.ArrayList;
import java.util.Stack;

public class test4 {
	public static int totalNum = 0;
	public static void getAllnum(int i,int []num,Stack<String> stack){
        stack.push(i + "");
        while(!stack.isEmpty()){            
            String str  = (String) stack.pop();
            if(str.length()==5){
            	totalNum++;
                System.out.println(Integer.parseInt(str));
                continue;
            }
            for(int j : num){
                if(!str.contains(j + ""))
                    stack.push(str + j + "");
            }
        }
    }
	
	
	
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7};
		
		Stack<String> stack = new Stack<String>();
		for(int i : arr){
			getAllnum(i,arr,stack);
	    }
	        System.out.println("总数:" + totalNum);
	}

}
	


