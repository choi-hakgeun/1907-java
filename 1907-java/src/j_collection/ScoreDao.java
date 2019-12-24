package j_collection;

import java.util.HashMap;
import java.util.List;

public class ScoreDao {
	public void insert(ScoreVo vo) {
		HashMap<ScoreVo, String > map = new HashMap<ScoreVo, String>();		
		map.put(vo, vo.setSno(String sno));
	}
	public void update(String sno, ScoreVo vo) {
		
	}
	public void delete(String sno, ScoreVo vo) {
		
	}
	public List<ScoreVo> list(String findStr) {
		List<ScoreVo> list = null;
		return list;
	}
	

}
