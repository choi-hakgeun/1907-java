package i_thread;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TimeWatch extends JFrame {
	private static final long serialVersionUID = 1L;

	private static DateTimeThread a = new DateTimeThread();

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
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
		setTitle("\uC2DC\uACC4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getPanel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		a.setTextField(textField);
		a.start();		
		
	}

	public TimeWatch(JTextField textField) {
		this();
		this.textField = textField;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC2DC\uACC4");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField.setForeground(Color.BLUE);
					textField.setBackground(new Color(0, 0, 0));
				}
			});
			textField.setText("");
			textField.setForeground(Color.RED);
			textField.setBackground(new Color(0, 0, 0));
			textField.setFont(new Font("±Ã¼­Ã¼", Font.PLAIN, 29));
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setBounds(12, 35, 410, 52);
			textField.setColumns(10);
			
		}
		return textField;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC2A4\uD1B1\uC6CC\uCE58");
			lblNewLabel_1.setBounds(12, 97, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new StopWatchThread();
			panel = new JPanel();
			panel.setBounds(12, 122, 410, 52);
		}
		return panel;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("START");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					StopWatchThread st = (StopWatchThread)panel;
					st.stop = false;
					Thread t = new Thread(st);
					t.setDaemon(true);
				}
			});
			btnNewButton.setBounds(12, 184, 97, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("STOP");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StopWatchThread st = (StopWatchThread)panel;
					st.stop = true;
					
				}
			});
			btnNewButton_1.setBounds(121, 184, 97, 23);
		}
		return btnNewButton_1;
	}
}
