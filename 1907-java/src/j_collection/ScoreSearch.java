package j_collection;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreSearch extends JInternalFrame {
	Map<String, List<ScoreVo>> map;
	
	DefaultListModel<String> modelSno = new DefaultListModel<String>();
	DefaultListModel<String> modelExam = new DefaultListModel<String>();
	
	List<ScoreVo> list;
	
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JList listSno;
	private JScrollPane scrollPane_1;
	private JList listExam;
	private InputPanel panel;
	private JTextField textField;
	public JButton btnFind;
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
					ScoreSearch frame = new ScoreSearch();
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
	public ScoreSearch() {
		super("�����Է�", true, true, true, true);
		setVisible(true);
		
		setBounds (286, 10, 565, 430);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getScrollPane());
		getContentPane().add(getScrollPane_1());
		getContentPane().add(getPanel());
		getContentPane().add(getTextField_1());
		getContentPane().add(getBtnFind());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());

	}
	
	public ScoreSearch(Map<String, List<ScoreVo>> map) {
		this();
		this.map = map;
		
		//�й��� �����Ͽ� JList�� ǥ��
		Set<String> set = map.keySet();
		
		//JList�� �߰�
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			modelSno.addElement(iter.next());
		}
		listSno.setModel(modelSno);
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC218\uC815 / \uC0AD\uC81C");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(135, 206, 250));
			lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 20));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 519, 42);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 98, 114, 250);
			scrollPane.setViewportView(getListSno());
		}
		return scrollPane;
	}
	private JList getListSno() {
		if (listSno == null) {
			listSno = new JList();
			listSno.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent ev) {
					
					String sno = (String)listSno.getSelectedValue();
					if(sno == null) return;//���õ��� ���� ����� �Ʒ��� �귯�������� �ʵ���.
					
					list = map.get(sno);					
					modelExam = new DefaultListModel<>();
					for(int i = 0; i<list.size();i++) {
						ScoreVo vo = list.get(i);
						String temp = String.format("%s : %d (%s)", vo.getmName(), vo.getGrade(), vo.getExam());
						modelExam.addElement(temp);
					}//end for
					listExam.setModel(modelExam);
				}
			});
		}
		return listSno;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(138, 98, 163, 250);
			scrollPane_1.setViewportView(getListExam());
		}
		return scrollPane_1;
	}
	private JList getListExam() {
		if (listExam == null) {
			listExam = new JList();
			listExam.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					
					int index = listExam.getSelectedIndex();
					int grade = -1;
					
					if(index < 0) {
						return;						
					}
					
					ScoreVo vo = list.get(index);
					panel.tSno.setText(vo.getSno());
					panel.tmName.setText(vo.getmName());
					panel.tKor.setText( vo.getKor() + "");
					panel.tEng.setText( vo.getEng() + "");
					panel.tMat.setText( vo.getMat() + "");
					panel.tTot.setText( vo.getTot() + "");
					panel.tAvg.setText( String.format("%4.1f", vo.getAvg()));
					
					if(vo.getExam().equals("�߰�")) {
						panel.rExam1.setSelected(true);
					}else {
						panel.rExam2.setSelected(true);
					}
					//�г⼱��
					grade = vo.getGrade()-1;//1�г��� index�� 0���̱� ����.
					panel.cGrade.setSelectedIndex(grade);
					
				}
			});
		}
		return listExam;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBounds(313, 95, 218, 253);
		}
		return panel;
	}
	private JTextField getTextField_1() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(150, 64, 193, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnFind() {
		if (btnFind == null) {
			btnFind = new JButton("\uAC80\uC0C9");//�˻�			
			btnFind.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String findStr = textField.getText();
					ScoreDao dao = new ScoreDao(map);
					Map<String, List<ScoreVo>> newMap = dao.list(findStr);//��ġ���� �˻���ư�� Ŭ���ϸ�
					
					Set<String> set = newMap.keySet();
					modelSno = new DefaultListModel<String>();//
					Iterator<String> iter = set.iterator();
					while(iter.hasNext()) {
						modelSno.addElement(iter.next());
					}
					listSno.setModel(modelSno);
					modelExam.clear();
					
					//������ ����
					panel.tSno.setText("");
					panel.tmName.setText("");
					panel.tKor.setText("");
					panel.tEng.setText("");
					panel.tMat.setText("");
					panel.tTot.setText("");
					panel.tAvg.setText("");
					
				}
			});
			btnFind.setBounds(355, 63, 97, 23);
		}
		return btnFind;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = panel.tSno.getText();
					int index = listExam.getSelectedIndex();
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.delete(key, index);
					if(b) {
						status.setText("�ڷᰡ �����Ǿ����ϴ�.");
						//������ ����
						panel.tSno.setText("");
						panel.tmName.setText("");
						panel.tKor.setText("");
						panel.tEng.setText("");
						panel.tMat.setText("");
						panel.tTot.setText("");
						panel.tAvg.setText("");
						if(modelExam.size() >0) modelExam.remove(index);
						
						
					}else {
						status.setText("������ �����߻�.");
					}
				}
			});
			btnNewButton_1.setBounds(422, 358, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC218\uC815");//����
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String key = panel.tSno.getText();
					int index = listExam.getSelectedIndex();
										
					String mName = panel.tmName.getText();
					int kor = Integer.parseInt(panel.tKor.getText());
					int eng = Integer.parseInt(panel.tEng.getText());
					int mat = Integer.parseInt(panel.tMat.getText());
					String exam = "";
					int grade = 0;
					if(panel.rExam1.isSelected()) {
						exam = "�߰�";
					}else {
						exam = "�⸻";
					}
					
					grade = panel.cGrade.getSelectedIndex()+1;
					
					ScoreVo vo = new ScoreVo(key, mName, exam, grade, kor, eng, mat);
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.update(key, index, vo);
					if(b) {
						status.setText("�ڷᰡ ���������� �����Ǿ����ϴ�.");						
						
					}else {
						status.setText("������ ������ �߻��Ͽ����ϴ�.");
					}
					
					
					
				}
			});
			btnNewButton_2.setBounds(313, 358, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setOpaque(true);
			status.setBackground(new Color(250, 250, 210));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 362, 289, 29);
		}
		return status;
	}
}
