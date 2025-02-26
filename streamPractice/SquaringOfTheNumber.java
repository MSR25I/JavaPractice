package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaringOfTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		int[] num= {2,4,6,5,3};
		
		Arrays.stream(num)
		.map(n->n*n)
		.forEach(System.out::println);
		*/
		
		
		List<Integer> num=Arrays.asList(2,3,5,6,8);
		num.stream()
		.map(n->n*n)
		.filter(e->e%2==0)
		.forEach(System.out::println);
		

	}

}
