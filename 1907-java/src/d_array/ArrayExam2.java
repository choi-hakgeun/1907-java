package d_array;
/*
 * 1)정수형 배열을 선언하고 초기값 10개 대입(scores)
 * 2)최대값, 최소값을 저장할 변수 선언(max, min)
 * 3)max에 배열의 첫번째값을 저장(배열의 첫번째 값을 최대값으로 판정하고 시작)
 * 4)min에 배열의 첫번째값을 저장(배열의 첫번째 값을 최소값으로 판정하고 시작)
 * 5)최대값을 찾기위한 루핑~
 * 6)최소값을 찾기위한 루핑~
 * 7)최대값, 최소값 출력
 */
public class ArrayExam2 {
	ArrayExam2(){
		// 1) ~ 4)
		int[] scores = new int[]{15,89,123,15,13,54,89,23,45,68};
		int max = scores[0];
		int min = scores[0];
		//5)
		for(int i = 1; i<scores.length ; i++) {
			if(max < scores[i]) max = scores[i];
		}
		//6)
		for(int i = 1; i<scores.length ; i++) {
			if(min > scores[i])min = scores[i];
		}
		//7)
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	public static void main(String [] args) {
		ArrayExam2 a = new ArrayExam2();
	}
}
