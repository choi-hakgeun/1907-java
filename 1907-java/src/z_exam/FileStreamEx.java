package z_exam;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

public class FileStreamEx {
	
	public FileStreamEx() throws Exception{
		JFileChooser jc = new JFileChooser();
		int flag = jc.showOpenDialog(null);
		
		if(flag != JFileChooser.APPROVE_OPTION) {
			return;
		}
		String fileName = jc.getSelectedFile().getPath();
		File file = new File(fileName);		
		FileInputStream readFile = new FileInputStream(file);
		
		flag = jc.showSaveDialog(null);
		if(flag != JFileChooser.APPROVE_OPTION) {
			return;
		}
		String fileName2 = jc.getSelectedFile().getPath();
		File file2 = new File(fileName2);
		FileOutputStream writeFile = new FileOutputStream(file2);
		
		byte[] readByte = new byte[4096];// 4kb 
		int readSize = 0;
		
		while( (readSize = readFile.read(readByte))!=-1 ) {
			writeFile.write(readByte, 0, readSize);
		}
		writeFile.flush();
		writeFile.close();
		readFile.close();		
	}

	public static void main(String[] args) throws Exception{
		FileStreamEx ex = new FileStreamEx(); //메모리에 올리는역할 -클레스 로더

	}

}
