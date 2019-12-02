/* switch 문 응용
 * 정수형 성적이 score에 저장되어 있다. score를 사용하여 학점을 구하되, switch문을 사용하여 처리하시오.
 * 
 */

package c_control;

public class SwitchEx {
	
	SwitchEx(){
		int score = 88;
		char c = ' '; //학점
		
		switch(score/10) {
		
		case 10:		    
		case 9:
			c = 'A'; break;			
		case 8:
			c = 'B'; break;
		case 7:
			c = 'C'; break;
		case 6:
			c = 'D'; break;
		default:
			c = 'F'; break;
		}
				
		System.out.println("성적 : " + score);
		System.out.println("학점 : " + c);
		
		//switch -> if
		if(score>=90)       c = 'A';
		else if (score>=80) c = 'B';
		else if (score>=70) c = 'C';
		else if (score>=60) c = 'D';
		else                c = 'F';
		
	}
	

}
