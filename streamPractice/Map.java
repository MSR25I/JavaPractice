package streamPractice;

import java.util.Arrays;
import java.util.List;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(2,5,6,58,4,56,12,34,58,96);
		
		list.stream()
		.map(n->n*n)
		.forEach(System.out::println);

	}

}
