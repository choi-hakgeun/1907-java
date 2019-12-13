package h_api2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.util.Objects;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SortByScore extends JPanel {
	private JLabel lblNewLabel;
	public JLabel status;
	
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public SortByScore(JLabel status) {
		this();
		this.status = status;
		sortList();
	}
	public SortByScore() {
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());

	}
	public void sortList() {
		Student temp = null;
		int result = 0;
		Student s1 = null, s2 = null;
		for(int i = 0; i<StudentApp.count-1; i++) {
			for(int j = (i+1); j<StudentApp.count; j++) {
				s1 = StudentApp.student[i];
				s2 = StudentApp.student[j];
				result = Objects.compare(s1, s2, new StudentComp('s'));
				if(result<0) {
					temp = StudentApp.student[i];
					StudentApp.student[i] = StudentApp.student[j];
					StudentApp.student[j] = temp;
				}//if
			}//for
		}//for

		textArea.setText("ddd");
		for(int i = 0; i<StudentApp.count; i++) {
			textArea.append(StudentApp.student[i] + "\n");
		}
		status.setText("");
	}
	

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC21C\uC815\uB82C");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(Color.CYAN);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 426, 25);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 53, 426, 201);
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88                             \uC774\uB984                       \uC131\uC801");
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
