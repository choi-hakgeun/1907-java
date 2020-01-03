package l_ftp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class FileServer extends JFrame implements Runnable{
	
	static int port = 6000; //6000~50000
	ServerSocket server;	
	
	List<FileTransferReceive> files = new ArrayList<FileTransferReceive>();
	boolean threadFlag = true;
	

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileServer frame = new FileServer();
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
	public FileServer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 400);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.NORTH);
		contentPane.add(getScrollPane_1(), BorderLayout.CENTER);
		
		/*//test
		for(int i=0; i<10; i++) {
			FileTransfer ft = new FileTransfer();
			panel.add(ft);
		}
		panel.updateUI();*/	
		
	}
	@Override
	public void run() {
		threadFlag = true;
		try {
			server = new ServerSocket(5555);
			textArea.append("서버가 시작됨\n");
		} catch (IOException e) {
			textArea.append(e.toString() +"\n");
		}
		
		while(threadFlag) {
			try {
				Socket s = server.accept();
				textArea.append("클라이언트가 접속됨\n");
				
				ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
				Data data = (Data)ois.readObject();
				
				textArea.append("수신될 파일 정보 수신됨\n");
				textArea.append("파일 갯수 : " + data.fileName.size());
				
				for(int i = 0; i<data.fileName.size();i++) {
					FileServer.port++;
					if(FileServer.port>50000) FileServer.port = 6000;
					
					FileTransferReceive st = new FileTransferReceive(FileServer.port, data.fileName.get(i), data.fileSize.get(i));
					files.add(st);
					panel.add(st);
					
					Data sendData = new Data();
					sendData.port = FileServer.port;
					oos.writeObject(sendData);
				}
				panel.updateUI();
				ois.close();
				oos.close();
				
			}catch(Exception ex) {
				
			}
		}
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uC11C\uBC84");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {//서버시작
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC11C\uBC84 \uC2DC\uC791");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Thread t = new Thread(FileServer.this);
					t.start();
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC11C\uBC84 \uC911\uC9C0");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC885\uB8CC");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(2, 150));
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
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getPanel());
		}
		return scrollPane_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(500, 70));
		}
		return panel;
	}
}
