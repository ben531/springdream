package fzgg;

public class SyncClzz  implements Runnable{

	@Override
	public void run() {
		for (int j = 0; j < 100; j++) {
			System.out.println("我要去上海");
		}
	}
	
	public void test(){
		for (int i = 0; i <100; i++) {
			System.out.println("我要去北京"+i);
		}
	}

}
