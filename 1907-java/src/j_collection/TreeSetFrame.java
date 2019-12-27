package j_collection;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NavigableSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TreeSetFrame extends JInternalFrame {
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeSetFrame frame = new TreeSetFrame();
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
	public TreeSetFrame() {
		super("TreeSetFrame", false, true, true, true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getScrollPane());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());

	}
	public void process() {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		StringTokenizer tokens = new StringTokenizer(textField.getText(), ",");
		
		textArea.setText("");
		while(tokens.hasMoreTokens()) {
			//textArea.append(tokens.nextToken() + "\n");
			scores.add(Integer.parseInt(tokens.nextToken()));
		}
		
		textArea.append("\n최소값 : " + scores.first());
		textArea.append("\n최소값 : " + scores.last());
		textArea.append("\n60점 이하 : " + scores.lower(60));
		textArea.append("\n90점 이상 : " + scores.higher(90));
		
		textArea.append("\n60점 바로 밑 값 : " + scores.floor(60));
		textArea.append("\n90점 바로 위 값 : " + scores.ceiling(90));
		
		textArea.append("\n-------------------------");
		while(!scores.isEmpty()) {
			textArea.append("\n"+scores.pollFirst()+"::::" + scores.size());
		}
		
	}
	public void asc() {//오름차순 정렬
		TreeSet<Integer> set = new TreeSet<Integer>();
		StringTokenizer tokens = new StringTokenizer(textField.getText(),",");
		
		while(tokens.hasMoreTokens()) {
			set.add(Integer.parseInt(tokens.nextToken()));
		}
		NavigableSet<Integer> tempSet = set.descendingSet();
		NavigableSet<Integer> ascendingSet = tempSet.descendingSet();
		textArea.setText("-----------오름차순 정렬결과---------\n");
		for(Integer i : ascendingSet) {
			textArea.append(i+ "\n");
		}
	}
	
	public void desc() {//내림차순 정렬
		TreeSet<Integer> set = new TreeSet<Integer>();
		StringTokenizer tokens = new StringTokenizer(textField.getText(),",");
		while(tokens.hasMoreTokens()) {
			set.add(Integer.parseInt(tokens.nextToken()));
		}
		NavigableSet<Integer> descendingSet = set.descendingSet();
		textArea.setText("-----------내림차순 정렬결과---------\n");
		for(Integer i : descendingSet) {
			textArea.append(i+ "\n");
		}
	}
	
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("43243,4,343,24,324,");
			textField.setBounds(12, 10, 293, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2E4\uD589");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					process();
				}
			});
			btnNewButton.setBounds(317, 9, 97, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 67, 386, 173);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("DESC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					desc();
				}
			});
			btnNewButton_1.setBounds(208, 41, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("ASC");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					asc();
				}
			});
			btnNewButton_2.setBounds(99, 41, 97, 23);
		}
		return btnNewButton_2;
	}
}
