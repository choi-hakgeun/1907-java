package k_io;

import java.io.Serializable;

public class MemberVo implements Serializable{
	
	//직렬화/ 서로다른 컴퓨터에서 컴파일 하더라도 아래의 번호값이
	//같으면 동일한 컴퓨터에서 컴파일한 파일로 인식
	
	public static long serialVerssionUID = 1L; //상수
	
	private String mId;
	private String pwd;
	private String mName;
	private String phone;
	
	public MemberVo(String mId, String pwd, String mName, String phone){
		this.mId = mId;
		this.pwd = pwd;
		this.mName = mName;
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {//동등객체와 값이 같은것과는 다른개념, 해시코드가 같으면 동등객체
		return mId.hashCode() + phone.hashCode(); //추후변경
	}
	@Override
	public boolean equals(Object obj) {
		String find = (String) obj;
		boolean result = false;
		
			if(mId.indexOf(find)>=0|| mName.indexOf(find) >= 0 || phone.indexOf(find)>=0) {
				result = true;
			}
		
		return result;
	}
	@Override
	public String toString() {
		
		return mId + "\t"+ pwd +"\t"+ mName + "\t"+phone +"\n";  //추후변경
	}
	

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
