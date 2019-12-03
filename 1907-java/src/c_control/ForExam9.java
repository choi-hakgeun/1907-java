package c_control;

public class ForExam9 {
	ForExam9() {
		for(int i = 1 ; i <= 5; i++) {
			//for(int j=1 ; j<=(6-i) ; j++) { 강사님코드
			
			for(int j=5 ; j>=i ; j--) {     //내가 작성한코드
				System.out.print("*");				
			}
			System.out.println();
		}
	}

}
