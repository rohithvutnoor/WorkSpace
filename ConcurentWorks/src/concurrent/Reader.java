package concurrent;

public class Reader extends Thread{
	  String name = "";
	  private Dictionary dictionary = null;
	  public Reader(Dictionary d, String threadName) {
	    this.dictionary = d;
	    this.setName(threadName);
	    name = threadName;
	  }
	  
	  private boolean runForestRun = true;
	  @Override
	  public void run() {
	    while (runForestRun) {
	      String [] keys = dictionary.getKeys();
	      for (String key : keys) {
	        //reading from dictionary with READ LOCK
	        String value = dictionary.get(key);
	        
	        //make what ever you want with the value.
	        System.out.println(name+" "+key + " : " + value);
	      }
	      
	      //update every seconds
	      try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	  
	  public void stopReader(){
	    this.runForestRun = false;
	    this.interrupt();
	  }
	}
