/*
 * ������ 2�����迭�� 5�� 5���� ����� 100~200 ������ ������ �������� Math.random()�� ����Ͽ� ���� �� ��

1) �迭 ��ü ���(5��5����)
2) ��ü ������ �հ�
3) ��ü �ּҰ�
4) ��ü �ִ밪
5) ������ �ִ밪
�� ����Ͻÿ�.
[��ó] 2019.12.05(��) ���� (JobTC(Job Training Center of Korea)) |�ۼ��� IT������
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
				System.out.println("��ü�� �ּҰ� : " + max);				
			}			
			
			//i for end
		}
			System.out.println();
		}//j for end		
		System.out.println("��ü�� : " + sum);
	}
public static void main(String [] args) {
	new Exam8();
}
}
