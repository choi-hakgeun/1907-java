package h_api;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SortByScore extends JPanel {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public SortByScore() {
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC21C\uC815\uB82C");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(Color.CYAN);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 426, 25);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 53, 426, 201);
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88                             \uC774\uB984                       \uC131\uC801");
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
