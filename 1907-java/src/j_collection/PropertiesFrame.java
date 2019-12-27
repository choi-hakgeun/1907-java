package j_collection;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

public class PropertiesFrame extends JInternalFrame {
	private JButton btnNewButton;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PropertiesFrame frame = new PropertiesFrame();
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
	public PropertiesFrame() {
		super("PropertiesFrame", false, true, true, true);
		setVisible(true);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getTextArea());

	}
	
	public void load() {
		try {
			Properties properties = new Properties();
			String path = PropertiesFrame.class.getResource("database.properties").getPath();
			path = URLDecoder.decode(path, "utf-8");
			properties.load(new FileReader(path));
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String userName = properties.getProperty("username");
			String pwd = properties.getProperty("password");
			
			textArea.setText("");
			textArea.append("driver : " + driver + "\n");
			textArea.append("url : " + url + "\n");
			textArea.append("name : " + userName + "\n");
			textArea.append("pwd : " + pwd + "\n");
			
			
		}catch(Exception ex) {
			textArea.setText("오류발생");
			textArea.append("\n");
			textArea.append(ex.toString());
		}
		
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					load();
				}
			});
			btnNewButton.setBounds(292, 10, 97, 23);
		}
		return btnNewButton;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(12, 39, 397, 205);
		}
		return textArea;
	}
}
