package bysxzy;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 输出日历
 * 
 *
 */
public class day15 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入年份:");
		int year=input.nextInt();
		System.out.println("请输入月份:");
		int  month=input.nextInt();
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1,01); 
		int week=calendar.get(Calendar.DAY_OF_WEEK)-1; 
		int min = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);    
		int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	   
		int k=week-1;
		max=max+(week-1);
		
		System.out.println("一\t二\t三\t四\t五\t六\t日");
		
		for (int i = min; i <=max; i++) {
			
			if(i<week) {
				System.out.print("\t");
			}else {
				System.out.printf(new DecimalFormat("00").format((i-(week-1)))+"\t");
			}
			if(i%7==0) {
				System.out.println();
			}
			
		}


		
	}


}
