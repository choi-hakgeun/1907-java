package m_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpInsert {
	public EmpInsert() {		
		
		try {			
			Connection conn = DBconn.getConn();
			
			String sql = "insert into emp1(employee_id, last_name, hire_date, "
					+ "salary, job_id, email) values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 500);
			pstmt.setString(2, "hong");
			pstmt.setDate(3, new Date(2020,01,15));
			pstmt.setInt(4, 10000);
			pstmt.setInt(5, 100);
			pstmt.setString(6, "HONG");
			
			conn.setAutoCommit(false); // ��������!
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				conn.commit();
				System.out.println("�����Է�");
			}else {
				conn.rollback();
				System.out.println("�Է��� ����....");
			}
			
			pstmt.close();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EmpInsert();

	}

}