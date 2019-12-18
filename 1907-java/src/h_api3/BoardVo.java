/*게시물 한건을 저장할 수 있는 데이터 객체
1. BoardVo.java(Value Object:오로지 한건의 데이터만 저장)
 - (게시물번호(no), 제목(subject), 내용(content), 작성자 아이디 (mId),  작성일(mDate), 조회수(cut) )
 - setter/getter 작성
 - toString() 재정의 하여 한줄에 내용이 출력되도록. 
 */

package h_api3;

public class BoardVo {
	int no;        //게시물번호
	String subject;//제목
	String content;//내용
	String mId;  //작성자아이디
	String mDate;//작성일  SimpleDateFormat
	int cut;  //조회수
	
	public BoardVo(int no, String subject, String content, String mId, String mDate, int cut) {
		this.no = no;
		this.subject = subject;
		this.content = content;
		this.mId = mId;
		this.mDate = mDate;
		this.cut = cut;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public int getCut() {
		return cut;
	}
	public void setCut(int cut) {
		this.cut = cut;
	}
	
	@Override
	public String toString() {
		return no + subject + content + mId + mDate + cut; 
	}
	
	

}
