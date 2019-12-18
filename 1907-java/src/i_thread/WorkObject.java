package i_thread;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA()....");
		notify(); //실행중지되어 있는 스레드를 깨움
		
		
		try {
			wait();
		} catch (InterruptedException e) {
			
		}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB().....");
		notify();
		try {
			wait();
		}catch(Exception ex) {
			
		}
	}

}
