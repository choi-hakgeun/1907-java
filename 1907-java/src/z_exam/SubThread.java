package z_exam;

public class SubThread implements Runnable{
	
	public void run() {
		for(int i=1; i<=100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			}catch(Exception ex) {}
		}
	}

}
