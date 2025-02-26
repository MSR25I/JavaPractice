package streamPractice;

import java.util.Arrays;
import java.util.List;

class Emp {
	String empName;
	String empDepartmrnt;
	int empSalary;
	public Emp(String empName, String empDepartmrnt, int empSalary) {
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

public class EmployeeLowestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> highest=Arrays.asList(
				new Emp("Mani","Dev",50000),
				new Emp("Siva","Test",70000),
				new Emp("Tulasi","SC",90000),
				new Emp("Devi","Dev",95000),
				new Emp("Raja","Test",99000),
				new Emp("King","Dev",98000),
				new Emp("Queen","SC",94000)
				);
		highest.stream()
		.sorted((e1,e2)->Double.compare(e1.getEmpSalary(), e2.getEmpSalary()))
		.findFirst()
		.ifPresent(e->System.out.println("Employee Name: "+e.getEmpName()+" Departmemt"+e.getEmpDepartmrnt()+" Salary: "+e.getEmpSalary()));

	}

}
