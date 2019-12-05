package d_array;

import java.util.Scanner;

public class ArrayExam4 {
	String[] n = new String[10];
	int[][] s = new int[10][2];
	int count = 0; //배열에 입력된 자료의 개수
	
	//생성자의 역할은 무한루프를 돌면서 메뉴를 출력, 스텝구조
	ArrayExam4(){
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		//샘플용 데이터를 배열에 저장
		n[0] = "kim";
		n[1] = "hong";
		n[2] = "park";
		n[3] = "lee";
		s[0][0] = 90 ; s[0][1] = 80;
		s[1][0] = 70 ; s[1][1] = 30;
		s[2][0] = 60 ; s[2][1] = 20;
		s[3][0] = 50 ; s[3][1] = 10;
		
		count = 4;
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.입력 | 2.수정 | 3. 조회 및 출력 4.종료");
			System.out.println("-----------------------------------------");
			System.out.println("메뉴선택 : ");
			int menu = scanner.nextInt();
			/* if( menu ==1 ) input()
			 * else if( menu ==2 )modify()
			 * else if( menu ==3 )search()
			 */
			switch(menu) {
			case 1:
				this.input();
				break;
			case 2:
				this.modify();
				break;
			case 3:	
				this.search();
				break;
			case 4:
				run = false;
				break;
			}//-----------------------------switch end			
		}//---------------------------------while end
		System.out.println("프로그램이 종료 되었습니다.");
	}
	//학생의 성적 정보를 배열에 입력
	public void input() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int tot = 0;
		double avg = 0;
		
		System.out.print("성명 : ");
		name = scanner.nextLine();
		System.out.print("국어 : ");		
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		
		tot = kor+eng;
		avg = (double)tot/2;
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		n[count] = name;
		s[count][0] = kor;
		s[count][1] = eng;
		count++;
	    
	}
	//학생의 성적 정보를 수정
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 성명은?");
		String modiName = scanner.nextLine();
		int kor = 0;
		int eng = 0;
		
		for(int i = 0 ; i < count ; i++) {
			if(n[i].equals(modiName)) {
				System.out.println("성명 : " + n[i]);
				System.out.println("국어점수 : " + s[i][0]);
				System.out.println("영어점수 : " + s[i][1]);
				
				System.out.println("수정할 국어성적을 입력하세요");
				System.out.println("국어 : ");
				
				s[i][0] = scanner.nextInt();
				kor = s[i][0];
				
				System.out.println("국어  " + kor);				
				System.out.println("수정할 영어성적을 입력하시오");
				System.out.println("영어 : ");
				
				s[i][1] = scanner.nextInt();
				eng = s[i][1];
				
				System.out.println("영어 " + eng);
				System.out.println("------------------------");
				System.out.println("수정된 성적");
				System.out.println("국어 : " + s[i][0]);
				System.out.println("영어 : " + s[i][1]);
			}//if end
		}//for end
		//1. 수정할 학생명을 입력받아 검색
		//2. 검색된 정보를 표시
		//3. 수정
		//4. 배열 정보 수정
		
	}
	//학생의 성적 정보를 조회 및 출력
	public void search() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 성명은?");
		String findName = scanner.nextLine();
		int tot = 0;
		double avg = 0;
		
		for(int i = 0; i < count ; i++) {
			if(n[i].equals(findName) || findName.equals("")) {
				//총점과 평균을 계산하여 출력
				tot = s[i][0]+s[i][1];
				avg = (double)tot/2.0;
				
				System.out.print(n[i] +"  ");
				System.out.print(s[i][0] + "  ");
				System.out.println(s[i][1] + "  " );
				
				
				System.out.println("총점 : " + tot);
				System.out.printf("평균 : %5.1f",avg);
				System.out.println();				
			}
			
		}
		
		
	}
	public static void main(String [] args) {
		new ArrayExam4();
	}

}
