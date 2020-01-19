package semi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderVo {
	int oNum;
	String mId;	
	String mName;
	Date oDate;
	String oName;
	int oea;
	int oPrice;
	
	public OrderVo() {}
	public OrderVo(int on, String id, String mName, Date od, String oName, int oea, int op) {
		this.oNum = on;
		this.mId = id;
		this.mName = mName;
		this.oDate = od;
		this.oName = oName;
		this.oea = oea;
		this.oPrice = op;
	}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		
		String d = null;
		if( oDate == null ) {
			d="";
		}else {
			d = sdf.format(oDate);
		}
		
		String temp = String.format("%10d\t%15s\t%20s\t%10s\t%30s\t%7d\n",
				oNum, mId, mName, d, oName, oea, oPrice);
		return temp;	
	}
	public int getoNum() {
		return oNum;
	}
	public void setoNum(int oNum) {
		this.oNum = oNum;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public Date getoDate() {
		return oDate;
	}
	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getOea() {
		return oea;
	}
	public void setOea(int oea) {
		this.oea = oea;
	}
	public int getoPrice() {
		return oPrice;
	}
	public void setoPrice(int oPrice) {
		this.oPrice = oPrice;
	}

}
