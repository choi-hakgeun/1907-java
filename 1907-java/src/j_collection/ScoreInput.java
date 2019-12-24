package j_collection;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ScoreInput extends JInternalFrame {
	
	Map<String, List<ScoreVo>> map;
	
	private JButton btnNewButton;
	private JLabel status;
	private JLabel lblNewLabel;
	private InputPanel panel;

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
		setBounds(10, 10, 276, 422);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getPanel());

	}
	public ScoreInput(Map<String, List<ScoreVo>> map) {
		this();
		this.map = map;
		
	}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//무결성 체크
					//todo
					
					String sno = panel.tSno.getText();
					String mName = panel.tmName.getText();
					int kor = Integer.parseInt(panel.tKor.getText());
					int eng = Integer.parseInt(panel.tEng.getText());
					int mat = Integer.parseInt(panel.tMat.getText());
					String exam = "";
					int grade = 0;
					if(panel.rExam1.isSelected()) {
						exam = "중간";
					}else {
						exam = "기말";
					}
					
					grade = panel.cGrade.getSelectedIndex()+1;
					
					ScoreVo vo = new ScoreVo(sno, mName, exam, grade, kor, eng, mat);
					
					panel.tTot.setText(vo.getTot()+"");
					panel.tAvg.setText(String.format("%5.1f", vo.getAvg()));
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.insert(vo);
					if(b) {
						status.setText("데이터가 저장되었습니다.");
					}else {
						status.setText("저장중 오류 발생");
					}
				}
			});
			btnNewButton.setBounds(70, 316, 116, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBackground(SystemColor.info);
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 349, 236, 34);
		}
		return status;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(135, 206, 250));
			lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 236, 34);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBounds(12, 54, 236, 252);
		}
		return panel;
	}
}
