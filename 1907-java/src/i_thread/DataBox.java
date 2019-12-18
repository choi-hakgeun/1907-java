package i_thread;

public class DataBox extends Thread{
	
	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}		
		}
		String returnValue = data;
		System.out.println(returnValue);
		data = null;
		notify();
		return returnValue;
	}	

	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
			
		}
		
		this.data = data;
		System.out.println("ProducerThread 가 생성한 데이터:" + data);
		notify();
	}

}
