package fzgg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SynchronizeTest {
	
	@Autowired
	@Qualifier("threadPoolExecutor")
	private ExecutorService es;
	
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
		
		
		new Thread(()->{
			new SyncClzz().test();
		}).start();
		
		
//		ExecutorService singleThreadExecutor = Executors.newCachedThreadPool();
		
		// 阿里不推荐
//		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//		singleThreadExecutor.execute(()->{
//			new SyncClzz().test();
//		});
//		singleThreadExecutor.shutdown();
		
		// 阿里推荐
		ExecutorService threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>(1024), new ThreadPoolExecutor.AbortPolicy());
//		threadPoolExecutor.execute(()->{
//			new SyncClzz().test();
//		});
//		threadPoolExecutor.shutdown();
		
		
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Sync" + i);
		}
		
	}
	
	
}
