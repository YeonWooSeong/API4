package grade;

import java.util.Vector;

public interface GradeService {
public void input(String hak, String name, int kor, int eng, int math); // void면 파라미터 안에 값이 존재해야함
public Vector<Grade> getList(); // ctrl + shift + o   //전체 리스트 가져오기
public Grade searchByHak(String hak);
public Vector<Grade> searchByName(String name); // 동명이인.
public Vector<Grade> descGradeByTotal(); // 성적을 내림차순으로 정렬  총점가지고 비교 (300 , 270 , 230 
public Vector<Grade> ascGradeByName(); // 성적을 이름에 따라 오름차운(ㄱ,ㄴ,ㄷ,ㄹ,ㅁ,ㅂ,...) 14


}
