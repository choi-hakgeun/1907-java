package i_thread_stopwatch;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.SwingConstants;
import java.awt.Color;

public class StopWatchThread extends JPanel implements Runnable{
	boolean stop = false;
	private JLabel timeLabel;

	/**
	 * Create the panel.
	 */
	public StopWatchThread() {
		setLayout(new BorderLayout(0, 0));
		add(getTimeLabel());
		
	}

	@Override
	public void run() {
		DecimalFormat df = new DecimalFormat("###,###.000");
		long begin = new Date().getTime();
		while( !stop ) {
			long end = new Date().getTime()-begin;
			try {
				Thread.sleep(1);
			}catch(Exception ex) {}
			timeLabel.setText(df.format(end/1000.0));
		}
		
	}
	private JLabel getTimeLabel() {
		if (timeLabel == null) {
			timeLabel = new JLabel("¹Ú¿ø±â....");
			timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
			timeLabel.setForeground(Color.RED);
			timeLabel.setFont(new Font("¾çÀç»þ³ÚÃ¼M", Font.PLAIN, 50));
		}
		return timeLabel;
	}
}
