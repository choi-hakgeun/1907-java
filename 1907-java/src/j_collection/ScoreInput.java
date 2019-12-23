package j_collection;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ScoreInput extends JInternalFrame {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	ButtonGroup group = new ButtonGroup();
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField sno;
	private JTextField mName;
	private JRadioButton mid;
	private JRadioButton fin;
	private JTextField kor;
	private JTextField eng;
	private JTextField mat;
	private JTextField tot;
	private JTextField avg;
	private JComboBox grade;
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
		super("성적입력", true, true, true, true);
		setVisible(true);
		
		setTitle("\uC131\uC801\uC785\uB825");
		setBounds(100, 100, 276, 422);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getLblNewLabel_6());
		getContentPane().add(getLblNewLabel_7());
		getContentPane().add(getLblNewLabel_8());
		getContentPane().add(getSno());
		getContentPane().add(getMName());
		getContentPane().add(getMid());
		getContentPane().add(getFin());
		getContentPane().add(getKor());
		getContentPane().add(getEng());
		getContentPane().add(getMat());
		getContentPane().add(getTot());
		getContentPane().add(getAvg());
		getContentPane().add(getGrade());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}
	public ScoreInput(Map<String, Integer> map) {
		this();
		
	}
	public void input(ScoreVo vo) {
		ScoreDao sd = new ScoreDao();
		sd.insert(vo);
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uBC88");
			lblNewLabel.setBounds(12, 13, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uBA85");
			lblNewLabel_1.setBounds(12, 38, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC2DC\uD5D8\uC885\uB958");
			lblNewLabel_2.setBounds(12, 63, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uD559\uB144");
			lblNewLabel_3.setBounds(12, 88, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uAD6D\uC5B4");
			lblNewLabel_4.setBounds(12, 116, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC601\uC5B4");
			lblNewLabel_5.setBounds(12, 141, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC218\uD559");
			lblNewLabel_6.setBounds(12, 166, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uCD1D\uC810");
			lblNewLabel_7.setBounds(12, 191, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("\uD3C9\uADE0");
			lblNewLabel_8.setBounds(12, 216, 57, 15);
		}
		return lblNewLabel_8;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(81, 10, 116, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(81, 35, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JRadioButton getMid() {
		if (mid == null) {
			mid = new JRadioButton("\uC911\uAC04");
			mid.setBounds(77, 59, 57, 23);
			group.add(mid);
			mid.setSelected(true);
		}
		return mid;
	}
	private JRadioButton getFin() {
		if (fin == null) {
			fin = new JRadioButton("\uAE30\uB9D0");
			fin.setBounds(138, 59, 57, 23);
			group.add(fin);
		}
		return fin;
	}
	private JTextField getKor() {
		if (kor == null) {
			kor = new JTextField();
			kor.setBounds(81, 113, 116, 21);
			kor.setColumns(10);
		}
		return kor;
	}
	private JTextField getEng() {
		if (eng == null) {
			eng = new JTextField();
			eng.setBounds(81, 138, 116, 21);
			eng.setColumns(10);
		}
		return eng;
	}
	private JTextField getMat() {
		if (mat == null) {
			mat = new JTextField();
			mat.setBounds(81, 163, 116, 21);
			mat.setColumns(10);
		}
		return mat;
	}
	private JTextField getTot() {
		if (tot == null) {
			tot = new JTextField();
			tot.setBounds(81, 188, 116, 21);
			tot.setColumns(10);
		}
		return tot;
	}
	private JTextField getAvg() {
		if (avg == null) {
			avg = new JTextField();
			avg.setBounds(81, 213, 116, 21);
			avg.setColumns(10);
		}
		return avg;
	}
	private JComboBox getGrade() {
		if (grade == null) {
			grade = new JComboBox();
			grade.setBounds(81, 85, 114, 21);
		}
		return grade;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input(null);
				}
			});
			btnNewButton.setBounds(81, 244, 116, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBackground(SystemColor.info);
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 277, 183, 34);
		}
		return status;
	}
}
