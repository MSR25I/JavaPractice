package streamPractice;

import java.util.Arrays;
import java.util.List;

class Employee{
	String employeeName;
	String empDepartment;
	public Employee(String employeeName, String empDepartment) {
		super();
		this.employeeName = employeeName;
		this.empDepartment = empDepartment;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
}

public class EmployeeDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=Arrays.asList(
				new Employee("Ram","Dev"),
				new Employee("Sam","Dev"),
				new Employee("Sagar","QA"),
				new Employee("Nikhil","LEAD"),
				new Employee("Anusha","Dev"),
				new Employee("Kiran","QA"),
				new Employee("Samir","LEAD")
				);
		String check="Dev";
		emp.stream()
		.filter(e->e.getEmpDepartment().equals(check))
		.map(Employee::getEmployeeName)
		.forEach(System.out::println);
				

	}

}
