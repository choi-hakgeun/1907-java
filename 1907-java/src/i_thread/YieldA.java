package i_thread;

public class YieldA extends Thread{
	
	boolean stop = false;
	boolean work = true;
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("YieldA.....");				
			}else {
				yield();
			}//if end
			try {
				Thread.sleep(500);
				
			}catch(Exception ex) {}
		}//while end
		System.out.println("YieldA Á¾·á....");
	}

}
