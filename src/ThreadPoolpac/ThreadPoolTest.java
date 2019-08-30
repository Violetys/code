package ThreadPoolpac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newFixedThreadPool(3);  //返回 new ThreadPoolExecutor
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pool.execute(new Runnable(){public void run(){
				System.out.println(Thread.currentThread().getName());
			}});
		}
		
		ExecutorService Cachedpool=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Cachedpool.execute(new Runnable(){public void run(){
				System.out.println(Thread.currentThread().getName());
			}});
		}
		ExecutorService Singlepool=Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Singlepool.execute(new Runnable(){public void run(){
				System.out.println(Thread.currentThread().getName());
			}});
		}
		
	}

}
