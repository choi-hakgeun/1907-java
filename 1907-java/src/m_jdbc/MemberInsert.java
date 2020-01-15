package m_jdbc;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemberInsert extends JInternalFrame {
	List<MemberVo> list;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JLabel label_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInsert frame = new MemberInsert();
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
	public MemberInsert() {
		super("학생정보입력", false, true, true, true);
		setVisible(true);
		
		setTitle("\uD559\uC0DD\uC815\uBCF4\uC785\uB825");
		setBounds(0, 0, 400, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTextField());
		getContentPane().add(getTextField_1());
		getContentPane().add(getTextField_2());
		getContentPane().add(getComboBox());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getLblNewLabel_3());

	}
	
	public MemberInsert(List<MemberVo> list) {
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uC0DD\uC815\uBCF4\uC785\uB825");
			lblNewLabel.setBackground(new Color(127, 255, 212));
			lblNewLabel.setOpaque(true);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 360, 23);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(12, 43, 49, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uC0DD\uBA85");
			lblNewLabel_2.setBounds(12, 68, 49, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC785\uD559\uC77C");
			label.setBounds(12, 95, 49, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uD559\uB144");
			label_1.setBounds(12, 120, 49, 15);
		}
		return label_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(73, 40, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(73, 65, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(73, 93, 116, 21);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 \uD559\uB144", "2 \uD559\uB144", "3 \uD559\uB144", "4 \uD559\uB144", "5 \uD559\uB144", "6 \uD559\uB144", "7 \uD559\uB144", "8 \uD559\uB144", "9 \uD559\uB144", "10 \uD559\uB144"}));
			comboBox.setBounds(73, 117, 116, 21);
		}
		return comboBox;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.setBounds(73, 148, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBackground(new Color(152, 251, 152));
			lblNewLabel_3.setOpaque(true);
			lblNewLabel_3.setBounds(12, 204, 360, 36);
		}
		return lblNewLabel_3;
	}
}
