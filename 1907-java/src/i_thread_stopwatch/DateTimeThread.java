package i_thread_stopwatch;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DateTimeThread extends Thread{
	JLabel watch;
	
	
	public DateTimeThread(JLabel watch) {
		this.watch = watch;
	}
	
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		while(true) {
			watch.setText(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			}catch(Exception ec) {}
		}
		
	}
}
