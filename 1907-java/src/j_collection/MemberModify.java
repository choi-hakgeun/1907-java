package j_collection;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberModify extends JInternalFrame {
	int index;
	List<MemberVo> list;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField mId;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberModify frame = new MemberModify();
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
	public MemberModify() {
		super("회원정보수정", false, true, true, true);
		setVisible(true);
		
		setBounds(70, 100, 338, 224);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getMId());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());

	}
	public void search() { //검색버튼
		index = -1;
		pwd.setText("");
		mName.setText("");
		phone.setText("");
		
		String find = mId.getText();
		for(int i = 0; i<list.size();i++) {
			MemberVo vo = list.get(i);
			if(vo.getmId().equals(find)) { //문자열이 완벽하게 일치하도록 이퀄을 사용함.
				index = i;
				break;
			}
		}
		
		if( index >=0 ) {
			MemberVo vo = list.get(index);
			pwd.setText(vo.getPwd());
			mName.setText(vo.getmName());
			phone.setText(vo.getPhone());
			
			status.setBackground(Color.BLUE);
			status.setText("자료가 검색되었습니다.");
		}else {
			status.setBackground(Color.RED);
			status.setText("찾는 자료가 없습니다.");
			
		}
	}
	public void modify() { //수정버튼
		index = -1;	
		String find = mId.getText();
		for(int i = 0; i<list.size();i++) {
			MemberVo vo = list.get(i);
			if(vo.getmId().equals(find)) { //문자열이 완벽하게 일치하도록 이퀄을 사용함.
				index = i;
				break;
			}
		}
			if(index >= 0 ) {
				
				MemberVo vo = list.get(index);
				vo.setPwd(pwd.getText());
				vo.setmName(mName.getText());
				vo.setPhone(phone.getText());
				
				status.setText("수정이 완료되었습니다.");				
			}else {
				status.setText("먼저 검색해 주세요");
		}
			
		
	}
	
	public void delete() { //삭제버튼
		index = -1;
		String find = mId.getText();
		for(int i = 0; i<list.size();i++) {
			MemberVo vo = list.get(i);
			if(vo.getmId().equals(find)) { //문자열이 완벽하게 일치하도록 이퀄을 사용함.
				index = i;
				break;
			}
		}
		if( index >=0 ) {
			MemberVo vo = list.get(index);
			list.remove(index);
			
			status.setText("자료가 삭제되었습니다.");
		}else {
			status.setBackground(Color.RED);
			status.setText("검색하세요.");
			
		}
	}
	
	public MemberModify(List<MemberVo> list) {
		this();
		this.list = list;
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
			lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_1.setBounds(12, 35, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(12, 60, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setBounds(12, 85, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setBounds(81, 7, 116, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBounds(81, 32, 116, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(81, 57, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(81, 82, 116, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");//수정
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					modify();
				}
			});
			btnNewButton.setBounds(81, 113, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");//삭제
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();
				}
			});
			btnNewButton_1.setBounds(209, 113, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uAC80\uC0C9"); //검색
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			btnNewButton_2.setBounds(209, 6, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uAC80\uC0C9\uD560 \uC544\uC774\uB514\uB97C \uC785\uB825\uD558\uC138\uC694.");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(204, 204, 255));
			status.setOpaque(true);
			status.setBounds(81, 146, 225, 29);
		}
		return status;
	}
}
