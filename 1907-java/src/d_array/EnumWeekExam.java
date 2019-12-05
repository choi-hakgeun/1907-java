package d_array;

import java.util.Calendar;

public class EnumWeekExam {
	Week today = null;
	Calendar cal = Calendar.getInstance();
	int week = cal.get(Calendar.DAY_OF_WEEK);
	
	EnumWeekExam(){
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY;break;
		case 4 : today = Week.WEDNESDAY;break;
		case 5 : today = Week.THURSDAY;break;
		case 6 : today = Week.FRIDAY;break;
		case 7 : today = Week.SATURADY;break;
		
		}
		System.out.println(week);
		System.out.println("오늘요일 : " + today);
		if (today == Week.SUNDAY) {
			System.out.println("일요일엔 축구");			
		}else {
			System.out.println("자바 공부");
		}
		
	}
	public static void main(String[] args) {
		new EnumWeekExam();
		// TODO Auto-generated method stub

	}

}
