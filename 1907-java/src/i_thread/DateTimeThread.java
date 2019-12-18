package i_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeThread extends Thread{
	private boolean stop;
	Date now = new Date();
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public void run() {
		while(!stop) {
			//PrintThread printTread = new PrintThread();
			//printThread.start();			
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)hh:mm:ss");
			//System.out.println(ti);			
			String ti = sdf.format(now).toString();
			System.out.println(ti);
		}
		/*while(!stop) {
			try {Thread.sleep(1);}catch(InterruptedException e) {}
			
		}*/
	}
	
	
	public static void main(String[] args) {	
		DateTimeThread a = new DateTimeThread();
		a.run();		
	}

}
