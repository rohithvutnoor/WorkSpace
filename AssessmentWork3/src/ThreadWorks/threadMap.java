package ThreadWorks;
//port java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;

public class threadMap extends Thread {
	private String msg;
	threadMap curObj;
	threadMap(){
		
	}
	threadMap(String m, threadMap obj) {
		msg = m;
		curObj = obj;
	}
	public void run() {
		// Only one thread can send a message
		// at a time.
		
		curObj.send(msg);
/*		synchronized (sender) {
			// synchronizing the snd object
			sender.send(msg);
		}
		*/
		
	}
	public synchronized void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
		System.out.println("" + msg + "Sent\n");
	}
	/*public void run() {
		System.out.println("Child Threads");
		for (int i = 0; i < 5; i++) {
			System.out.print("Hello: " + i + " ");
		}
		System.out.println();
	}*/
	public static void main(String[] args) {
		threadMap d = new  threadMap();
		threadMap th = new threadMap("Hello ",d);
		threadMap th1 = new threadMap("Mail ",d);
		//threadMap th = new threadMap();
		System.out.println("Thread Created");

		Thread xt = new Thread(th);
		Thread xt1 = new Thread(th1);
		xt.setPriority(Thread.MAX_PRIORITY);
		xt1.setPriority(Thread.MIN_PRIORITY);
		xt.start();
		xt1.start();
		
		try {
			xt.join();
			xt1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Thread: "+xt.getName()+" Priority: "+xt.getPriority());
		System.out.println("Thread: "+xt1.getName()+" Priority: "+xt1.getPriority());
		
		System.out.println("End of Main Thread");
		
//		HashMap
		
/*		HashMap<Integer, Character> hMap = new HashMap<Integer, Character>();

		for (int i = 65; i < 70; i++) {
			hMap.put(i, (char) i);
		}

		Set<Entry<Integer, Character>> set = hMap.entrySet();

		for (Entry<Integer, Character> entry : set) {
			System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
		}
		*/
		
		System.out.println();

	}

}
