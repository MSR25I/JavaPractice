package streamPractice;

import java.util.stream.IntStream;

public class IntStreamRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.range(1, 101)
		.forEach(System.out::println);

	}

}
