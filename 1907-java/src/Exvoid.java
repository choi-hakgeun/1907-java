/*2019.11.29(금)
 * 성적이 0~100일 때만 60이상이면 '합격' 60미만이면 '불합격'
 * 을 출력하고, 성적이 범위 밖이면'성적오류'를 출력하시오.
 */

//잘못된 알고리즘, 간소화시킬 수 있음.
public class Exvoid {
	String type() {
		int kor = 60;
		int eng = 40;
		int math = 70;
		int score = 0;
		String r = null;
		
		if( score <= 100 ) {
			if( kor >= 60 ) {
				System.out.println("국어합격");
			} else if( kor < 60 ) {
				System.out.println("국어불합격");
			}
			if( eng >= 60 ) {
				System.out.println("영어합격");
			}else if( eng < 60 ) {
				System.out.println("영어불합격");
			}
			if( math >=60 ) {
				System.out.println("수학합격");
			}else if( math < 60 ) {
				System.out.println("수학불합격");
			}			
		}else {
			System.out.println("성적오류");	
		}
		return r;	
	}	
	public static void main(String [] args) {
		Exvoid add = new Exvoid();	
		String add1 = add.type();
	}

}
