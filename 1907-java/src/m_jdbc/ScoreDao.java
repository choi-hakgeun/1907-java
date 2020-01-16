package m_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ScoreDao {
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public ScoreDao() {
		conn = DBconn.getConn();
	}
	public int insert(ScoreVo vo) {
		int r=0;
		try {
			String sql = " insert into score(serial, mId, rDate, subject, score) "
					   + " values(seq_score.nextval, ?,?,?,?) ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getmId() );
			ps.setString(2, sdf.format(vo.getrDate()) );
			ps.setString(3, vo.getSubject());
			ps.setInt(4,  vo.getScore());
			
			conn.setAutoCommit(false);			
			r = ps.executeUpdate();
			if(r>0) conn.commit();
			else conn.rollback();
			
			ps.close();
			conn.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	
	
	public int delete(int serial) {
		int r = 0; 
        try {
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	public ScoreVo search(int serial) {
		ScoreVo vo = new ScoreVo(); 
        try {
        	String sql = " select S.serial, S.mId, S.rDate, S.subject, S.score, "
        			+ " M.mName from Score S join member M "
        			+ " on S.mId = M.mId "
        			+ " where S.serial = ? ";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setInt(1, serial);
        	
        	ResultSet rs = ps.executeQuery();
        	if(rs.next()) {
        		vo.setmId( rs.getString("mId"));
        		vo.setrDate(rs.getDate("rDate"));
        		vo.setSubject(rs.getString("subject"));
        		vo.setScore(rs.getInt("score"));
        		vo.setmName(rs.getString("mName"));
        	}
			rs.close();
			ps.close();
			conn.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return vo;
		}
	}
	public int update(ScoreVo vo) {
		int r = 0; 
        try {
        	String sql = " update score set mId=? , rDate=? , subject=?, score=? where Serial=?";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, vo.getmId() );        	
        	ps.setString(2, sdf.format(vo.getrDate()) );
        	ps.setString(3, vo.getSubject() );
        	ps.setInt(4, vo.getScore());
        	
        	r = ps.executeUpdate();
        	
        	ps.close();
        	conn.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	public List<MemberVo> select(String find){
		List<MemberVo> list = new ArrayList<MemberVo>();
		return list;
	}

}
