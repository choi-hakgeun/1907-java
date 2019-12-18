package h_api3;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoardInput extends JInternalFrame {
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField no;
	private JTextField subject;
	private JTextField content;
	private JTextField mId;
	private JTextField mDate;
	private JTextField cut;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardInput frame = new BoardInput();
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
	public BoardInput() {
		super("BoardInput", false, true, true, true);
	    setVisible(true);
	    setTitle("BoardInput");
		setTitle("\uAC8C\uC2DC\uD310");
		setBounds(100, 100, 450, 300);
		getContentPane().add(getLblNewLabel(), BorderLayout.NORTH);
		getContentPane().add(getPanel(), BorderLayout.CENTER);

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uAC8C\uC2DC\uAE00 \uC791\uC131");
			lblNewLabel.setBackground(new Color(72, 209, 204));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setPreferredSize(new Dimension(57, 20));
			lblNewLabel.setOpaque(true);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_5());
			panel.add(getLblNewLabel_6());
			panel.add(getNo());
			panel.add(getSubject());
			panel.add(getContent());
			panel.add(getMId());
			panel.add(getMDate());
			panel.add(getCut());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uAC8C\uC2DC\uBB3C\uBC88\uD638");
			lblNewLabel_1.setBackground(new Color(135, 206, 250));
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBounds(12, 10, 81, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC81C\uBAA9");
			lblNewLabel_2.setBackground(new Color(135, 206, 250));
			lblNewLabel_2.setOpaque(true);
			lblNewLabel_2.setBounds(12, 35, 81, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uB0B4\uC6A9");
			lblNewLabel_3.setBackground(new Color(135, 206, 250));
			lblNewLabel_3.setOpaque(true);
			lblNewLabel_3.setBounds(12, 60, 81, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC791\uC131\uC790\uC544\uC774\uB514");
			lblNewLabel_4.setBackground(new Color(135, 206, 250));
			lblNewLabel_4.setOpaque(true);
			lblNewLabel_4.setBounds(12, 85, 81, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC791\uC131\uC77C");
			lblNewLabel_5.setBackground(new Color(135, 206, 250));
			lblNewLabel_5.setOpaque(true);
			lblNewLabel_5.setBounds(12, 110, 81, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC870\uD68C\uC218");
			lblNewLabel_6.setBackground(new Color(135, 206, 250));
			lblNewLabel_6.setOpaque(true);
			lblNewLabel_6.setBounds(12, 135, 81, 15);
		}
		return lblNewLabel_6;
	}
	private JTextField getNo() {
		if (no == null) {
			no = new JTextField();
			no.setBounds(105, 7, 241, 21);
			no.setColumns(10);
		}
		return no;
	}
	private JTextField getSubject() {
		if (subject == null) {
			subject = new JTextField();
			subject.setBounds(105, 32, 241, 21);
			subject.setColumns(10);
		}
		return subject;
	}
	private JTextField getContent() {
		if (content == null) {
			content = new JTextField();
			content.setBounds(105, 57, 241, 21);
			content.setColumns(10);
		}
		return content;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setBounds(105, 82, 241, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getMDate() {
		if (mDate == null) {
			mDate = new JTextField();
			mDate.setBounds(105, 107, 241, 21);
			mDate.setColumns(10);
		}
		return mDate;
	}
	private JTextField getCut() {
		if (cut == null) {
			cut = new JTextField();
			cut.setBounds(105, 132, 241, 21);
			cut.setColumns(10);
		}
		return cut;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC8C\uC2DC");
			btnNewButton.addActionListener(new ActionListener() {		

				public void actionPerformed(ActionEvent e) {
					int noT = Integer.parseInt(no.getText());
					String sub = subject.getText();
					String con = content.getText();
					String id = mId.getText();
					String md = mDate.getText();
					int cu = Integer.parseInt(cut.getText());
					
					BoardVo str = new BoardVo(noT, sub, con, id, md, cu);
					BoardMain.data[BoardMain.count] = str;
					BoardMain.count++;
					
				}
			});
			btnNewButton.setBounds(105, 157, 241, 23);
		}
		return btnNewButton;
	}
}
