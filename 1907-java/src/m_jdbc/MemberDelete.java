package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class MemberDelete extends JInternalFrame {
	private JLabel label;
	private JLabel label_1;
	private JTextField tmId;
	private JButton button;
	private JLabel label_2;
	private JTextField tmName;
	private JLabel label_3;
	private JTextField trDate;
	private JLabel label_4;
	private JComboBox tgrade;
	private JButton button_1;
	private JLabel label_5;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberDelete frame = new MemberDelete();
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
	public MemberDelete() {
		super("학생정보삭제", false, true, true, true);
		setVisible(true);
		
		setTitle("\uD559\uC0DD\uC815\uBCF4\uC0AD\uC81C");
		setBounds(0, 300, 400, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTmId());
		getContentPane().add(getButton());
		getContentPane().add(getLabel_2());
		getContentPane().add(getTmName());
		getContentPane().add(getLabel_3());
		getContentPane().add(getTrDate());
		getContentPane().add(getLabel_4());
		getContentPane().add(getTgrade());
		getContentPane().add(getButton_1());
		getContentPane().add(getLabel_5());
		getContentPane().add(getSeparator());

	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD559\uC0DD\uC815\uBCF4\uC0AD\uC81C");
			label.setOpaque(true);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBackground(new Color(127, 255, 212));
			label.setBounds(12, 10, 360, 23);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC544\uC774\uB514");
			label_1.setBounds(12, 43, 53, 15);
		}
		return label_1;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setColumns(10);
			tmId.setBounds(77, 40, 116, 21);
		}
		return tmId;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uAC80\uC0C9");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {				
					
				}
			});
			button.setBounds(205, 39, 97, 23);
		}
		return button;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uD559\uC0DD\uBA85");
			label_2.setBounds(12, 90, 53, 15);
		}
		return label_2;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setColumns(10);
			tmName.setBounds(77, 87, 116, 21);
		}
		return tmName;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC785\uD559\uC77C");
			label_3.setBounds(12, 117, 53, 15);
		}
		return label_3;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setColumns(10);
			trDate.setBounds(77, 115, 116, 21);
		}
		return trDate;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uD559\uB144");
			label_4.setBounds(12, 142, 53, 15);
		}
		return label_4;
	}
	private JComboBox getTgrade() {
		if (tgrade == null) {
			tgrade = new JComboBox();
			tgrade.setModel(new DefaultComboBoxModel(new String[] {"1 \uD559\uB144", "2 \uD559\uB144", "3 \uD559\uB144", "4 \uD559\uB144", "5 \uD559\uB144", "6 \uD559\uB144", "7 \uD559\uB144", "8 \uD559\uB144", "9 \uD559\uB144", "10 \uD559\uB144"}));
			tgrade.setBounds(77, 139, 116, 21);
		}
		return tgrade;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC800\uC7A5");
			button_1.setBounds(77, 170, 97, 23);
		}
		return button_1;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("New label");
			label_5.setOpaque(true);
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setBackground(new Color(152, 251, 152));
			label_5.setBounds(12, 203, 360, 35);
		}
		return label_5;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 68, 360, 2);
		}
		return separator;
	}
}
