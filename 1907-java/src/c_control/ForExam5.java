/*
 * ����5)ForExam.java
 * 1~1000������ �հ谡 5000�� �Ѵ� ������ ���� ����Ͻÿ�.
 */
package c_control;

public class ForExam5 {
	ForExam5(){
		int num = 0;		
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum = sum+i;
			if(sum>5000) {
				System.out.println(sum);
				break;
			}
		}
	}

}
