package d_array;

import java.util.Scanner;

public class ArrayExam3 {
	// int score = 0; 맴버변수
	public int test2() {
		// 문자열 1차원 배열(names)에 임의의 성명 5개를 대입
		// 정수형 2차원 배열(s) 5명의 국어, 영어성적을 대입
		// 동명은 없음
		// 해당블럭 맨 상단에 배열을 정의하는것이 정석
		String[] names = new String[] { "A", "B", "C", "D", "E" };
		int[][] s = new int[][] { 
			{ 10, 27 }, 
			{ 20, 30 }, 
			{ 30, 40 }, 
			{ 40, 50 }, 
			{ 50, 60 } 
		};
		int tot = 0;
		double avg = 0d;

		// 배열의 첫번째 학생의 이름과 성적 및 총점, 평균을 출력
		System.out.println("name : " + names[0]);
		System.out.println("kor : " + s[0][0]);
		System.out.println("eng : " + s[0][1]);
		tot = s[0][0] + s[0][1];
		avg = (double) tot / s[0].length;
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);

		// 세번째 학생의 국어 점수를 100으로 수정
		s[2][0] = 100;
		// 세번째 학생의 이름과 국어성적을 출력
		System.out.println("세번째 학생명 : " + names[2]);
		System.out.println("국어 : " + s[2][0]);

		// 학생명이 "D" 인 사람의 국어, 영어, 총점과 평균을 계산하여 출력
		// 하되 없으면 "자료없음"을 출력
		// 검색어를 입력하여 검색하고 검색을 중지하려면 "quit"을
		// 입력하도록 프로그램을 수정하시오.

		// do while로 저장 스케너 객체만드는 로직 do while 밖에 작성
		// 키보드 로 입력받는 문자열 findstr while문에 findstr = quit
		// run false로 변환

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		String findstr = "";
		while (!findstr.equals("quit")) {
			System.out.print("검색할 이름은 ?");
			findstr = scanner.nextLine();

			int p = -1;

			for (int i = 0; i < s.length; i++) {
				if (names[i].equals(findstr)) { //네임의 i번째가 사용자가 입력한 검색어와 똑같니
					p = i; //
					tot = s[i][0] + s[i][1];//찾은 위치의 첫번째 컬럼과 두번째 컬럼값을 구함
					avg = tot / 2.0; // (double)tot / s[i].length
					System.out.println("---검색결과--");
					System.out.println("성명 : " + names[i]);
					System.out.println("국어 : " + s[i][0]);
					System.out.println("영어 : " + s[i][1]);
					System.out.println("총점 : " + tot);
					System.out.println("평균 : " + avg);
					break;
				}
			}
			if (p == -1) {
				System.out.println("자료없음");
			}

		}

		return 0;
	}

	// 접근자 (생략가능) 반환형 메서드명(매개변수){ ... }
	// 정수형 2차원 배열을 선언하고 초기값을 4행 3열의 데이터를 대입
	public void test1() {
		int[][] s = new int[][] { // 데이터가 있다면 형식만 써주고 중괄호, 기본형
				{ 1, 2, 3 },
				{ 2, 3, 7 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};

		// 배열의 행수
		System.out.println("행수 : " + s.length);
		// 첫번째 행의 열수
		System.out.println("첫번째 행의 열수 : " + s[0].length);
		// 두번째 행의 세번째 열의 값은?
		System.out.println("두번때 행의 세번째 열의 값 : " + s[1][2]);
		// 첫번째행의 값들의 합계
		int hap = s[0][0] + s[0][1] + s[0][2];
		System.out.println("첫번째 행의 값들의 합계 : " + hap);
		// 첫번째 열의 합계
		int cal = s[0][0] + s[1][0] + s[2][0] + s[3][0];
		System.out.println("첫번째 열의 합계" + cal);
		// 두번째 행의 값들중 짝수만 출력
		// System.out.println("두번째 행의 값들중 짝수만 출력" + s[1][0]+ "," + s[1][2]);
		if (s[1][0] % 2 == 0) {
			System.out.println(s[1][0]);
		}
		if (s[1][1] % 2 == 0) {
			System.out.println(s[1][1]);
		}
		if (s[1][2] % 2 == 0) {
			System.out.println(s[1][2]);
		}
		// 세번째열의 짝수의 평균을 구하시오
		// 포문사용 강추, 새로운 변수를 생성해서 합계를 구함, 평균을 저장하는 변수 필요, 카운트 변수 로 나누어야함
		int a = 0; // 합계
		int c = 0; // 카운트
		double b = 0.0d; // 평균

		if (s[0][2] % 2 == 0) {
			a += s[0][2];
			c++;
		}

		for (int i = 0; i < s.length; i++) {
			if (s[i][2] % 2 == 0) {
				a = a + s[i][2];
				c++;
			}
		}
		if (c > 0) {
			b = (double) a / c;
			System.out.println("합계 : " + a);
			System.out.println("짝수의 개수 : " + c);
			System.out.println("평균 : " + b);
		}
	}

	public static void main(String[] args) {
		ArrayExam3 a3 = new ArrayExam3();// 인스턴스화, 객체생성, 메모리에 올림
		// a3.test1();//test1의 반환형이 void 로 반환값이 없기 때문에 앞에 반환형이 붙지 않음.
		a3.test2();

	}

}
