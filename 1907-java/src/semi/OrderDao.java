package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDao {
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			
	public OrderDao() {		
		conn = DBconn.getConn();
	}
	public int insert(OrderVo vo) {
		int r= 0;
		try {
			String sql = " insert into Orderlog values(seq_orderlog.nextval, ?, ?, sysdate, ?, ?) ";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getoName());
			ps.setInt(2, vo.getOea());
			ps.setInt(3, vo.getoPrice());
			ps.setString(4, vo.getmId());
			
			conn.setAutoCommit(false);
			r = ps.executeUpdate();			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	
	
	public int delete(int oNum) {
		int r = 0;
		try {
			String sql = " delete from OrderLog where OrderNO = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, oNum);
			
			conn.setAutoCommit(false);
			r = ps.executeUpdate();
			
			if(r>0) { 
				conn.commit();			
			}else {
				conn.rollback();
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	// �ֹ���ȣ�� �ֹ����� �˻�
	public OrderVo search(int oNum) {
		OrderVo vo = null;
		try {
			String sql = "select OrderNo, FoodName, Ordercnt, OrderDT, OrderPrice, UserId "
					+ " from OrderLog "
					+ " where orderno =? ";
					
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setInt(1,  oNum);
					ResultSet rs = ps.executeQuery();
					if(rs.next()) {
						vo = new OrderVo();
						vo.setoName(rs.getString("FoodName"));
						vo.setOea(rs.getInt("Ordercnt"));
						vo.setoDate(rs.getDate("OrderDT"));
						vo.setoPrice(rs.getInt("OrderPrice"));
						vo.setmId(rs.getString("UserId"));
						
					}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return vo;
		}
	}
	public int update(OrderVo vo) {
		int r = 0;
		try {
			String sql = " update OrderLog set FoodName =?, OrderCnt=?, OrderDT=?, OrderPrice=?, UserID=? where OrderNo=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getoName() );
			ps.setInt(2, vo.getOea() );			
			ps.setString(3, sdf.format(vo.getoDate()) );
			ps.setInt(4, vo.getoPrice() );
			ps.setString(5, vo.getmId() );
			ps.setInt(6, vo.getoNum());
			
			r = ps.executeUpdate();			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}

	public List<OrderVo> select(String find){		
		List<OrderVo> list = new ArrayList<OrderVo>();
		
		try {
			String sql = " select * from OrderLog "
					+ " where orderNo like ? "
					+ " or UserId like ? "
					+ " or FoodName like ? ";
										
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			ps.setString(2, "%" + find + "%");
			ps.setString(3, "%" + find + "%");
			
			ResultSet rs = ps.executeQuery();			
			
			while(rs.next()) {				
				OrderVo vo = new OrderVo();
				vo.setoNum(rs.getInt("OrderNo"));
				vo.setoName(rs.getString("FoodName"));
				vo.setOea(rs.getInt("Ordercnt"));
				vo.setoDate(rs.getDate("OrderDT"));
				vo.setoPrice(rs.getInt("orderPrice"));
				vo.setmId(rs.getString("UserID"));
				
				list.add(vo);
			}
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return list;
		}
				
	}
	public List<FoodVo> menu(){
		List<FoodVo> flist = new ArrayList<FoodVo>();
		try {
			String sql = " select FoodName, salesPrice from Food where is_sales = 'Y' ";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String FoodName = rs.getString("FoodName");				
				int SalPrice = rs.getInt("salesPrice");
				FoodVo vo = new FoodVo(FoodName, SalPrice);			
				flist.add(vo);
			}
			
			rs.close();
			ps.close();			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return flist;
		}		
	}
	
	public List<OrderVo> OrderList(){//OrderLog ���̺��� �����͸� �޾ƿͼ� olist�� ���� �� ��ȯ
		List<OrderVo> olist = new ArrayList<OrderVo>();
		try {
			String sql = " select * from Orderlog order by orderNo ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int oNum = rs.getInt("OrderNo");
				String oName = rs.getString("FoodName");
				int oea = rs.getInt("Ordercnt");
				Date oDate = rs.getTimestamp("OrderDT");
				int oPrice = rs.getInt("OrderPrice");
				String mId = rs.getString("userID");
				OrderVo vo = new OrderVo(oNum, oName, oea, oDate, oPrice, mId);
				olist.add(vo);
			}
			rs.close();
			ps.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return olist;
		}
		
		
	}

}
