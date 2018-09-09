import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class executiveDemo {
	private static final int NTHREADS = 10;
	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(NTHREADS);
		for (int i = 0; i <12; i++) {
//			Runnable work = new MyRunnable(100000L+i);
//			e.execute(work);
		}
		e.shutdown();
		try {
			e.awaitTermination(60000,TimeUnit.SECONDS);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		System.out.println("Finished All Threads");
	}

}
