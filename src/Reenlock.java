
public class Reenlock {
	
	private int count = 0;
	
	private void increment() {
		for(int i=0; i<1000; i++) {
			count++;
		}
	}
	public void Thread1() throws InterruptedException {
		increment();
	}
	
	public void Thread2() throws InterruptedException {
		increment();
	}
	
	public void finished() {
		System.out.print("Count is: " + count);
	}
}