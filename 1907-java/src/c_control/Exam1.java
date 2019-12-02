/*
 * 모든처리는 생성자를 사용하여 해결.
 * 성명, 주소, 연락처가 문자열로 발생한다. 각각의 데이터를 name, address, phone에 저장
 * 성적이 정수형으로 발생하여 각각 kor, eng, mat에 저장함.
 * 저장된 성적을 사용하여 총점, 평균을 tot, avg에 저장.
 * if ~ else if문을 사용하여 평균값을 사용하여 학점을 구해서 문자형 변수 grade에 저장.
 * 처리된 모든 내용을 표준 출력 장치에 출력.
 * [출력결과]
 * -----------------------------------
 * 성명 : XXX
 * 주소 : XXX
 * 연락처 : XXX
 * 국어 : XXX
 * 영어 : XXX
 * 수학 : XXX
 * 총점 : XXX
 * 평균 : XXX
 * ------------------------------------  
 */

package c_control;

public class Exam1 {
	Exam1(){
		String name, address, phone;
		char grade;
		int kor, eng, mat, tot;
		double avg;
		
		name = "홍길동";
		address = "서울시 종로구";
		phone = "000-0000-0000";
		
		kor = 90;
		eng = 80;
		mat = 70;
		tot = kor+eng+mat;
		avg = tot/3;
		
		if(avg>90) {
			grade = 'A';
		}else if(avg>80){
			grade = 'B';
		}else if(avg>70){
			grade = 'C';
		}else {
			grade = 'D';
		}
		String mag = "성명 : " + name;
		mag += "\n주소 : " + address;
		mag += "\n연락처 : " + phone;
		mag += "\n국어 : " + kor;
		mag += "\n영어 : " + eng;
		mag += "\n수학 : " + mat;
		mag += "\n총점 : " + tot;
		mag += "\n평균 : " + avg;
		
		System.out.println("[출력결과]");
		System.out.println("----------------------------");
		System.out.println("성명 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("연락처 : " + address);
				
	}
	public static void main(String [] args) {
		Exam1 a = new Exam1();
		
		
		
	}

}

