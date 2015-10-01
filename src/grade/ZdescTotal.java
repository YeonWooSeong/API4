package grade;

import java.util.Comparator;

public class ZdescTotal implements Comparator<Grade>{

	@Override
	public int compare(Grade front, Grade back) {
		
		return  front.getTotal() > back.getTotal()?
				-1 : front.getTotal() < back.getTotal()?
						1:0;
		
		
		
	}

	
}


/**
*삼항 연산자
*
*(컨디션) ?  -1 : (거짓이라면 다시 컨디션을 주고) ? true : false;
*
**/
