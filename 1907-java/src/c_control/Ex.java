package c_control;

public class Ex {
	String one () {
		String str = "1";
		System.out.println("1");
		return str;
	}
	public static void main (String [] args) {
		Ex obj = new Ex();
		String s = obj.one(); 
		
	}
}
