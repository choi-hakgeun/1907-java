package i_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DateTimeThread extends Thread {
	JLabel watch;
	
	private boolean stop;
	private String ti;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)hh:mm:ss");
	private JTextField textField;

	public DateTimeThread(JLabel watch) {
		this.watch = watch;
	}

	

	public String getTi() {
		return ti;
	}
	public void setTi(String ti) {
		this.ti = ti;
	}
	
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		while (!stop) {
			// PrintThread printThread = new PrintThread();
			// printThread.start();
			Date now = new Date();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			ti = sdf.format(now).toString();
			textField.setText(ti);
		}

		/*
		 * while(!stop) { try {Thread.sleep(1);}catch(InterruptedException e) {}
		 * 
		 * }
		 */
	}

}
