package grade;

import java.util.Comparator;

/*
 * 이름으로 오름차순
 */
public class ZascName implements Comparator<Grade>{

	@Override
	public int compare(Grade front, Grade back) {
		return front.getName().compareTo(back.getName());
	}

}
/**
 * 뒤에 파라미터에 있는 앞글자와 비교해서 앞글자가 먼저 나오는 글자라면 그 글자부터 리터럴 해라.
 */
