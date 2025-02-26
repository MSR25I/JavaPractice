package streamPractice;

import java.util.Arrays;
import java.util.List;

class Student{
	
	String studentName;
	int studentMarks;
	public Student(String studentName, int studentMarks) {
		super();
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	
	
}

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list=Arrays.asList(
				
				new Student("Mani",78),
				new Student("siva",98),
				new Student("Raja",62),
				new Student("Devi",88),
				new Student("Kumar",67),
				new Student("Tulasi",81)
				);
		
		list.stream()
		.filter(n->n.studentMarks>75)
		.map(Student::getStudentName)
		.forEach(System.out::println);

	}

}
