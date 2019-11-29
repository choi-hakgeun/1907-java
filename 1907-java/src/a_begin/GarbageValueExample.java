package a_begin;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i<5; i++) { //i++ 또는 -- 는  i = i+1 또는 i = i-1 과 같다
			var1++;
			var2++;
			System.out.println(i + "var1:" + var1 + "\t" + "var2:" + var2);			
		}
						
	}

}
