//package jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class DepartmentDAO {
//	
//	String jdbc_driver = "oracle.jdbc.OracleDriver";
//	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	String username = "hr";
//	String password = "hr";
//	
//	// 등록 
//	
////	int insert(DepartmentDAO dep) {
////		int cnt = 0;
////		String sql = """
////				   INSERT into departments(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
////				   VALUES (?, ?, ?, ?);
////					""";
////			try( // 데이터베이스 연결
////					Connection conn = DriverManager.getConnection(url, username, password);
////					
////					// SQL 구문
////					PreparedStatement stmt = conn.prepareStatement(sql);
////					) {
////					stmt.setInt(1, dep.getDepartmentId());
////					stmt.setString(2, dep.getdepartmentName());
////					stmt.setString(3, dep.managerId());
////					stmt.setDate(4, dep.locationId());
////
////				cnt = stmt.executeUpdate();
////			} catch (Exception e) {
////				e.printStackTrace();
////			}
////		return cnt;
////		
////	}
////	// 단건 조회
////	EmployeeVO selectOne(int empid) {
////		EmployeeVO emp = new EmployeeVO();
////		// 3. 데이터 조회 (select)
////		String sql = """
////					SELECT * FROM EMPLOYEES
////					WHERE EMPLOYEE_ID = ?
////					""";
////		try (
////				// 데이터베이스 연결
////				Connection conn = DriverManager.getConnection(url, username, password);
////				
////				// SQL 구문
////				PreparedStatement stmt = conn.prepareStatement(sql);
////				) {
////			stmt.setInt(1, empid);
////			
////			ResultSet rs = stmt.executeQuery();
////			if(rs.next()) {
////				emp.setFirstName(rs.getString("first_name"));
////				emp.setLastName(rs.getString("last_name"));
////				emp.setSalary(rs.getDouble("salary"));
////				// emp.setHireDate(rs.getDate("hira_Date"));
////
////			}
////			
////		} catch (Exception e) {
////			e.printStackTrace();
////		}
////		 return emp;
//	}
//}
