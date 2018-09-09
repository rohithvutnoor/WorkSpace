package ThreadWorks;


// Driver class
class SyncDemo extends Thread{
	private String msg;
	private Thread t;
	Sender sender;
	SyncDemo(String m, Sender obj) {
		msg = m;
		sender = obj;
	}
	public void run() {
		// Only one thread can send a message
		// at a time.
		synchronized (sender) {
			// synchronizing the snd object
			sender.send(msg);
		}
	}

	public static void main(String args[]) {
		Sender snd = new Sender();
		SyncDemo S1 = new SyncDemo("Hi ", snd);
		SyncDemo S2 = new SyncDemo("Bye ", snd);
		Thread s1 =new  Thread(S1);
		Thread s2 =new  Thread(S2);
		// Start two threads of ThreadedSend type
		s1.start();
		s2.start();

		// wait for threads to end
		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}