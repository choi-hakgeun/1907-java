package h_api;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import f_inheri.Account;
import f_inheri.Bank;

import java.awt.Color;
import java.text.DecimalFormat;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class SortBySno extends JPanel {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public SortBySno() {
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());
		showList();

	}
	public void showList() {
		int temp = 0;
		Student a = SortEx.n[i];
		 for(int i=0; i<n.length-1; i++) { //기준
			 for(int j= i+1; j<n.length ; j++) {
				 if(n[i]<n[j]) {//swap 부등호만 작다로 바꾸면 내림차순이됨
					 temp = n[i];
					 n[i] = n[j];
					 n[j] = temp;
				 }//if end
			 }//for j end
		 }//for i end
		String str = "";
		DecimalFormat df = new DecimalFormat();
		
		for(int i = 0 ; i<SortEx.count ; i++) {
			Student a = SortEx.n[i]; //SortEx.n[i]가 가지고 있는 요소를 a에 담아서 
			str += a.getSno();
			str += "\t" + a.getName();
			str += "\t" + df.format(a.getScore());
			str += "\n"; 
			}
		textArea.setText(str);
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
			lblNewLabel_1 = new JLabel("\uD559\uBC88                   \uC774\uB984                    \uC131\uC801");
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
