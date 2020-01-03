package l_ftp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class FileClient extends JFrame {

	List<FileTransfer> files;

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JTextField tIP;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileClient frame = new FileClient();
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
	public FileClient() {
		setTitle("\uD30C\uC77C \uBA40\uD2F0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		
		try {
			InetAddress addr = InetAddress.getLocalHost();
			getTIP().setText(addr.getHostAddress());
		}catch(Exception ex){
				
			}
		}

		/*
		 * //test for(int i = 0; i<10;i++) { panel_1.add(new FileTransfer()); }
		 */

	

	public void fileChooser() {
		JFileChooser fc = new JFileChooser();
		fc.setMultiSelectionEnabled(true);
		int flag = fc.showOpenDialog(FileClient.this);
		if (flag == JFileChooser.APPROVE_OPTION) {
			File[] tempFiles = fc.getSelectedFiles();
			files = new ArrayList<FileTransfer>();
			for (File f : tempFiles) {
				FileTransfer ft = new FileTransfer(f.getPath());
				files.add(ft);
				panel_1.add(ft);
				panel_1.updateUI();
			}
		}
	}

	public void send() {
		//전송할 파일의 목록과 파일의 크기를 Data에 담아서 서버전달
		Data data = new Data();
		ObjectInputStream ois = null;
		for(FileTransfer ft : files) {
			data.fileName.add(ft.getFileName().getText());
			data.fileSize.add(ft.fileSize);
			
		}
		Socket socket = null;
		try {
			socket = new Socket(tIP.getText(),5555);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(data);
			oos.flush();
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		//서버가 전달한 port번호를 사용하여 서버에 추가접속
		try {
		ois = new ObjectInputStream(socket.getInputStream());
		for(FileTransfer ft : files) {
			File f = new File(ft.getFileName().getText());
			
			data.fileName.add(f.getName());
			data.fileSize.add(ft.fileSize);
			Thread t = new Thread(ft);
				Data temp = (Data)ois.readObject();
				ft.ip = getTIP().getText();
				ft.port = temp.port;
				t.join();
				t.start();			
		        }
		}
		catch (Exception e) {
			e.printStackTrace();
			}
		
	}
	

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getTIP());
			panel.add(getBtnNewButton_2());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uD30C\uC77C\uC120\uD0DD");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					fileChooser();
				}
			});
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC804\uC1A1");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					send();
				}
			});
		}
		return btnNewButton_1;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanel_1());
		}
		return scrollPane;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(500, 70));
		}
		return panel_1;
	}

	private JTextField getTIP() {
		if (tIP == null) {
			tIP = new JTextField();
			tIP.setColumns(10);
		}
		return tIP;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC11C\uBC84\uC5F0\uACB0");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}
		return btnNewButton_2;
	}
}
