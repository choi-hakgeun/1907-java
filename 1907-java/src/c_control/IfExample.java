/* 2019.11.28 ���ǹ��� �ݺ���
 * �ۼ��� : 2019.11.28(��) 
 * �������� : if��
 */

package c_control;

public class IfExample {
	
//	IfExemple() {}
	int type1(){
		int r = 0;
		
		int score = 93;		
		
		if( score >= 90 ) {
			//TODO
			System.out.println("������ 90 �̻� �Դϴ�.");
			System.out.println("����� 'A' ��� �Դϴ�.");
		}
		if( score < 90) {
			System.out.println("������ 90 �̸� �Դϴ�.");
			System.out.println("����� 'B' ��� �Դϴ�.");
		}
		
		
		return r;		
	}
	
	String type2() {
		String r = null;
		int s = 90;
		
		if( s>=90 ) {
			r = "90�̻���";
			r += "\nA";	
			System.out.println(r);
		}else {
			System.out.println("90�̸���");
			System.out.println("B");
		}
		
		
		return r;
	}
	/*
	 * ������ if~else if�� ����Ͽ� ������ ���Ͽ� r�� �����Ͻÿ�.
	 */
	char type3() {
		 char r = ' ';
		 int s = 60;
		 
		 if( s >= 90 ) r = 'A';
		 else if ( s >= 80 ) r = 'B';
		 else if ( s >= 70 ) r = 'C';
		 else if ( s >= 60 ) r = 'D';
		 else r = 'f';
		 
		 /*if( s >= 90 ) {
			 System.out.println("90�̻���");
			 System.out.println("A");
		 }else if(s>=80){
			 System.out.println("80�̻���");
			 System.out.println("B");			 
		 }else if(s>=70) {
			 System.out.println("70�̻���");
			 System.out.println("C");
		 }else if(s>=60) {
			 System.out.println("60�̻���");
			 System.out.println("D");
		 }
		 */
		
		return r;
	}
	
	void type4() {
		
	}
	
	public static void main(String [] args) {
		IfExample obj = new IfExample(); //JVM�� �Ű������� ���� �����ڸ� �Ӵ�
		int k = obj.type1();
		String m = obj.type2();
		char r = obj.type3();
		System.out.println(r);
	}

}
