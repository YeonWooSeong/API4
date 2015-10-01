package grade;

import java.util.Scanner;
import java.util.Vector;

public class HanbitSchool {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	GradeService service = new GradeServiceImpl();	
	
	while (true) {
		
		System.out.println("1번: 성적등록 2:학적부리스트보기 3:학번으로검색 4:이름으로검색  5:성적순위출력 6:이름순출력 7:종료");
		int key = scanner.nextInt();
		switch (key) {
		case 1:	
		System.out.println("학번등록");
		String hak = scanner.next();
		System.out.println("이름등록");
		String name = scanner.next();
		System.out.println("국어점수");
		int kor = scanner.nextInt();
		System.out.println("영어점수");
		int eng = scanner.nextInt();
		System.out.println("수학점수");
		 int math = scanner.nextInt();
		service.input(hak, name, kor, eng, math);
		System.out.println(service.getList());
		break;
		
		case 2:	
			System.out.println(service.getList());
			break;
		case 3:	
			System.out.println("학번 입력");
			String hakNum = scanner.next();
			service.searchByHak(hakNum);
			System.out.println(service.searchByHak(hakNum));
			break;
		case 4:	
			System.out.println("이름으로 검색");
			String name2 = scanner.next();
			service.searchByName(name2);
			System.out.println(service.searchByName(name2));
			break;
		case 5:	
			System.out.println(service.descGradeByTotal());
			break;
		case 6:	
			System.out.println(service.ascGradeByName());
			break;
		case 7:	
			System.out.println("============종료합니다=========");
			return;

		}
		
	}
		
}
}
