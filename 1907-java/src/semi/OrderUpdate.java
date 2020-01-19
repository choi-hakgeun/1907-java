package semi;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;

public class OrderUpdate extends JInternalFrame {
	private JLabel lblOrderHistoryList;
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblOrderHistoryManagement;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel label;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JLabel label_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JTextField textField_3;
	private JLabel label_3;
	private JTextField textField_4;
	private JLabel label_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JTextField textField_6;
	private JButton btnNewButton_1;
	private JButton button;
	private JLabel label_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUpdate frame = new OrderUpdate();
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
	public OrderUpdate() {
		setTitle("\uC8FC\uBB38\uB0B4\uC5ED\uAD00\uB9AC");
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		getContentPane().add(getLblOrderHistoryList());
		getContentPane().add(getScrollPane());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getLabel_2());
		getContentPane().add(getSeparator());
		getContentPane().add(getLabel_1_1());
		getContentPane().add(getTextField_1());
		getContentPane().add(getLabel_1_2());
		getContentPane().add(getTextField_2());
		getContentPane().add(getLabel_2_1());
		getContentPane().add(getTextField_3());
		getContentPane().add(getLabel_3());
		getContentPane().add(getTextField_4());
		getContentPane().add(getLabel_4());
		getContentPane().add(getTextField_5());
		getContentPane().add(getLabel_5());
		getContentPane().add(getTextField_6());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getButton());
		getContentPane().add(getLabel_6());

	}

	private JLabel getLblOrderHistoryList() {
		if (lblOrderHistoryList == null) {
			lblOrderHistoryList = new JLabel("Order History List");
			lblOrderHistoryList.setHorizontalAlignment(SwingConstants.CENTER);
			lblOrderHistoryList.setBounds(12, 10, 298, 15);
		}
		return lblOrderHistoryList;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 35, 298, 326);
			scrollPane.setViewportView(getList());
		}
		return scrollPane;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	private JLabel getLabel_1() {
		if (lblOrderHistoryManagement == null) {
			lblOrderHistoryManagement = new JLabel("Order History Management");
			lblOrderHistoryManagement.setHorizontalAlignment(SwingConstants.CENTER);
			lblOrderHistoryManagement.setBounds(352, 10, 220, 15);
		}
		return lblOrderHistoryManagement;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(391, 34, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBounds(512, 33, 60, 23);
		}
		return btnNewButton;
	}
	private JLabel getLabel_2() {
		if (label == null) {
			label = new JLabel("\uC8FC \uBB38  \uBC88 \uD638");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(321, 37, 67, 15);
		}
		return label;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(322, 62, 250, 2);
		}
		return separator;
	}
	private JLabel getLabel_1_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544   \uC774    \uB514");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(322, 74, 67, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(391, 71, 181, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLabel_1_2() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC131          \uD568");
			label_1.setBounds(322, 102, 67, 15);
		}
		return label_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(391, 99, 181, 21);
		}
		return textField_2;
	}
	private JLabel getLabel_2_1() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC8FC \uBB38  \uB0A0 \uC9DC");
			label_2.setBounds(322, 130, 67, 15);
		}
		return label_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(391, 127, 181, 21);
		}
		return textField_3;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC8FC\uBB38 \uC0C1\uD488\uBA85");
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(322, 158, 67, 15);
		}
		return label_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(391, 155, 181, 21);
		}
		return textField_4;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uC8FC \uBB38  \uC218 \uB7C9");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setBounds(322, 189, 67, 15);
		}
		return label_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(391, 186, 181, 21);
		}
		return textField_5;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uC8FC \uBB38  \uAC00 \uACA9");
			label_5.setBounds(322, 217, 67, 15);
		}
		return label_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(391, 214, 181, 21);
		}
		return textField_6;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB0B4\uC5ED\uC218\uC815");
			btnNewButton_1.setBounds(391, 245, 85, 40);
		}
		return btnNewButton_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uB0B4\uC5ED\uC0AD\uC81C");
			button.setBounds(488, 245, 85, 40);
		}
		return button;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC8FC\uBB38\uBC88\uD638\uB97C \uAC80\uC0C9\uD558\uC5EC \uC8FC\uC138\uC694.");
			label_6.setOpaque(true);
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setBackground(new Color(175, 238, 238));
			label_6.setBounds(322, 295, 250, 66);
		}
		return label_6;
	}
}
