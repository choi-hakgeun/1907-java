/*2019.12.02 ����
 * for���� ����Ͽ� �Ʒ��� �䱸 ������ ó���� �� �ֵ��� ���α׷� �Ͻÿ�. ��� ó���� ������ ForExam8()�ȿ��� ó���ϰ�, ������ Main.java���� �����Ͻÿ�.


1~100������ ���� 1000���� �߻����� 

s1 : ���ڸ���(0~9)
s10 : 10�ڸ���(10~19)
s20 : 20�ڸ���(20~29)
s30 : 30�ڸ���(30~39)
...
s90 : 90 �ڸ���(90~100)
�� ������ ī��Ʈ�Ͽ� �Ʒ��� ��¿��ÿ� ���� ����Ͻÿ�.

���ڸ� : xx��
10�ڸ� : xx��
...
90�ڸ� : xx��
[��ó] 2019.1202(��) ���� (JobTC(Job Training Center of Korea)) |�ۼ��� IT������
 */

package c_control;

public class ForExam8 {
	ForExam8() {
		//1000�� �������
		String str = "";
		int s1 = 0; 
		
		for(int i = 0; i < 1000; i++) {
			int num = (int)(Math.random()*100)+1;
			
			if(num < 10) {				
				s1++;
			}
			System.out.println(s1);				
		}
	}
}
			//int a = num+i; //�߸��� �ڵ� i+�� ���� �ʾƵ� 1000���� ��µ�
			//System.out.print(num + "  "); //����1000�����Ȯ��
			
			//int a = 0;			
			//for(; num < 10 ; a++) {
			//System.out.println(a);
			
			/*if(num < 10) {  //���ڸ��� ���
				for(int a = 0; a>0 ; a++) {
					System.out.print(a +  "  ");					
				}
			}else if(num > 10 && num < 20 ) {
				//System.out.print(num +  "  ");
			}else if(num > 20 && num < 30 ) {
				
			}else if(num > 30 && num < 40 ) {
				
			}else if(num > 40 && num < 50 ) {
				
			}else if(num > 50 && num < 60 ) {
				
			}
			
				//}
			//int s1 = num;					
		
			//for(int b = 0; b < 10 ; b = b+10) {
				
			}
			}
		//}
		
		
		
	}
*/

