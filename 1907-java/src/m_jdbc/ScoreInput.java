package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ScoreInput extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tmId;
	private JTextField trDate;
	private JTextField tsubject;
	private JTextField tscore;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreInput frame = new ScoreInput();
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
	public ScoreInput() {
		super("성적입력", false, true, true, true);
		setVisible(true);
		
		setTitle("\uC131\uC801 \uC815\uBCF4 \uC785\uB825");
		setBounds(0, 0, 365, 258);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getTmId());
		getContentPane().add(getTrDate());
		getContentPane().add(getTsubject());
		getContentPane().add(getTscore());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC785\uB825");
			lblNewLabel.setBackground(new Color(152, 251, 152));
			lblNewLabel.setOpaque(true);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 322, 29);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(12, 49, 45, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC751\uC2DC\uC77C");
			lblNewLabel_2.setBounds(12, 74, 45, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uACFC\uBAA9");
			lblNewLabel_3.setBounds(12, 99, 45, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC810\uC218");
			lblNewLabel_4.setBounds(12, 124, 45, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(59, 46, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(59, 71, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JTextField getTsubject() {
		if (tsubject == null) {
			tsubject = new JTextField();
			tsubject.setBounds(59, 96, 116, 21);
			tsubject.setColumns(10);
		}
		return tsubject;
	}
	private JTextField getTscore() {
		if (tscore == null) {
			tscore = new JTextField();
			tscore.setBounds(59, 121, 116, 21);
			tscore.setColumns(10);
		}
		return tscore;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						ScoreDao dao = new ScoreDao();
						
						ScoreVo vo = new ScoreVo();
						vo.setmId( tmId.getText() );
						vo.setrDate( sdf.parse(trDate.getText()));
						vo.setSubject( tsubject.getText());
						vo.setScore( Integer.parseInt( tscore.getText()) );
						
						int cnt = dao.insert(vo);
						if(cnt>0) status.setText("성적정보가 입력되었습니다.");
						else      status.setText("정보 입력 중 오류발생");
						
						tmId.requestFocus();
						tmId.selectAll();
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				}
			});
			btnNewButton.setBounds(59, 152, 116, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(127, 255, 212));
			status.setOpaque(true);
			status.setBounds(12, 185, 322, 29);
		}
		return status;
	}
}
