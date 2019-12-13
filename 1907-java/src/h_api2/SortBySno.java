package h_api2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import f_inheri.Account;
import f_inheri.Bank;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Objects;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class SortBySno extends JPanel {
	private JLabel lblNewLabel;
	public JLabel status;
	
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	
	public SortBySno(JLabel status) {
		this();
		this.status = status;
		sortList();
	}
	public SortBySno() {
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());
		//sortList();

	}
	public void sortList() {
		Student temp = null;
		int result = 0;
		 for(int i=0; i<StudentApp.count-1; i++) { //기준
			 for(int j= i+1; j<StudentApp.count ; j++) {
				 Student s1 = StudentApp.student[i];
				 Student s2 = StudentApp.student[j];
				 result = Objects.compare(s1, s2, new StudentComp('n'));
				 if(result>0) { //swap 부등호만 작다로 바꾸면 내림차순이됨
					 temp = StudentApp.student[i];
					 StudentApp.student[i] = StudentApp.student[j];
					 StudentApp.student[j] = temp;
					 
				 }//if end
			 }//for j end
		 }//for i end
		 
		textArea.setText("");
		
		for(int i = 0 ; i<StudentApp.count ; i++) {
			textArea.append(StudentApp.student[i] +"\n");
		}
		status.setText("");
			
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uBC88\uC21C\uC815\uB82C");
			lblNewLabel.setBackground(Color.CYAN);
			lblNewLabel.setOpaque(true);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 426, 24);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 51, 426, 202);
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88                      \uC774\uB984                     \uC131\uC801");
		}
		return lblNewLabel_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
