package h_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class PatternExam2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField id;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JTextField email;
	private JTextField zip;
	private JButton btnNewButton;
	private JLabel status;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatternExam2 frame = new PatternExam2();
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
	public PatternExam2() {
		setTitle("\uD68C\uC6D0\uAC00\uC785(Pattern Chack)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getId());
		contentPane.add(getPwd());
		contentPane.add(getMName());
		contentPane.add(getPhone());
		contentPane.add(getEmail());
		contentPane.add(getZip());
		contentPane.add(getBtnNewButton());
		contentPane.add(getStatus());
		contentPane.add(getLblNewLabel_5());
	}
	public void check() {
		String regexp = "";
		String value = "";
		
		//아이디
		regexp = "[\\w+!$]{4,10}";
		//regexp = "([\\w+)(?=.*[!$_].{3,9}";
		//regexp = "\\w+\\$\\!\\_{4,10}";
		value = id.getText();
		if(!Pattern.matches(regexp,  value)) {
			status.setText("아이디 오류입니다.");
			id.requestFocus();
			id.selectAll();
		}
		//암호
		regexp = "[\\w+!$]{4,10}";
		//regexp = "(\\w+\\$\\!\\_){4,10}";
		value = pwd.getText();
		if(!Pattern.matches(regexp,  value)) {
			status.setText("암호 오류입니다.");
			pwd.requestFocus();
			pwd.selectAll();
		}
		//성명
		regexp = "[가-힣]{2,20}";
		value = mName.getText();
		if(!Pattern.matches(regexp,  value)) {
			status.setText("성명 오류입니다.");
			mName.requestFocus();
			mName.selectAll();
		}
		//연락처
		regexp = "\\d{2,3}-\\d{3,4}-\\d{4}";
		value = phone.getText();
		if(!Pattern.matches(regexp,  value)) {
			status.setText("연락처 오류입니다.");
			phone.requestFocus();
			phone.selectAll();
		}
		//이메일 체크
		regexp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		value = email.getText();
		if(!Pattern.matches(regexp,  value)) {
			status.setText("이메일이 오류입니다.");
			email.requestFocus();
			email.selectAll();
		}
		//우편번호
		regexp = "\\d{2}-\\d{3}";
		value = zip.getText();
		if(!Pattern.matches(regexp,  value)) {
			status.setText("우편번호 오류입니다.");
			zip.requestFocus();
			zip.selectAll();
		}

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC554\uD638");
			lblNewLabel_1.setBounds(12, 38, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC131\uBA85");
			label.setBounds(12, 66, 57, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC5F0\uB77D\uCC98");
			label_1.setBounds(12, 94, 57, 15);
		}
		return label_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC774\uBA54\uC77C");
			lblNewLabel_2.setBounds(12, 122, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC6B0\uD3B8\uBC88\uD638");
			lblNewLabel_3.setBounds(12, 150, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getId() {
		if (id == null) {
			id = new JTextField();
			id.setText("dfs332$$");
			id.setBounds(73, 7, 170, 21);
			id.setColumns(10);
		}
		return id;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setText("dfasf1135");
			pwd.setBounds(73, 35, 170, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setText("\uD55C\uAE00");
			mName.setBounds(73, 63, 170, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setText("010-7159-1231");
			phone.setBounds(73, 91, 170, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JTextField getEmail() {
		if (email == null) {
			email = new JTextField();
			email.setText("nojak@naver.com");
			email.setBounds(73, 119, 170, 21);
			email.setColumns(10);
		}
		return email;
	}
	private JTextField getZip() {
		if (zip == null) {
			zip = new JTextField();
			zip.setText("12-123");
			zip.setBounds(73, 147, 170, 21);
			zip.setColumns(10);
		}
		return zip;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCCB4\uD06C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					check();
				}
			});
			btnNewButton.setBounds(73, 178, 170, 21);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setBackground(SystemColor.activeCaption);
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 209, 412, 52);
		}
		return status;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\JHTA\\Desktop\\\uB2E4\uC6B4\uB85C\uB4DC.png"));
			lblNewLabel_5.setBounds(255, 10, 169, 189);
		}
		return lblNewLabel_5;
	}
}
