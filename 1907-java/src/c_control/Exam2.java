/*
 * ㄱ. 주행거리에 따른 택시요금을 계산하여 출력.
 * ㄴ. 기본 2000m 까지는 기본요금이 3000원
 * ㄷ. 200m당 추가요금이 500원씩 과금됨.
 * ㄹ. 현재 손님의 주행거리가 4530m인 경우 택시요금을 계산하시오.
 */

package c_control;

public class Exam2 {
	Exam2(){
		int totm = 4530; //주행거리
		int base = 2000; //기본거리
		int basePrice = 3000; //기본요금
		int mPrice = 500; //추가요금
		int m = 0; //추가거리
		int totPrice = 0; //총 요금
		m = totm-base;
		
		if( m > 0 ){
			int v = m/200;
			if ( m % 200 > 0 ) {
				v++;
		    }
			totPrice = basePrice + (500*v);
		}else {
			totPrice = 3000;
		}
		
		System.out.println(totPrice);
	}

}
