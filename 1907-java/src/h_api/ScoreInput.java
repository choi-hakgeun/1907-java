package h_api;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import f_inheri.Account;
import f_inheri.Bank;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ScoreInput extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField irum;
	private JTextField snoText;
	private JTextField scoreText;
	private JButton input;

	/**
	 * Create the panel.
	 */
	public ScoreInput() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getIrum());
		add(getSnoText());
		add(getScoreText());
		add(getInput());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(Color.CYAN);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 426, 24);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uBA85");
			lblNewLabel_1.setBackground(SystemColor.activeCaption);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBounds(12, 70, 72, 24);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uBC88");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setOpaque(true);
			lblNewLabel_2.setBackground(SystemColor.activeCaption);
			lblNewLabel_2.setBounds(12, 104, 72, 24);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC131\uC801");
			lblNewLabel_3.setBackground(SystemColor.activeCaption);
			lblNewLabel_3.setOpaque(true);
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(12, 138, 72, 24);
		}
		return lblNewLabel_3;
	}
	private JTextField getIrum() {
		if (irum == null) {
			irum = new JTextField();
			irum.setBounds(107, 72, 211, 22);
			irum.setColumns(10);
		}
		return irum;
	}
	private JTextField getSnoText() {
		if (snoText == null) {
			snoText = new JTextField();
			snoText.setBounds(105, 106, 213, 22);
			snoText.setColumns(10);
		}
		return snoText;
	}
	private JTextField getScoreText() {
		if (scoreText == null) {
			scoreText = new JTextField();
			scoreText.setBounds(107, 140, 211, 22);
			scoreText.setColumns(10);
		}
		return scoreText;
	}
	private JButton getInput() {//int sno, String name, int score
		if (input == null) {
			input = new JButton("\uC131\uC801\uC785\uB825");//성적입력
			input.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//모든 항목이 입력되었는가 체크
					if(!irum.getText().equals("") && !snoText.getText().equals("") && !scoreText.getText().equals("")) {
						
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
			input.setBounds(107, 172, 211, 24);
		}
		return input;
	}
}
