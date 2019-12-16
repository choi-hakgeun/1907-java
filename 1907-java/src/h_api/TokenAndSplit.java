package h_api;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TokenAndSplit extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField str;
	private JLabel lblNewLabel_1;
	private JTextField deli;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TokenAndSplit frame = new TokenAndSplit();
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
	public TokenAndSplit() {
		setTitle("Token And Split");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getStr());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getDeli());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getScrollPane());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uBB38\uC790\uC5F4");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getStr() {
		if (str == null) {
			str = new JTextField();
			str.setText("\u3139\u3147\u3134\u3141\u3139\u3147\u3134\u3139fdsa,,,,,fsd,3,43243,2");
			str.setBounds(61, 7, 334, 21);
			str.setColumns(10);
		}
		return str;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uAD6C\uBD84\uC790");
			lblNewLabel_1.setBounds(12, 35, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getDeli() {
		if (deli == null) {
			deli = new JTextField();
			deli.setText(",");
			deli.setBounds(61, 32, 116, 21);
			deli.setColumns(10);
		}
		return deli;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Token");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {				
					String value = str.getText();
					String d = deli.getText();
					StringTokenizer st = new StringTokenizer(value, d);
					textArea.setText("");
					//how1 for
					int cnt = st.countTokens();
					for(int i = 0; i<cnt ; i++) {
						textArea.append(st.nextToken()+"\n");
					}
					//how2(while
					textArea.append("--------------------\n");
					st = new StringTokenizer(value, d);
					while(st.hasMoreTokens()) {
						textArea.append((st.nextToken() +"\n"));
					}
				}
			});
			btnNewButton.setBounds(189, 31, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Split");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String[] values = str.getText().split(deli.getText());
					String r = "Split...........\n";
					for (int i = 0; i<values.length ; i++) {//int i´Â 
						r += String.format("values[%d] = %s \n",  i, values[i]);//%d ´ë½Å¿¡ i°ªÀÌ ÂïÈû, 			
						//r += String.add("valuse[" + i + "] = " + values[i] + "\n");
					}
					r += "------------------------";
					r += Arrays.toString(values);
					r += "------------------------";
					textArea.setText(r);
				}
			});
			btnNewButton_1.setBounds(298, 31, 97, 23);
		}
		return btnNewButton_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 60, 381, 192);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
