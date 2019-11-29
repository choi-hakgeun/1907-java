/*
 * 문2) 논리식을 사용한 응용(파일명 : Score4.java)
 가. 국어, 영어, 수학 점수를 정수형으로 변수에 저장한 후, 총점과 평균을 계산하여 적당한 변수에 저장하시오.
 나. 세 개의 점수중 하나라도 40미만이 있으면 '불합격'처리
 다. 평균이 60 이하이여도 '불합격'처리를 하여 점수와 총점, 평균, 합격여부를 표준출력장치에 출력하시오.
 **package b_operator

[출력예시]
---------------------------
합격 여부 통지
---------------------------
국어 : 50
영어 : 50
수학 : 50
총점 : 150
평균 : 50
결과 : 불합격
---------------------------
 */
package b_operator;

public class Score4 {
	int kor = 50;
	int eng = 90;
	int math = 50;
	int sum = 0;
	double avg = 0.0;
	boolean r;
	String str;
	
	Score4() {
		sum = kor + eng + math;
		avg = (double)sum/3;		
		r = (kor>=40) && (eng>=40) && (math>=40) && (avg>=60);
		str = (r)? "합격" : "불합격";
		
		
		/*if((kor>=40) && (eng>=40) && (math>=40) && (avg>=60)) {
			System.out.println("결과 :" + "합격");
		}
		System.out.println("결과 :" + "불합격");
		*/
		
		System.out.println("---------------------");
		System.out.println("합격 여부 통지");
		System.out.println("---------------------");
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + eng);
		System.out.println("수학 :" + math);
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + avg);
		System.out.println("결과 :" + str);		
		System.out.println("---------------------");
	}
	public static void main(String [] args) {
		new Score4();	
	}

}
