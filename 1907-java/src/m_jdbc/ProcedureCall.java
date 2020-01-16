package m_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception{
		Connection conn = DBconn.getConn();
		String sql = "{call AAA(?,?)}";
		CallableStatement cst = conn.prepareCall(sql);
		cst.setString(1, "aaaaaaaaaaaaa");
		cst.registerOutParameter(2, Types.VARCHAR);
		
		cst.executeQuery();
		
		String a2 = cst.getString(2);
		System.out.println(a2);

	}

}
