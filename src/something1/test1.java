package something1;

public class test1 {
    
	public static double eat(double num,int n){
        for(int i=0;i<n;i++){
            num=(num+1)*2;
        }
        return num;
    }
    
	public static void main(String[] args) {
	    double sum;
	    double num=1.0;
	    sum=eat(num,10);
	    System.out.println(sum);
	}
}