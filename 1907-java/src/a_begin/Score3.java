package a_begin;

public class Score3 {
	public Score3() {
		String date = "2019.11.27";
		String name = "최학근";
		int kor = 90;
		int eng = 85;
		int sum = 0;
		double avg = 0;
		sum = kor + eng;
		avg = (double)sum/2;
		
		System.out.println("-----------------");
		System.out.println("성적처리결과");
		System.out.println("-----------------");
		System.out.println("작성일자 : " + date);
		System.out.println("작성자 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("-----------------");
	}
	public static void main(String [] args) {
		new Score3();
	}

}
