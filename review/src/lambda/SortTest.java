package lambda;

import java.util.ArrayList;

/* 
 * 람다식 => 익명 클래스(추상메서드가 하나뿐인 경우)
 * */

import java.util.Comparator;
import java.util.List;

import jdbc.EmployeeVO;

public class SortTest {
 public static void main(String[] args) {
	List<EmployeeVO> list = new ArrayList<>();
	list.add(new EmployeeVO(200, "홍길동"));
	list.add(new EmployeeVO(300, "박길동"));
	list.add(new EmployeeVO(150, "정길동"));
	
	list.sort((EmployeeVO o1, EmployeeVO o2) -> o2.getEmployeeId() - o1.getEmployeeId()
	);
	System.out.println(list);
	
  }
	 
 	}
class NameComepare implements Comparator<EmployeeVO> {

	@Override
	public int compare(EmployeeVO o1, EmployeeVO o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}

class IdCompare implements Comparator<EmployeeVO> {
	
	@Override
	public int compare(EmployeeVO o1, EmployeeVO o2) {
		return o1.getEmployeeId() - o2.getEmployeeId(); // 오름차순
	}
}
