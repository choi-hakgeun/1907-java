package semi;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class OrderInsert extends JInternalFrame {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JTextField txtId;
	private JLabel lblNewLabel_1;
	private JList list_1;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderInsert frame = new OrderInsert();
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
	public OrderInsert() {
		setTitle("\uC8FC\uBB38\uC811\uC218");
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getScrollPane());
		getContentPane().add(getScrollPane_1());
		getContentPane().add(getTxtId());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getButton());
		getContentPane().add(getButton_1());
		getContentPane().add(getLblNewLabel_2());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uBA54\uB274\uC120\uD0DD");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 35, 220, 326);
			scrollPane.setViewportView(getList());
		}
		return scrollPane;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(352, 35, 220, 266);
			scrollPane_1.setViewportView(getList_1());
		}
		return scrollPane_1;
	}
	private JTextField getTxtId() {
		if (txtId == null) {
			txtId = new JTextField();
			txtId.setHorizontalAlignment(SwingConstants.CENTER);
			txtId.setEnabled(false);
			txtId.setText("\uD68C\uC6D0 ID");
			txtId.setBounds(352, 7, 116, 21);
			txtId.setColumns(10);
		}
		return txtId;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uB2D8\uC758 \uC8FC\uBB38\uB0B4\uC6A9");
			lblNewLabel_1.setBounds(470, 10, 102, 15);
		}
		return lblNewLabel_1;
	}
	private JList getList_1() {
		if (list_1 == null) {
			list_1 = new JList();
		}
		return list_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uBA54\uB274\uCD94\uAC00");
			btnNewButton.setBounds(244, 34, 96, 60);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uBA54\uB274\uC0AD\uC81C");
			button.setBounds(244, 104, 96, 60);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC8FC\uBB38\uD558\uAE30");
			button_1.setBounds(244, 241, 96, 60);
		}
		return button_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC5EC \uCD94\uAC00\uD558\uC2DC\uACE0 \uC8FC\uBB38\uD558\uAE30 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694.");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBackground(new Color(175, 238, 238));
			lblNewLabel_2.setOpaque(true);
			lblNewLabel_2.setBounds(244, 311, 328, 50);
		}
		return lblNewLabel_2;
	}
}
