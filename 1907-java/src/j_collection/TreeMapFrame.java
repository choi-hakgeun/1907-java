package j_collection;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TreeMapFrame extends JInternalFrame {
	TreeMap<Integer, String> scores;
	
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
					TreeMapFrame frame = new TreeMapFrame();
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
	public TreeMapFrame() {
		super("TreeMapFrame", false, true, true, true);
		setVisible(true);
		setBounds(100, 100, 351, 430);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());

	}
	
	public void process() {
		scores = new TreeMap<Integer, String>();
		scores.put(80, "kim");
		scores.put(50, "hong");
		scores.put(90, "park");
		scores.put(30, "gang");
		scores.put(55, "lee");
		
		textArea.setText("");
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		textArea.append("\n최소값 : " + entry.getKey()+">"+entry.getValue());
		entry = scores.lastEntry();
		textArea.append("\n최대값 : " + entry.getKey()+">"+entry.getValue());
		
		entry = scores.lowerEntry(55);
		textArea.append("\n55점 아래 : " + entry.getKey()+">"+entry.getValue());
		
		entry = scores.higherEntry(85);
		textArea.append("\n85점 위 : " + entry.getKey()+">"+entry.getValue());
	}
	public void asc() {
		if( scores != null) {
			textArea.setText("");
			NavigableMap<Integer, String> tempMap = scores.descendingMap();
			NavigableMap<Integer, String> ascMap = tempMap.descendingMap();
			Set<Map.Entry<Integer, String>> set = ascMap.entrySet();
			for(Map.Entry<Integer, String> d : set) {
				textArea.append(d.getKey() + ":" + d.getValue() +"\n");
			}
		}else {
			textArea.setText("먼저 실행버튼을 클릭한 후 정렬해 주세요.");
		}
		
	}
	public void desc() {
		if(scores != null ) {
			NavigableMap<Integer, String> map = scores.descendingMap();
			Set<Map.Entry<Integer, String>> entry = map.entrySet();
			textArea.setText("");
			for(Map.Entry<Integer, String> d : entry) {
				textArea.append(d.getKey() + ":" + d.getValue() +"\n");
			}
		}else {
			textArea.setText("먼저실행버튼을 클릭한 후 정렬해 주세요");
		}
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2E4\uD589");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					process();
				}
			});
			btnNewButton.setBounds(12, 10, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("ASC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					asc();
				}
			});
			btnNewButton_1.setBounds(121, 10, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("DESC");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					desc();
				}
			});
			btnNewButton_2.setBounds(230, 10, 97, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 45, 317, 346);
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
