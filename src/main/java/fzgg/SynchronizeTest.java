package fzgg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizeTest {
	public static void main(String[] args) {
		System.out.println("begin");
//		ExecutorService executor= Executors.newFixedThreadPool(2);
//		Runnable r= new SyncClzz();
//		Thread t = new Thread(r, "t");
//		t.start();

//		new Thread(){
//			public void run(){
//				new SyncClzz().test();
//			}
//		}.start();
		
		
//		new Thread(()->{
//			new SyncClzz().test();
//		}).start();
		
		
//		ExecutorService singleThreadExecutor = Executors.newCachedThreadPool();
		
		
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		
		singleThreadExecutor.execute(()->{
			new SyncClzz().test();
		});
		for (int i = 0; i < 100; i++) {
			System.out.println("Sync" + i);
		}
		
	}
	
	
}
