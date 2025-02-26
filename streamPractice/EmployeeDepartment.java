package streamPractice;
import java.util.Arrays;
import java.util.List;

class Employee {
	String empName;
	String depName;
	public Employee(String empName, String depName) {
		super();
		this.empName = empName;
		this.depName = depName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
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
				new Employee("Samir","LEAD"));
		
		String check="Dev";
		
		emp.stream()
		.filter(employee->employee.getDepName().equals(check))
		.map(Employee::getEmpName)
		.forEach(System.out::println);
		
				

	}

}
