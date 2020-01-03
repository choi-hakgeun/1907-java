package l_ftp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class FileTransfer extends JPanel implements Runnable {
	long fileSize;
	
	private JLabel fileName;
	private JProgressBar progressBar;
	private JLabel status;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public FileTransfer() {
		setPreferredSize(new Dimension(450, 64));
		setLayout(null);
		add(getFileName());
		add(getProgressBar());
		add(getStatus());
		add(getBtnNewButton());

	}
	public FileTransfer(String file) {
		this();
		getFileName().setText(file);
		File f = new File(file);
		fileSize = f.length();
		getStatus().setText("0/"+fileSize);
		
	}
	@Override
	public void run() {
		//������ ������ FileInputStream���� �о
		//Socket�� DataOutputStream ���� ����
		byte[] readData = new byte[4096]; //�ѹ��� 4Ű�ι���Ʈ�� �о ����
		int readSize = 0;
		long readTotSize = 0;
		try {
		FileInputStream fis = new FileInputStream(getFileName().getText());		
		while((readSize = fis.read(readData)) != -1) {
			readTotSize += readSize;
			getStatus().setText(readTotSize + "/"+fileSize);
			getProgressBar().setValue((int)((double)readTotSize/fileSize*100));
		}
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
			btnNewButton.setFont(new Font("����", Font.PLAIN, 10));
			btnNewButton.setMargin(new Insets(0, 0, 0, 0));
			btnNewButton.setBounds(390, 23, 48, 15);
		}
		return btnNewButton;
	}
}
