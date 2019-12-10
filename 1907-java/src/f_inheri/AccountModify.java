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

public class AccountModify extends JPanel {
	private JLabel label;
	private JTextField sno;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JTextField mName;
	private JLabel lblNewLabel_1;
	private JTextField amount;
	private JButton btnNewButton_1;
	
	private int pos; //검색된 고객의 위치번호
	private JLabel status;
	/**
	 * Create the panel.
	 */
	public AccountModify() {
		setLayout(null);
		add(getLabel());
		add(getSno());
		add(getBtnNewButton());
		add(getLblNewLabel());
		add(getMName());
		add(getLblNewLabel_1());
		add(getAmount());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uACC4\uC815 \uC218\uC815 \uC815\uBCF4");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.BLUE);
			label.setFont(new Font("굴림", Font.PLAIN, 30));
			label.setBounds(12, 10, 426, 58);
		}
		return label;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(133, 78, 192, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9"); //검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String find = sno.getText();//검색부분 텍스트박스
					pos = -1;
					for(int i = 0; i<Bank.count ; i++) {
						Account a = Bank.ac[i];
						if(a.getsNo().equals(find)) {
							mName.setText(a.getmName());//텍스트에 줄 값
							amount.setText(a.getAmount() +"");
							pos = i;
							break; //전역형변수로 값을 저장해주어야함.
						}// if end
					}//for end
				}//Act end
			});
			btnNewButton.setBounds(341, 77, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel.setBounds(12, 113, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(81, 109, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_1.setBounds(12, 143, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(81, 140, 168, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815 \uD655\uC778");//수정하기버튼
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!mName.getText().equals("") && !amount.getText().equals("")) {
						try {
							if(pos>=0) {													
								Account a = Bank.ac[pos];
								Long amt = Long.parseLong(amount.getText());
								a.setmName(mName.getText());
								a.setAmount(amt);
							}//if end							
						}catch(Exception ex) {
							status.setText("예금액에 문자나 공백이 있습니다.");
						}
						
						}else {
						status.setText("입력항목을 확인하세요");
					}
					
					
					
				}
			});
			btnNewButton_1.setBounds(81, 171, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setOpaque(true);
			status.setBackground(new Color(218, 165, 32));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(new Color(0, 0, 0));
			status.setBounds(12, 212, 426, 38);
		}
		return status;
	}
}
