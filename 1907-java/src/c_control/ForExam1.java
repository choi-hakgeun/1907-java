package c_control;

public class ForExam1 {
	ForExam1(){
		int sum = 0;
		for(int i = 1; i<=100; i++) { //1~100
			sum = sum + i;
			System.out.println(i+ "까지의 합 :" + sum);
		}
		System.out.println(sum);
	}

}
