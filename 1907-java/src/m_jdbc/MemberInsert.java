package m_jdbc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberInsert extends JInternalFrame {
	List<MemberVo> list;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JLabel label_1;
	private JTextField tmId;
	private JTextField tmName;
	private JTextField trDate;
	private JComboBox tgrade;
	private JButton btnNewButton;
	private JLabel status;

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
		getContentPane().add(getTmId());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTgrade());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

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
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(73, 40, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(73, 65, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(73, 93, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JComboBox getTgrade() {
		if (tgrade == null) {
			tgrade = new JComboBox();
			tgrade.setModel(new DefaultComboBoxModel(new String[] {"1 \uD559\uB144", "2 \uD559\uB144", "3 \uD559\uB144", "4 \uD559\uB144", "5 \uD559\uB144", "6 \uD559\uB144", "7 \uD559\uB144", "8 \uD559\uB144", "9 \uD559\uB144", "10 \uD559\uB144"}));
			tgrade.setBounds(73, 117, 116, 21);
		}
		return tgrade;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
<<<<<<< HEAD
					MemberDao dao = new MemberDao();
					MemberVo vo = new MemberVo();
					
					try {
						vo.setmId( tmId.getText() );
						vo.setmName(tmName.getText() );
						vo.setrDate(sdf.parse(trDate.getText()) );
						vo.setGrade(tgrade.getSelectedIndex()+1);
						
						int cnt = dao.insert(vo);
						if(cnt>0) {
							status.setText("자료가 입력되었습니다.");
							
						}else {
							status.setText("입력중 오류 발생");
						}						
					}catch(Exception ex){
						ex.printStackTrace();
					}
=======
>>>>>>> refs/remotes/origin/master
				}
			});
			btnNewButton.setBounds(73, 148, 116, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(152, 251, 152));
			status.setOpaque(true);
			status.setBounds(12, 204, 360, 36);
		}
		return status;
	}
}
