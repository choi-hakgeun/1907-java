package k_io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MemberCreate {

	public static void main(String[] args) throws Exception{
		// member.dat ���Ͽ� ����ȭ�� MemberVo ��ü�� �߰�
		List<MemberVo> list = new ArrayList<MemberVo>();
		for(int i=1 ; i<=500; i++) {
			MemberVo vo = new MemberVo("no"+i, "pwe"+i, "name" +i, "010-1111-" +i);
			list.add(vo);
		}
		
		OutputStream os = new FileOutputStream("member.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(list);
		oos.flush();
		oos.close();
		os.close();

	}

}