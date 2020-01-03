package l_ftp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class FileTransferReceive extends JPanel implements Runnable {
	long fileSize;
	int port;
	
	FileOutputStream fos;
	Socket socket;
	InputStream is;
	
	
	private JLabel fileName;
	private JProgressBar progressBar;
	private JLabel status;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public FileTransferReceive() {
		setPreferredSize(new Dimension(450, 64));
		setLayout(null);
		add(getFileName());
		add(getProgressBar());
		add(getStatus());
		add(getBtnNewButton());

	}
	public FileTransferReceive(int port, String file, long fileSize) {
		this();
		this.port = port;
		this.fileSize = fileSize;
		
		getFileName().setText(file);		
		getStatus().setText("0/"+fileSize);
		
		try {
			
			Thread t = new Thread(this);
			t.start();
		}catch(Exception ex) {
			
		}
		
	}
	@Override
	public void run() {
		//지정된 파일을 FileInputStream으로 읽어서
		//Socket의 DataOutputStream 으로 전송
		byte[] readData = new byte[4096]; //한번에 4키로바이트만 읽어서 전송
		int readSize = 0;
		long readTotSize = 0;
		try {
			ServerSocket ss = new ServerSocket(port);
			socket = ss.accept();
			
			File dir = new File("c:/Temp"); //dir경로생성
			if(!dir.exists()) dir.mkdir(); //dir경로가 없으면 생성해라
			
		fos = new FileOutputStream("c:/Temp/"+getFileName().getText());
		is = socket.getInputStream();
		
		while((readSize = is.read(readData)) != -1) {
			readTotSize += readSize;
			getStatus().setText(readTotSize + "/"+fileSize);
			getProgressBar().setValue((int)((double)readTotSize/fileSize*100));
			
			fos.write(readData, 0, readSize);
		}
		fos.flush();
		fos.close();
		is.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	private JLabel getFileName() {
		if (fileName == null) {
			fileName = new JLabel("\uD30C\uC77C\uBA85");
			fileName.setBounds(12, 6, 426, 15);
		}
		return fileName;
	}
	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setBounds(12, 24, 369, 14);
		}
		return progressBar;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC9C4\uD589\uC0C1\uD0DC");
			status.setHorizontalAlignment(SwingConstants.RIGHT);
			status.setBounds(12, 41, 426, 15);
		}
		return status;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCDE8\uC18C");
			btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
			btnNewButton.setMargin(new Insets(0, 0, 0, 0));
			btnNewButton.setBounds(390, 23, 48, 15);
		}
		return btnNewButton;
	}
}
