package m_jdbc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemberSelect extends JInternalFrame {
	private JLabel label;
	private JButton btnNewButton;
	private JTextField find;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberSelect frame = new MemberSelect();
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
	public MemberSelect() {
		super("학생정보조회", false, true, true, true);
		setVisible(true);
		
		setBounds(400, 300, 400, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getFind());
		getContentPane().add(getScrollPane());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD559\uC0DD\uC815\uBCF4\uC870\uD68C");
			label.setOpaque(true);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBackground(new Color(127, 255, 212));
			label.setBounds(12, 10, 360, 23);
		}
		return label;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					MemberDao dao = new MemberDao();
					String f = find.getText();
					List<MemberVo> list = dao.select(f);
					System.out.println(f);
					System.out.println(list);
					textArea.setText("");
					for(MemberVo vo : list) {
						textArea.append(vo.toString());						
					}
				}
			});
			btnNewButton.setBounds(275, 43, 97, 23);
		}
		return btnNewButton;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(147, 43, 116, 21);
			find.setColumns(10);
		}
		return find;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 77, 360, 175);
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
