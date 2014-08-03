
public class ReentrantLock {

	public static void main(String[] args) throws Exception {
		
		final Reenlock reenlock = new Reenlock();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					reenlock.Thread1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					reenlock.Thread2();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		reenlock.finished();
	}

}
