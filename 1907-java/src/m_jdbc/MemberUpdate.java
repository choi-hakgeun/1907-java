package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class MemberUpdate extends JInternalFrame {
	private JLabel label;
	private JLabel label_1;
	private JTextField tmId;
	private JLabel label_2;
	private JTextField tmName;
	private JLabel label_3;
	private JTextField trDate;
	private JLabel label_4;
	private JComboBox tgrade;
	private JButton button;
	private JLabel label_5;
	private JButton btnNewButton;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberUpdate frame = new MemberUpdate();
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
	public MemberUpdate() {
		super("학생정보수정", false, true, true, true);
		setVisible(true);
		
		setTitle("\uD559\uC0DD\uC815\uBCF4\uC218\uC815");
		setBounds(400, 0, 400, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTmId());
		getContentPane().add(getLabel_2());
		getContentPane().add(getTmName());
		getContentPane().add(getLabel_3());
		getContentPane().add(getTrDate());
		getContentPane().add(getLabel_4());
		getContentPane().add(getTgrade());
		getContentPane().add(getButton());
		getContentPane().add(getLabel_5());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getSeparator());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD559\uC0DD\uC815\uBCF4\uC218\uC815");
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
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uD559\uC0DD\uBA85");
			label_2.setBounds(12, 92, 53, 15);
		}
		return label_2;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setColumns(10);
			tmName.setBounds(77, 89, 116, 21);
		}
		return tmName;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC785\uD559\uC77C");
			label_3.setBounds(12, 119, 53, 15);
		}
		return label_3;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setColumns(10);
			trDate.setBounds(77, 117, 116, 21);
		}
		return trDate;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uD559\uB144");
			label_4.setBounds(12, 144, 53, 15);
		}
		return label_4;
	}
	private JComboBox getTgrade() {
		if (tgrade == null) {
			tgrade = new JComboBox();
			tgrade.setModel(new DefaultComboBoxModel(new String[] {"1 \uD559\uB144", "2 \uD559\uB144", "3 \uD559\uB144", "4 \uD559\uB144", "5 \uD559\uB144", "6 \uD559\uB144", "7 \uD559\uB144", "8 \uD559\uB144", "9 \uD559\uB144", "10 \uD559\uB144"}));
			tgrade.setBounds(77, 141, 116, 21);
		}
		return tgrade;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC218\uC815");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					MemberDao dao = new MemberDao();
					try {
						String mId = tmId.getText();
						String mName = tmName.getText();
						Date rDate = sdf.parse(trDate.getText());
						int grade = tgrade.getSelectedIndex();						
						
						MemberVo vo = new MemberVo(mId, mName, rDate, grade);
						dao.update(vo);
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					
					
				}
			});
			button.setBounds(77, 172, 116, 23);
		}
		return button;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("New label");
			label_5.setOpaque(true);
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setBackground(new Color(152, 251, 152));
			label_5.setBounds(12, 205, 360, 35);
		}
		return label_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String mId = tmId.getText();
					MemberDao dao = new MemberDao();
					MemberVo vo = dao.search(mId);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					
					tmName.setText( vo.getmName() );
					trDate.setText(sdf.format(vo.getrDate()) ); 
					tgrade.setSelectedIndex( vo.getGrade());
				}
			});
			btnNewButton.setBounds(205, 39, 97, 23);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 68, 360, 2);
		}
		return separator;
	}
}
