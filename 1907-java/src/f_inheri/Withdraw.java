package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Withdraw extends JPanel {
	private JLabel lblNewLabel;
	private JLabel label;
	private JButton btnNewButton;
	private JTextField sno;
	private JLabel lblNewLabel_1;
	private JTextField mName;
	private JLabel lblNewLabel_2;
	private JTextField amount;
	private JLabel lblNewLabel_3;
	private JTextField wAmt;
	private JButton btnNewButton_1;
	
	private int pos;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public Withdraw() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLabel());
		add(getBtnNewButton());
		add(getSno());
		add(getLblNewLabel_1());
		add(getMName());
		add(getLblNewLabel_2());
		add(getAmount());
		add(getLblNewLabel_3());
		add(getWAmt());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCD9C\uAE08");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
			lblNewLabel.setBounds(12, 10, 426, 53);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC608\uAE08\uC8FC");
			label.setBounds(12, 110, 57, 15);
		}
		return label;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DecimalFormat df = new DecimalFormat("##,###,###,###.#");
					String find = sno.getText();
					pos = -1;
					for(int i = 0; i<Bank.count ; i++ ) {
						Account a = Bank.ac[i];
						
						if(a.getsNo().equals(find)) {
							mName.setText(a.getmName());
							amount.setText(df.format(a.getAmount()));
							pos = i;
							status.setText("출금액을 입력하세요.");
							break;
						}//if end
					}//for end
					if(pos == -1) {
						status.setText("일치하는 계좌정보가 없습니다.");						
					}
				}
			});
			btnNewButton.setBounds(341, 73, 97, 23);
		}
		return btnNewButton;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(81, 73, 248, 23);
			sno.setColumns(10);
		}
		return sno;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setBounds(12, 73, 63, 23);
		}
		return lblNewLabel_1;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setEditable(false);
			mName.setBounds(81, 107, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC794\uC561");
			lblNewLabel_2.setBounds(12, 150, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setEditable(false);
			amount.setBounds(81, 147, 116, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCD9C\uAE08\uC561");
			lblNewLabel_3.setBounds(12, 181, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getWAmt() {
		if (wAmt == null) {
			wAmt = new JTextField();
			wAmt.setBounds(81, 178, 116, 21);
			wAmt.setColumns(10);
		}
		return wAmt;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uCD9C\uAE08\uCC98\uB9AC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						long amt = Long.parseLong(wAmt.getText());						
						if(pos>=0) {
							Account a = Bank.ac[pos];
							if(amt <= a.getAmount()) {
								long temp = a.getAmount() - amt;
								a.setAmount(temp);
							}else {
								status.setText("잔고가 부족합니다.");
							}
						}					
					}catch(Exception ex){
						status.setText("출금액에 문자나 공백이 있습니다.");
					}
				}
			});
			btnNewButton_1.setBounds(79, 209, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setOpaque(true);
			status.setBackground(new Color(218, 165, 32));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(89, 242, 294, 23);
		}
		return status;
	}
}
