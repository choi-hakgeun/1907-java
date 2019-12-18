package i_thread;

public class ThreadNameExam {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("메인스레드명" + " : " + mainThread.getName());
		
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		
		t1.start();
		t2.start();

	}

}
