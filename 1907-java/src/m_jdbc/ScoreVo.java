package m_jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScoreVo {
	int serial;
	String mId;
	String mName;
	Date rDate;
	String subject;
	int score;
	public ScoreVo() {}
	public ScoreVo(int se, String id, String mName, Date rd, String sub, int sc) {
		this.serial = se;
		this.mId = id;
		this.mName = mName;
		this.rDate = rd;
		this.subject = sub;
		this.score = sc;		
	}
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String d = sdf.format(rDate);
		String temp = String.format("%10d\t%15s\t20s\t%10s\t%30s\t%7.1f",
				                     serial, mId, d, subject, score);
		return temp;
	}
	
	
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
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
	public Date getrDate() {
		return rDate;
	}
	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}
