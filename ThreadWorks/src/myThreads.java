
public class myThreads extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: "+i);
		}
	}

	public static void main(String[] args) {

		//Thread t = Thread.currentThread();
		//System.out.println("Current Thread: " + t + " HashCode: " + t.hashCode());
		myThreads t1 = new myThreads();
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}
}
