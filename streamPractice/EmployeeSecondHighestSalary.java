package streamPractice;

import java.util.Arrays;
import java.util.List;

class Emp1{
	String empName;
	String empDepartment;
	int empSalary;
	
	public Emp1(String empName, String empDepartment, int empSalary) {
		super();
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
}

public class EmployeeSecondHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp1> details=Arrays.asList(
				new Emp1("Mani","Dev",50000),
				new Emp1("Siva","Test",80000),
				new Emp1("Raja","HR",30000),
				new Emp1("Devi","Dev",90000),
				new Emp1("Durga","Dev",40000),
				new Emp1("Lakshmi","Dev",60000)
				);
		details.stream()
		.sorted((e1,e2)->Double.compare(e2.getEmpSalary(),e1.getEmpSalary()))
		.skip(0)
		.findFirst()
		.ifPresent(e->System.out.println("Employee name: "+e.getEmpName()+" Department: "+e.getEmpDepartment()+" Salary: "+e.getEmpSalary()));
		
		

	}

}
