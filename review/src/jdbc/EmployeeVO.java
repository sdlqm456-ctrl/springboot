package jdbc;

import java.util.Date;

public class EmployeeVO {
	
	// 파스칼케이스: 클레스이름에 사용 (BackgroundColor)
	// 스네이크케이스: 데이터베이스 (backgroundcolor) 
	// 캐밥: Css 사용 (background-color)
	// 카멜: 필드 메서드(backgroundColor)
	
	private  int employeeId; // 표기법: 파스탈케이스, 스네이크케이스, 캐밥, 카멜(자바) 
	private String firstName;
	private String lastName;
	private String Email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private double  Salary;
	private double commissionPct;
	private int managerId;
	private int departmentId;
	
	public EmployeeVO() {
		
	}

	public EmployeeVO(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		Salary = salary;
	}

	public EmployeeVO(int employeeId, String firstName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", firstName=" + firstName + "]";
	}
	
	
	
}
