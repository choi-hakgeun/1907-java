package i_thread;

public class SumThread extends Thread{
	long sum;
	
	
	public long getSum() {
		return sum;
	}


	public void setSum(long sum) {
		this.sum = sum;
	}


	@Override
	public void run() {
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {
			
		}
	}

}
