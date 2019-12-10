package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AccountList extends JPanel {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public AccountList() {
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());
		showList();
	}
	
	public void showList() {
		String str = "";
		DecimalFormat df = new DecimalFormat("##,###,###,###.#");
		
		for(int i = 0 ; i<Bank.count ; i++) {
			Account a = Bank.ac[i]; //Bank.ac[i]가 가지고 있는 요소를 a에 담아서 
			str += a.getsNo();
			str += "\t" + a.getmName();
			str += "\t" + df.format(a.getAmount());
			str += "\n"; 
			}
		textArea.setText(str);
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC815\uBAA9\uB85D");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
			lblNewLabel.setBounds(12, 10, 332, 30);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 56, 332, 183);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638             \uC608\uAE08\uC8FC            \uC608\uAE08\uC794\uC561");
		}
		return lblNewLabel_1;
	}
}
