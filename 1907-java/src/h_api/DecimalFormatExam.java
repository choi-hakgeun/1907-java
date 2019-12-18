package h_api;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class DecimalFormatExam extends JInternalFrame {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecimalFormatExam frame = new DecimalFormatExam();
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
	public DecimalFormatExam() {
		super("DecimalFormat", true, true, true, true);
		
		setTitle("DecimalFormat");
		setBounds(100, 100, 433, 278);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());
		setVisible(true);

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC785\uAE08\uC561");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(25, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(94, 7, 302, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {//소수점표시
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC18C\uC218\uC810\uD45C\uC2DC");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double v = Double.parseDouble( textField.getText());
					DecimalFormat df = new DecimalFormat("#,###,###,###.##");
					
					textArea.append(df.format(v)+"\n");
				}
			});
			btnNewButton.setBounds(167, 36, 97, 30);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uCC9C\uB2E8\uC704");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					long v = Long.parseLong(textField.getText());
					DecimalFormat df = new DecimalFormat("00,000,000,000.00");
					String r = df.format(v);
					
					textArea.append(r + "\n");
					
				}
			});
			btnNewButton_1.setBounds(35, 35, 97, 31);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC6D0\uD654\uD45C\uC2DC");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double v = Double.parseDouble(textField.getText());
					DecimalFormat df = new DecimalFormat("\u00a4 #,###.##");
					
					textArea.append(df.format(v) + "\n");
				}
			});
			btnNewButton_2.setBounds(299, 35, 97, 31);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(33, 76, 363, 153);
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
