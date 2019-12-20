package j_collection;

import java.awt.EventQueue;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductSearch extends JInternalFrame {
	Set<ProductVo> piList;
	Set<ProductVo> peList;
	
	ButtonGroup group = new ButtonGroup();
	
	private JPanel panel;
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_1;
	private JRadioButton imBtn;
	private JRadioButton exBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductSearch frame = new ProductSearch();
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
	public ProductSearch() {
		super("제품조회", false, true, true, true);
		setVisible(true);
		
		setTitle("\uC81C\uD488\uC870\uD68C");
		setBounds(581, 30, 450, 300);
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);

	}
	
	public ProductSearch(Set<ProductVo>pi, Set<ProductVo>pe) {
		this();
		this.piList = pi;
		this.peList = pe;
	}
	
	public void search() {
		
		Set<ProductVo> list = null;
		
		ProductVo find = new ProductVo(); //검색어(시리얼, 제품코드, 제품명)
		
		find.setSerial(textField.getText());
		find.setpCode(textField.getText());
		find.setpName(textField.getText());
		
		textArea.setText("");
		if( imBtn.isSelected()) {
			list = piList;
		}else {
			list = peList;
		}
		Iterator<ProductVo> iter = list.iterator();
		while(iter.hasNext()) {
			ProductVo vo = iter.next();
			if(vo.equals(find)) {
				textArea.append(vo.toString());
			}
		}
		
	}
	
	

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 32));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTextField(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
			panel.add(getPanel_1(), BorderLayout.WEST);
		}
		return panel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");//검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					search();
					
				}
			});
		}
		return btnNewButton;
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
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(120, 10));
			panel_1.add(getImBtn());
			panel_1.add(getExBtn());
		}
		return panel_1;
	}
	private JRadioButton getImBtn() {
		if (imBtn == null) {
			imBtn = new JRadioButton("\uC785\uACE0");//입고
			group.add(imBtn);
			imBtn.setSelected(true);
		}
		return imBtn;
	}
	private JRadioButton getExBtn() {
		if (exBtn == null) {
			exBtn = new JRadioButton("\uCD9C\uACE0");//출고
			group.add(exBtn);
		}
		return exBtn;
	}
}
