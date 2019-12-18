/*�Խù� �Ѱ��� ������ �� �ִ� ������ ��ü
1. BoardVo.java(Value Object:������ �Ѱ��� �����͸� ����)
 - (�Խù���ȣ(no), ����(subject), ����(content), �ۼ��� ���̵� (mId),  �ۼ���(mDate), ��ȸ��(cut) )
 - setter/getter �ۼ�
 - toString() ������ �Ͽ� ���ٿ� ������ ��µǵ���. 
 */

package h_api3;

public class BoardVo {
	int no;        //�Խù���ȣ
	String subject;//����
	String content;//����
	String mId;  //�ۼ��ھ��̵�
	String mDate;//�ۼ���  SimpleDateFormat
	int cut;  //��ȸ��
	
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
