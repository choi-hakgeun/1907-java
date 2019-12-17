package h_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class ComparableExam extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComparableExam frame = new ComparableExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void sortNum() {//숫자정렬
		String [] temp = textField.getText().split(",");
		Integer [] intArray = new Integer[temp.length]; //int 형을 Integer형으로 바꿔야함.
		for(int i = 0; i<temp.length ; i++) {
			intArray[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(intArray);//오름차순정렬
		
		StringBuilder sb = new StringBuilder(1024);
		for(int i = 0; i<intArray.length; i++) {
			String str = String.format("[%2d] = %s\n", i, intArray[i]);
			sb.append(str);
		}
		
		//how 1 (bubble sort 방법으로 내림차 정렬)
		boolean sort = true;
		int lastIndex = intArray.length-1;
		while(sort) {
			sort = false;
			for(int i = 0; i<lastIndex; i++) {
				if(intArray[i] < intArray[i+1]) {
					int t = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = t;
					sort = true;
				}
			}
			lastIndex--;
		}//end of while
		sb.append("\n\n버블소트 내림차순 결과...........\n\n");
		
		for(int i = 0; i<intArray.length; i++) {
			String str = String.format("[%2d] = %s\n", i, intArray[i]);
			sb.append(str);
			}
		
		//how 2 java API
		//원본이 내림차순 정렬되었기 때문에 reverse하면 다시 오름차순
		Collections.reverse(Arrays.asList(intArray));//asList : 배열을 리스트처럼 사용
		
		sb.append("\n\n Java API를 사용한 reverse\n\n");
		for(int i = 0; i<intArray.length; i++) {
			String str = String.format("[%2d] = %s\n", i, intArray[i]);
			sb.append(str);
			}
		
		
		textArea.setText(sb.toString());
	}
	public void sortStr() {//문자정렬
		String[] temp = textField.getText().split(",");
		Arrays.sort(temp);
		
		textArea.setText("");
		for(int i = 0; i<temp.length; i++) {
			textArea.append(i + "=" + temp[i] + "\n");
		}
		
		textArea.append("\n\n java API를 사용한 내림차순 \n\n");
		Arrays.sort(temp, Collections.reverseOrder());
		for(int i = 0; i<temp.length; i++) {
			textArea.append(i + "=" + temp[i] + "\n");
		}
	}
	public void sortObj() {//object정렬
		String[]temp = textField.getText().split(",");
		 Score[] sArray = new Score[temp.length];
		 
		for(int i = 0; i<temp.length ; i++) {
			sArray[i] = new Score(temp[i]);
		}
		Collections.sort(Arrays.asList(sArray));
		Collections.reverse(Arrays.asList(sArray));
		
		textArea.setText("");
		for(int i = 0; i<sArray.length; i++) {
			textArea.append(sArray[i].toString());
		}
	}

	/**
	 * Create the frame.
	 */
	public ComparableExam() {
		setTitle("ComparableExam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}
	

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(SystemColor.textHighlight);
			panel.setPreferredSize(new Dimension(10, 80));
			panel.setLayout(null);
			panel.add(getTextField());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
		}
		return panel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("45,6,44,315,641,344,3144,344531,4416,544");
			textField.setBounds(0, 0, 424, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {//숫자정렬
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC22B\uC790\uC815\uB82C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {		
					sortNum();	
				}
			});
			btnNewButton.setBounds(33, 31, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {//문자정렬
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uBB38\uC790\uC815\uB82C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sortStr();
				}
			});
			btnNewButton_1.setBounds(163, 31, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {//객체정렬
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uAC1D\uCCB4\uC815\uB82C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sortObj();	
				}
			});
			btnNewButton_2.setBounds(293, 31, 97, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
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
}
