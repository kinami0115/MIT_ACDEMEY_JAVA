package p350;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallBackSample {

	public static void main(String[] args) {
		final ExecutorService executor = Executors.newSingleThreadExecutor();
		AsyncProcess proc = new AsyncProcess(new AsyncCallBack() {
			public void notify(String message) {
				System.out.println("callback message : "+ message);
				executor.shutdown();
			}
			
		});
		executor.execute(proc);
		System.out.println(" 비동기 시작");
	}

}
