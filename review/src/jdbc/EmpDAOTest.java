package jdbc;

import java.util.Date;
import java.util.List;

public class EmpDAOTest {
 public static void main(String[] args) {
	EmployeeDAO empDAO = new EmployeeDAO();
//	List<EmployeeVO> list = empDAO.selectAll();
//	for(EmployeeVO emp : list) {
//		// frist_name, List_name 출력 
//		System.out.println(emp.getFirstName() + " " + emp.getLastName());
	//}
	
//	 EmployeeVO emp = empDAO.selectOne(101);
//	 System.out.println(emp.getFirstName());
	 
	// 삭제 
//	 int cnt = empDAO.delete(206);
//	 System.out.println(cnt + "건이 처리됨");
	
	// 등록 
	EmployeeVO emp = new EmployeeVO();
	emp.setEmployeeId(501);
	emp.setLastName("준호");
	emp.setEmail("jn@naer.com");
	emp.setHireDate(new Date());
	emp.setJobId("IT_PROG");
	int cnt = empDAO.insert(emp);
	System.out.println(cnt + "건이 처리됨");
	
	// 수정 
	emp = new EmployeeVO();
	emp.setFirstName("지영");
	emp.setSalary(5000);
	emp.setEmployeeId(501);
	
	int cnt1 = empDAO.update(emp);
	System.out.println(cnt1 + "건이 수정됨 ");

  }
}
