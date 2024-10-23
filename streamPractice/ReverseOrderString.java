package streamPractice;

import java.util.Comparator;
import java.util.stream.Stream;

public class ReverseOrderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> reverseAlpha =(s1,s2)->-(s1.compareTo(s2));
		Stream.of("Bunny","NTR","Raja","Siva","Mani","King","Legend","Balayya")
		.sorted(reverseAlpha)
		.forEach(System.out::println);

	}

}
