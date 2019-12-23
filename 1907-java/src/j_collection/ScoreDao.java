package j_collection;

import java.util.HashMap;

public class ScoreDao {
	public void insert(ScoreVo vo) {
		HashMap<ScoreVo, String > map = new HashMap<ScoreVo, String>();		
		map.put(vo, vo.getSno());
	}
	public void update(String sno, ScoreVo vo) {
		
	}
	public void delete(String sno) {
		
	}
	public void list(String findStr) {
		
	}
	

}
