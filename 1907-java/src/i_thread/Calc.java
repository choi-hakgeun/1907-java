package i_thread;

public class Calc {
	private int memory;
	

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
	
	try {
			Thread.sleep(500);
	} catch (InterruptedException e) {
	}
	System.out.println(Thread.currentThread().getName()+":" + this.memory);

	}
	
}
