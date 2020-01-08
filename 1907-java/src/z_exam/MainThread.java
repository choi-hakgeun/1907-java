package z_exam;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작...");
		SubThread st = new SubThread();
		Thread t = new Thread(st);
		
		try {
			t.start();
			t.join();//메인스레드가 종료되고 서브 스레드가 시작되게 하는 역할.
		}catch(Exception ex) {}
		System.out.println("메인 스레드 종료....");

	}

}
