/*
 * 정수형 2차원배열을 5행 5열을 만들어 100~200 사이의 임의의 정수값을 Math.random()을 사용하여 대입 한 후

1) 배열 전체 출력(5행5열로)
2) 전체 값들의 합계
3) 전체 최소값
4) 전체 최대값
5) 각행의 최대값
을 출력하시오.
[출처] 2019.12.05(목) 과제 (JobTC(Job Training Center of Korea)) |작성자 IT여행자
s[i][1] = (int)a;
s[i][2] = (int)a;
s[i][3] = (int)a;
s[i][4] = (int)a;
int c = s[i][0];
 */
package d_array;

public class Exam8 {
	Exam8(){
		int[][] s = new int[5][5];
		//int a = 10;
		//int b = 20;	
		int sum = 0;
		int lengthMax = 0;		
		
		for( int i = 0 ; i < 5 ; i++) {
			for( int j = 0; j < 5 ; j++ ) {				
				
			double a = Math.random()*100+100;
			s[i][j] = (int)a;
			//s[0][j] = (int)b;			
			//System.out.println();
			//System.out.print(s[0][j]);
				//if(s[])			
			System.out.print(s[i][j]+"  ");
			sum += a;
			int max = s[i][j];
			if( max < s[i][j]  ) max = s[i][j]; {
				System.out.println("전체중 최소값 : " + max);				
			}			
			
			//i for end
		}
			System.out.println();
		}//j for end		
		System.out.println("전체합 : " + sum);
	}
public static void main(String [] args) {
	new Exam8();
}
}
