package p350;

public class AsyncProcess implements Runnable {
	 private AsyncCallBack callback;

	public AsyncProcess(AsyncCallBack asyncCallback) {
	 	this.callback=asyncCallback;
}

	@Override
	public void run() {
		try {
				Thread.sleep(1000L);
				this.callback.notify("Finished");
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("비동기 처리 끝");
	}
}

