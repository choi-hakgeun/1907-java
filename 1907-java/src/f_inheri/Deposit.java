package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposit extends JPanel {
	private JLabel label;
	private JLabel lblNewLabel;
	private JTextField sno;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextField mName;
	private JLabel lblNewLabel_2;
	private JTextField amount;
	private JButton btnNewButton_1;
	private int pos;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public Deposit() {
		setLayout(null);
		add(getLabel());
		add(getLblNewLabel());
		add(getSno());
		add(getBtnNewButton());
		add(getLblNewLabel_1());
		add(getMName());
		add(getLblNewLabel_2());
		add(getAmount());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC608\uAE08");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.RED);
			label.setFont(new Font("굴림", Font.PLAIN, 30));
			label.setBounds(12, 10, 426, 47);
		}
		return label;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel.setBounds(12, 67, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(81, 64, 215, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9"); //예금 검색버튼
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String find = sno.getText();//예금계좌 검색					
					pos = -1;
					
					for(int i = 0; i<Bank.count ; i++) {
						Account a = Bank.ac[i];
						if(a.getsNo().equals(find)) {
							mName.setText(a.getmName());//예금주
							pos = i;
							status.setText("예금액을 입력해주세요");
							break;
						}//if end
					}//for end
					if(pos == -1) {
						status.setText("일치하는 정보가 없습니다.");
					}
				}
			});
			btnNewButton.setBounds(308, 63, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_1.setBounds(12, 104, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setEditable(false);
			mName.setBounds(81, 101, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_2.setBounds(12, 136, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(81, 133, 116, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC785\uAE08\uCC98\uB9AC");//입금처리
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Long amt = Long.parseLong(amount.getText());
						if(pos >= 0) {
							Account a = Bank.ac[pos];
							long temp = a.getAmount() + amt;
							a.setAmount(temp);
						}					
					}catch(Exception ex) {
						status.setText("예금액에 문자나 공백이 있습니다.");
					}
				}
			});
			btnNewButton_1.setBounds(81, 164, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setOpaque(true);
			status.setBackground(new Color(218, 165, 32));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 194, 426, 31);
		}
		return status;
	}
}
