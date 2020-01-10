package z_exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListEx extends JFrame {
	
	List<String> list = new ArrayList<String>();

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_1;
	private JButton btnNewButton_3;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListEx frame = new ListEx();
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
	public ListEx() {
		setTitle("ListEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getScrollPane());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 10, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uB825");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String d= textField.getText();
					list.add(d);
					//textField.setText("");
				}
			});
			btnNewButton.setBounds(140, 9, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String d = textField.getText();
					for(int i = list.size()-1; i>=0; i--) {
						String temp = list.get(i);
						if(d.equals(temp)) {
							list.remove(i);
						}
					}					
				}
			});
			btnNewButton_1.setBounds(249, 9, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC870\uD68C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					textArea.setText("");
					String fine = textField.getText();
					int n=0;
					for(int i=0; i<list.size(); i++) {
						String d = list.get(i);
						if(d.indexOf(fine)>=0 || fine.equals("")) {
							textArea.append((n+1)+":"+d+"\n");
							n++;
						}							
					}					
				}
			});
			btnNewButton_2.setBounds(140, 42, 97, 23);
		}
		return btnNewButton_2;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(12, 41, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC218\uC815");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String find = textField.getText();
					String repl = textField_1.getText();
					
					for(int i=0; i<list.size(); i++) {
						String d = list.get(i);
						if(d.equals(find)) {
							list.set(i, repl);
						}
					}
				}
			});
			btnNewButton_3.setBounds(249, 42, 97, 23);
		}
		return btnNewButton_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 72, 337, 153);
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
