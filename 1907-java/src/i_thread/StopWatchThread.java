package i_thread;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.util.Date;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class StopWatchThread extends JPanel implements Runnable{
	private JLabel lblNewLabel;
	public boolean stop;
	private JLabel timeLabel;

	/**
	 * Create the panel.
	 */
	public StopWatchThread() {
		setBounds(new Rectangle(12, 122, 410, 52));
		setLayout(new BorderLayout(0, 0));
		add(getLblNewLabel(), BorderLayout.CENTER);
	}

	@Override
	public void run() {
		DecimalFormat df = new DecimalFormat("###,###.000");
		long begin = new Date().getTime();
		while(!stop) {
			long end = new Date().getTime()-begin;
			try {
				Thread.sleep(1);
			}catch(Exception ex) {}
			timeLabel.setText(df.format(end/1000.0));
		}
				}

	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Stop Watch");
			lblNewLabel.addAncestorListener(new AncestorListener() {
				public void ancestorAdded(AncestorEvent arg0) {
					
				}
				public void ancestorMoved(AncestorEvent arg0) {
					
				}
				public void ancestorRemoved(AncestorEvent arg0) {
					
				}
			});
			lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}
}
