package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import jdbc.EmployeeVO;

public class StreamTest3 {
 public static void main(String[] args) {
	 List<EmployeeVO> list = new ArrayList<>();
		list.add(new EmployeeVO(200, "홍길동",  2000));
		list.add(new EmployeeVO(300, "박길동", 10000));
		list.add(new EmployeeVO(150, "정길동", 5000));
		
		// 급여가 5000이상인 사원의 이름 출력 
		list.stream()
			.filter(a -> a.getSalary() >= 5000) // 람다식 표현 
			// .forEach(a -> System.out.println(a.getFirstName()));
			.forEach(System.out::println);
		
	   List<EmployeeVO> result = list.stream()
			   						 .filter(a-> a.getSalary() >= 5000)
			   						 .collect(Collectors.toList());
	   System.out.println(result);
		
	}
 }

