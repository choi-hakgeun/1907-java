package i_thread_stopwatch;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

//import javafx.scene.layout.Pane;

import javax.swing.border.BevelBorder;

public class TimeWatch extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel labelTime;
	private JLabel lblNewLabel_2;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeWatch frame = new TimeWatch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TimeWatch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLabelTime());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getPanel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		
		DateTimeThread dtt = new DateTimeThread(labelTime);
		dtt.setDaemon(true);
		dtt.start();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시계");
			lblNewLabel.setBounds(14, 12, 62, 17);
		}
		return lblNewLabel;
	}
	private JLabel getLabelTime() {
		if (labelTime == null) {
			labelTime = new JLabel("2019-12-18(수) 17:08:01");
			labelTime.setHorizontalAlignment(SwingConstants.CENTER);
			labelTime.setOpaque(true);
			labelTime.setBackground(Color.CYAN);
			labelTime.setFont(new Font("양재블럭체", Font.BOLD, 36));
			labelTime.setBounds(14, 41, 513, 71);
		}
		return labelTime;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("스톱워치");
			lblNewLabel_2.setBounds(14, 124, 62, 17);
		}
		return lblNewLabel_2;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new StopWatchThread();
			//panel = new JPanel();
			panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			panel.setBounds(14, 153, 513, 81);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("START");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					StopWatchThread st = (StopWatchThread)panel;
					st.stop=false;
					Thread t = new Thread(st);
					t.setDaemon(true);
					t.start();
				}
				
			});
			btnNewButton.setBounds(136, 246, 113, 50);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("STOP");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StopWatchThread st = (StopWatchThread)panel;
					st.stop=true;
				}
			});
			btnNewButton_1.setBounds(263, 246, 113, 50);
		}
		return btnNewButton_1;
	}
}
