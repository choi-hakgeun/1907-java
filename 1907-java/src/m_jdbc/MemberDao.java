package m_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDao { //현장에서는 MemberDao 인터페이스를 먼저만듬.
	Connection conn;
	
	public MemberDao() {
		conn = DBconn.getConn();
	}
	
	public List<MemberVo> select(String find){
		List<MemberVo> list = new ArrayList<MemberVo>();
		String sql = " select * from member "
				   + " where mId like ? or mName like ? "
				   + " order by mName ";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			ps.setString(2, "%" + find + "%");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String mId   = rs.getString("mId");
				String mName = rs.getString("mName");
				Date rDate   = rs.getDate("rDate");
				int grade    = rs.getInt("grade");
				MemberVo vo = new MemberVo(mId, mName, rDate, grade);
				list.add(vo);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return list;
		}
		
	}
}
