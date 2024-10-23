package streamPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,4,9,36,12,17,45,18};
		
		Arrays.stream(arr)
		.filter(n->n%2==0)
		.sorted()
		.forEach(System.out::println);

	}

}
