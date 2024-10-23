package streamPractice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> student = Arrays.asList(
				
				new Student("Raja",21),
				new Student("Devi",26),
				new Student("siva",19),
				new Student("Tulasi",22),
				new Student("king",97)
				
				);
		
		
	IntSummaryStatistics summary= student
				.stream()
				.collect(Collectors.summarizingInt(s->s.age));
		
		System.out.println(summary);
		

	}

}

