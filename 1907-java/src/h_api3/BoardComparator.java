package h_api3;

import java.util.Comparator;

public class BoardComparator implements Comparator<BoardVo> {

char flag = 'n'; 
	

	
	@Override
	public int compare(BoardVo s1, BoardVo s2) {
		int result = 0;
		if(s1 == null || s2 ==null){ //�γ��� ������ ���� �ʵ��� ����°�    if(flag == 'n') {  //if(s1 != null && s2 !=null){ ����ǥ��
			
			result = 0;
		}else {
			result = s1.getmDate().compareTo(s2.getmDate());
		}
		return result;
		
	}
}