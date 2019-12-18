package h_api3;

import java.util.Comparator;

public class BoardComparator implements Comparator<BoardVo> {

char flag = 'n'; 
	

	
	@Override
	public int compare(BoardVo s1, BoardVo s2) {
		int result = 0;
		if(s1 == null || s2 ==null){ //널끼리 스와핑 되지 않도록 만드는것    if(flag == 'n') {  //if(s1 != null && s2 !=null){ 부정표현
			
			result = 0;
		}else {
			result = s1.getmDate().compareTo(s2.getmDate());
		}
		return result;
		
	}
}