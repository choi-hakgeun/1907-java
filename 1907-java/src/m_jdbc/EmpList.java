package m_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpList {
	
	public EmpList() throws Exception{
		Connection conn = DBconn.getConn();
		
		String sql = "select * from employees where to_char(hire_date,'rrrr') = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"2005");
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String eName = rs.getString("first_name");
			int   sal    = rs.getInt("salary");
			Date  nal    = rs.getDate("hire_date");
			
			System.out.println("성명 : " + eName);
			System.out.println("급여 : " + sal);
			System.out.println("날짜 : " + nal.toLocaleString());
			System.out.println("-----------------------");
		}
		pstmt.close();
		conn.close();		
	}

	public static void main(String[] args) throws Exception {
		new EmpList();

	}

}
