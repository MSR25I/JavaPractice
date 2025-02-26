package streamPractice;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(2,5,6,58,4,56,12,34,58,96);
		
		list.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);

	}

}
