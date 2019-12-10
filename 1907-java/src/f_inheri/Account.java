package f_inheri;
//변수 보관목적, 캡슐화
public class Account {
	private String mName; //맴버네임  밸류 오브젝트, 벨류를 나타내는 vo를 붙여주는것이 정석
	private String sNo; //계좌번호  밸류 오브젝트, 벨류를 나타내는 vo를 붙여주는것이 정석
	private long amount; //예금액  밸류 오브젝트, 벨류를 나타내는 vo를 붙여주는것이 정석
	
	public Account(String n, String no, long amt) {
		this.mName = n;
		this.sNo = no;
		this.amount = amt;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	

}
