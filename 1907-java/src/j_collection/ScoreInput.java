package j_collection;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class ScoreInput extends JInternalFrame {
	
	
	private JButton btnNewButton;
	private JLabel status;
	private JLabel lblNewLabel;
	private InputPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreInput frame = new ScoreInput();
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
	public ScoreInput() {
		super("¼ºÀûÀÔ·Â", true, true, true, true);
		setVisible(true);
		
		setTitle("\uC131\uC801\uC785\uB825");
		setBounds(10, 10, 276, 422);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getPanel());

	}
	public ScoreInput(Map<String, Integer> map) {
		this();
		
	}
	public void input(ScoreVo vo) {
		ScoreDao sd = new ScoreDao();
		sd.insert(vo);
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input(null);
				}
			});
			btnNewButton.setBounds(70, 316, 116, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBackground(SystemColor.info);
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 349, 236, 34);
		}
		return status;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(135, 206, 250));
			lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 236, 34);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBounds(12, 54, 236, 252);
		}
		return panel;
	}
}
