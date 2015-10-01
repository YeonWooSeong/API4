package grade;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	Vector<Grade> vec = new Vector<Grade>();
	ZascName aSort = new ZascName();
	ZdescTotal dSrot = new ZdescTotal();
	/*
	 *학생을 성적부에 등록하기. 
	 *힌트는 백터 메소드 중에 한 객체만 넣는 메소드를 사용하세요 = 연산자는 안됨.  (한줄)
	*/
	@Override
	public void input(String hak, String name , int kor , int eng, int math) {
		Grade grade = new Grade();
		grade.setHak(hak);
		grade.setName(name);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		
		vec.add(grade);
	}
/**
 * 성적부에 등록된 전체 학생 리스트 출력
 * 힌트)필드에 있는 객체에 모든 학생리스트가 있을 것이다.
 * 필드 객체 값을 지역변수에 할당
 */
	@Override
	public Vector<Grade> getList() {
		/*Vector<Grade>temp = new Vector<Grade>();*/
		
		
		return vec;
	}//던져놓고 로직을 생각하라?

	
	/**
	 * 학번으로 백터를 뒤져서 일치하는 학번 한개만 리턴하기
	 */
	@Override
	public Grade searchByHak(String hak) { // 번호로만 입력.
		Grade grade = new Grade();
		String hakName = null;
		for (int i = 0; i <vec.size(); i++) {       //array.length 대신의 백터의 length를 구하는 메소드 찾아볼 것.
			if (vec.elementAt(i).getHak().equals(hak)) {
				grade = vec.elementAt(i);
			}
			
		}
		return grade;
	}

	/**
	 * 이름으로 학적부에 등록된 학생정보 전부 검색하기. (동명이인일 경우 전부 검색)
	 */
	
	@Override
	public Vector<Grade> searchByName(String name) {  // 동명이인을 구별하기 위해서 백터값을 설정  ex: 홍길동이 2명이면 검색 -> 홍길동 하나 백터값 입력하면 둘
		Vector<Grade>temp = new Vector<Grade>();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.elementAt(i).getName().equals(name)) {
				temp.addElement(vec.elementAt(i));
			}
		}
		
		return temp;
		
	}
	@Override
	public Vector<Grade> descGradeByTotal() {
		Collections.sort(vec,dSrot);
		return vec;
	}
	@Override
	public Vector<Grade> ascGradeByName() {
		Collections.sort(vec,aSort);
		return vec;
	}

		
	}


