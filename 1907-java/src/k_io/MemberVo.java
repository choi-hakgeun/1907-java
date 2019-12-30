package k_io;

import java.io.Serializable;

public class MemberVo implements Serializable{
	
	//����ȭ/ ���δٸ� ��ǻ�Ϳ��� ������ �ϴ��� �Ʒ��� ��ȣ����
	//������ ������ ��ǻ�Ϳ��� �������� ���Ϸ� �ν�
	
	public static long serialVerssionUID = 1L; //���
	
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
	public int hashCode() {//���ü�� ���� �����Ͱ��� �ٸ�����, �ؽ��ڵ尡 ������ ���ü
		return mId.hashCode() + phone.hashCode(); //���ĺ���
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
		
		return mId + "\t"+ pwd +"\t"+ mName + "\t"+phone +"\n";  //���ĺ���
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
