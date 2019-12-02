/* 2019.11.29(금)
 * 로또 추출할수 있는 기능을 가진 클레스
 * 추출할 수 있는 메소드 따로, 출력하는 메소드 따로 작성함. 원래 따로만듬.
 */

package c_control;

public class Lotto {
	private int n[] = new int[6];
	int count = 0;	
	
	//난수발생 (로또번호 발생)
	void process() {
		boolean b = false; //중복되지 않았다.
		this.n[count] = (int)(Math.random()*45)+1;
		
		for(int i=0 ; i < count ; i++) {
			if( n[i] == n[count]) {
				b = true;
			}
		}
		
		if( !b ) {	
			count++;			
			prn();
		}		
	}
	//난수출력 (로또번호 출력)
	void prn() {
		System.out.println(n[count-1]);
	}
	public static void main(String [] args) {
		Lotto k = new Lotto();
		int a = 6;
		for( ; k.count<a ; ) {
		k.process();			
		}
		
	}
	
		
	/*type1() {
	}
	
	public static void main(String [] args) {
		Lotto add = new Lotto();
		add.type1();		
		System.out.println(add);
	}*/

}
