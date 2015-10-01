package grade;

/*
 * 성적표 관리 객체 클래스
 */
public class Grade {

	private int kor, eng, math;
	String hak;
	private String name; // 학번은 유일한 id 값.

	
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getHak() {
		return hak;
	}

	public String getName() {
		return name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return (this.kor + this.math + this.eng);
	}
	@Override
	public String toString() {
		return "성적 [학번=" + this.hak + ", 이름=" + this.name + "종합점수"+getTotal()+"]";
	}
// alt shift s s
}
