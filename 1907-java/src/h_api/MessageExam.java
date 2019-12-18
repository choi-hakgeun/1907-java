package h_api;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class MessageExam extends JInternalFrame {
	private JPanel panel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageExam frame = new MessageExam();
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
	public MessageExam() {
		super("MessageFormat", false, false, false, false);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);

	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 24));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("DM\uBC1C\uC1A1");//DM ¹ß¼Û
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String[][] data = null; 
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
					String now = sdf.format( new Date() );
					data = new String[][] {
						{"11-111", "È«±æµ¿", "¹æ°¡~~¹æ°¡..", "°í°´°ü¸®ÆÀ", now},
						{"22-222", "ÀÏÁö¸Å", "°ø°Ý ¾ÕÀ¸·Î", "Àü·«ÆÀ", now},
						{"33-333", "ÀÓ²©Á¤", "°ÆÁ¤Àº ±×¸¸", "È«º¸ÆÀ", now},
						{"44-444", "¼ºÃáÇâ", "²É±æ¸¸ °ÉÀ¸¼¼¿ä", "ÃÑ¹«ÆÀ", now}
						};
						
						String dm = "¿ìÆí¹øÈ£ : {0} \n°í°´¸í : {1}\n\n{2} \n\n ¹ß¼ÛÃ³ : {3} \n\n{4}";
						dm += "------------------------------------------\n\n";
						
						StringBuilder sb = new StringBuilder();
						for(int i =0; i<data.length; i++) {
							String temp = MessageFormat.format(dm, data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
							sb.append(temp);
						}
						textArea.setText(sb.toString());
					
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
}
