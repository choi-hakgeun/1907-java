package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AccountCreate extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField sno;
	private JLabel lblNewLabel_2;
	private JTextField mName;
	private JLabel lblNewLabel_3;
	private JTextField amount;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public AccountCreate() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getSno());
		add(getLblNewLabel_2());
		add(getMName());
		add(getLblNewLabel_3());
		add(getAmount());
		add(getBtnNewButton());
		add(getStatus());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC815\uC0DD\uC131");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
			lblNewLabel.setBounds(12, 10, 426, 47);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(12, 67, 69, 21);
		}
		return lblNewLabel_1;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			sno.setBounds(113, 67, 116, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_2.setBounds(12, 98, 89, 18);
		}
		return lblNewLabel_2;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(113, 98, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_3.setBounds(12, 126, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(113, 129, 116, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCD94\uAC00");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//모든 항목이 입력되었는가 체크
					if(!sno.getText().equals("") && !mName.getText().equals("") && !amount.getText().equals("")) {
						
					try {
						// 계좌번호의 중복 여부 체크
						for(int i = 0 ; i<Bank.count ; i++) {
							Account a = Bank.ac[i];
							if(a.getsNo().equals(sno.getText())) {
								throw new IOException("계좌번호가 중복되었습니다.");
							}
						}
						//예금액이 숫자로만 이루어졌는지 체크
						Long amt = Long.parseLong(amount.getText());
						Account ac = new Account(mName.getText(), sno.getText(), amt);
						Bank.ac[Bank.count] = ac;
						Bank.count++;
						
						status.setText(Bank.count + " 번째 고객이 등록되었습니다.");
						mName.setText("");
						amount.setText("");
						sno.selectAll();
						
					}catch(IOException ex2) {
						status.setText(ex2.getMessage());
						sno.requestFocus();
						sno.selectAll();
					}
					catch(Exception ex) {
						status.setText("예금액에 문자나 공백이 있습니다.");
						amount.requestFocus();
						amount.selectAll();
					    }
					}else {
						status.setText("입력항목을 확인하세요");
						
					}
				}
			});
			btnNewButton.setBounds(113, 160, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(new Color(255, 69, 0));
			status.setBounds(12, 193, 426, 30);
		}
		return status;
	}
}
