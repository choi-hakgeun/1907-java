package z_exam;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MapEx extends JFrame {
	
	Map<String, String> map = new HashMap<String, String>(); 

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapEx frame = new MapEx();
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
	public MapEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getBtnNewButton_6());
		contentPane.add(getScrollPane());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(88, 11, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(88, 42, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("kyes");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					//1.
					Set<String> keys =map.keySet();
					for(String k : keys) {
						textArea.append(k + "\n");
					}
					//2.
					textArea.append("....how2................\n");
					Set<String> key2 = map.keySet();
					Iterator<String> iter = key2.iterator();
					while(iter.hasNext()) {
						String k = iter.next();
						textArea.append(k + "\n");
					}
				}
			});
			btnNewButton.setBounds(216, 41, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Values");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					textArea.setText("");
					Collection<String> values = map.values();
					for(String v : values) {
						textArea.append(v+"\n");
					}
							
				}
			});
			btnNewButton_1.setBounds(325, 41, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("KEY");
			lblNewLabel.setBounds(19, 14, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("VALUE");
			lblNewLabel_1.setBounds(19, 45, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC785\uB825");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String key = textField.getText();
					String value = textField_1.getText();
					map.put(key, value);
					
				}
			});
			btnNewButton_2.setBounds(29, 73, 78, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC218\uC815");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = textField.getText();
					String value = textField_1.getText();
					
					if(map.containsKey(key)){
						map.put(key, value);						
					}else {
						JOptionPane.showInternalMessageDialog(MapEx.this, "키값이 존재하지 않습니다.");
					}
				}
			});
			btnNewButton_3.setBounds(126, 73, 78, 23);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("\uC0AD\uC81C");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = textField.getText();
					if(map.containsKey(key)) {
						map.remove(key);
						textField_1.setText("");
						
					}else {
						JOptionPane.showMessageDialog(MapEx.this, "삭제할 키가 없음");
					}
					textField.requestFocus();
					textField.selectAll();
				}
			});
			btnNewButton_4.setBounds(230, 73, 78, 23);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("\uC870\uD68C");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField_1.setText("");
					String key = textField.getText();
					String value = map.get(key);
					if(value != null) {
						textField_1.setText(value);						
					}
				}
			});
			btnNewButton_5.setBounds(216, 10, 97, 23);
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("Map.Entry");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					textArea.setText("");
					Set<Map.Entry<String, String>> set = map.entrySet();
					
					//how 1.
					for(Map.Entry<String, String> m : set) {
						textArea.append(m.getKey()+"=" + m.getValue()+"\n");
					}
					//how 2.
					Iterator<Map.Entry<String, String>> iter = set.iterator();
					textArea.append("---------how 2.--------\n");
					while(iter.hasNext()) {
						Map.Entry<String, String> m = iter.next();
						textArea.append(m.getKey()+"="+m.getValue()+"\n");
					}
				}
			});
			btnNewButton_6.setBounds(325, 73, 97, 23);
		}
		return btnNewButton_6;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 106, 387, 131);
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
