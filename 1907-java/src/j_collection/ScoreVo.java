package j_collection;

public class ScoreVo {
	private String sno;
	private String mName;
	private String exam;
	
	private int grade;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	private double avg;
	
	public ScoreVo() {}
	public ScoreVo(String sno, String mName, String exam, 
			        int grade, int kor, int eng, int mat ) {
		this();
		this.sno = sno;
		this.mName = mName;
		this.exam = exam;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.tot = (kor+eng+mat);
		this.avg = (double)tot/3;//tot색확인
	}
	
	@Override
	public boolean equals(Object obj) {//매개변수가 ScoreVo가 되면 다른객체로 판단? 오버라이드기능이 사라짐
		boolean r = false;
		if(obj instanceof ScoreVo) {
			ScoreVo s = (ScoreVo)obj;
			if(getSno().equals(s.getSno())) r = true;
		}
		return r;		
	}
	@Override
	public int hashCode() {
		return sno.hashCode();
	}
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getExam() {
		return exam;
	}
	public void setExam(String exam) {
		this.exam = exam;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

}
