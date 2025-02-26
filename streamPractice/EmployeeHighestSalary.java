package streamPractice;

import java.util.Arrays;
import java.util.List;

class Emp2{
	String empName;
	String empDepartmrnt;
	int empSalary;
	public Emp2(String empName, String empDepartmrnt, int empSalary) {
		super();
		this.empName = empName;
		this.empDepartmrnt = empDepartmrnt;
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartmrnt() {
		return empDepartmrnt;
	}
	public void setEmpDepartmrnt(String empDepartmrnt) {
		this.empDepartmrnt = empDepartmrnt;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	
}

public class EmployeeHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp2> highest=Arrays.asList(
				new Emp2("Mani","Dev",50000),
				new Emp2("Siva","Test",70000),
				new Emp2("Tulasi","SC",90000),
				new Emp2("Devi","Dev",95000),
				new Emp2("Raja","Test",99000),
				new Emp2("King","Dev",98000),
				new Emp2("Queen","SC",94000)
				);
		highest.stream()
		.sorted((e1,e2)->Double.compare(e2.getEmpSalary(), e1.getEmpSalary()))
		.findFirst()
		.ifPresent(e->System.out.println("Employee Name: "+e.getEmpName()+" Departmemt"+e.getEmpDepartmrnt()+" Salary: "+e.getEmpSalary()));

	}

}
