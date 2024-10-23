package streamPractice;

import java.util.Arrays;

public class CheckEmptyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"","Raja","devi","","king",""};
	long count=	Arrays.stream(str)
		.filter(s->s.isEmpty())
		.count();
		
		System.out.print(count);
	}

}
