package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ScoreDelete extends JInternalFrame {
	
	ScoreDao dao = new ScoreDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private JLabel label;
	private JLabel label_1;
	private JTextField tserial;
	private JButton button;
	private JSeparator separator;
	private JLabel label_2;
	private JTextField tmId;
	private JLabel label_3;
	private JTextField tmName;
	private JLabel label_4;
	private JTextField trDate;
	private JLabel label_5;
	private JTextField tsubject;
	private JLabel label_6;
	private JTextField tscore;
	private JButton button_1;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreDelete frame = new ScoreDelete();
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
	public ScoreDelete() {
		super("성적 삭제", false, true, true, true);
		setVisible(true);
		
		setTitle("\uC131\uC801 \uC815\uBCF4 \uC0AD\uC81C");
		setBounds(0, 258, 358, 311);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTserial());
		getContentPane().add(getButton());
		getContentPane().add(getSeparator());
		getContentPane().add(getLabel_2());
		getContentPane().add(getTmId());
		getContentPane().add(getLabel_3());
		getContentPane().add(getTmName());
		getContentPane().add(getLabel_4());
		getContentPane().add(getTrDate());
		getContentPane().add(getLabel_5());
		getContentPane().add(getTsubject());
		getContentPane().add(getLabel_6());
		getContentPane().add(getTscore());
		getContentPane().add(getButton_1());
		getContentPane().add(getStatus());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC131\uC801 \uC0AD\uC81C");
			label.setOpaque(true);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBackground(new Color(152, 251, 152));
			label.setBounds(12, 10, 322, 29);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Serial");
			label_1.setBounds(12, 49, 45, 15);
		}
		return label_1;
	}
	private JTextField getTserial() {
		if (tserial == null) {
			tserial = new JTextField();
			tserial.setColumns(10);
			tserial.setBounds(59, 46, 116, 21);
		}
		return tserial;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC870\uD68C");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int serial = Integer.parseInt(tserial.getText());
					ScoreVo vo = dao.search(serial);
										
					if(vo == null) {
						status.setText("자료가 없습니다.");
					}else {
						tmId.setText( vo.getmId() );
						tmName.setText(vo.getmName());
						trDate.setText(sdf.format(vo.getrDate()) );
						tsubject.setText( vo.getSubject() );
						tscore.setText(vo.getScore()+"");						
					}
				}
			});
			button.setBounds(187, 45, 97, 23);
		}
		return button;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 75, 317, 2);
		}
		return separator;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC544\uC774\uB514");
			label_2.setBounds(12, 87, 45, 15);
		}
		return label_2;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setColumns(10);
			tmId.setBounds(59, 84, 116, 21);
		}
		return tmId;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC131\uBA85");
			label_3.setBounds(12, 112, 45, 15);
		}
		return label_3;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setColumns(10);
			tmName.setBounds(59, 109, 116, 21);
		}
		return tmName;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uC751\uC2DC\uC77C");
			label_4.setBounds(12, 137, 45, 15);
		}
		return label_4;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setColumns(10);
			trDate.setBounds(59, 134, 116, 21);
		}
		return trDate;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uACFC\uBAA9");
			label_5.setBounds(12, 162, 45, 15);
		}
		return label_5;
	}
	private JTextField getTsubject() {
		if (tsubject == null) {
			tsubject = new JTextField();
			tsubject.setColumns(10);
			tsubject.setBounds(59, 159, 116, 21);
		}
		return tsubject;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC810\uC218");
			label_6.setBounds(12, 187, 45, 15);
		}
		return label_6;
	}
	private JTextField getTscore() {
		if (tscore == null) {
			tscore = new JTextField();
			tscore.setColumns(10);
			tscore.setBounds(59, 184, 116, 21);
		}
		return tscore;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC0AD\uC81C");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int serial = Integer.parseInt( tserial.getText() );
					int cnt = dao.delete(serial);
					
					if(cnt>0) status.setText("자료가 삭제되었습니다.");
					else      status.setText("자료 삭제 중 오류 발생");
					
					tmId.setText("");
					tmName.setText("");
					trDate.setText("");
					tsubject.setText("");
					tscore.setText("");
					tserial.requestFocus();
					tserial.selectAll();
					
				}
			});
			button_1.setBounds(59, 215, 116, 23);
		}
		return button_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(127, 255, 212));
			status.setBounds(12, 246, 322, 29);
		}
		return status;
	}
}
