package i_thread;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA()....");
		notify(); //���������Ǿ� �ִ� �����带 ����
		
		
		try {
			wait();
		} catch (InterruptedException e) {
			
		}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB().....");
		notify();
		try {
			wait();
		}catch(Exception ex) {
			
		}
	}

}
