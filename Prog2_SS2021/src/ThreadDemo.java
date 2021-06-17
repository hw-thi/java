
class CounterThread extends Thread {
	private int init;
	private boolean terminated; 
	
	public CounterThread(int init) {
		this.init = init;
	}
	
	public void run() {
		terminated = false;
		int i = init;
		while (!terminated) {
			System.out.println(i);
			i++;
		}
	}
	
	public void terminate() {
		terminated = true;
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		CounterThread counter1 = new CounterThread(1000);
		counter1.start(); // führt run aus!
		CounterThread counter2 = new CounterThread(2000);
		counter2.start(); // führt run aus!
		Thread.currentThread().sleep(5000);
		counter1.terminate();
		counter2.terminate();
	}

}
