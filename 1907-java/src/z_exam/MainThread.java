package z_exam;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("���� ������ ����...");
		SubThread st = new SubThread();
		Thread t = new Thread(st);
		
		try {
			t.start();
			t.join();//���ν����尡 ����ǰ� ���� �����尡 ���۵ǰ� �ϴ� ����.
		}catch(Exception ex) {}
		System.out.println("���� ������ ����....");

	}

}
