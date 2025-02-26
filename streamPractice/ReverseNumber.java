package streamPractice;

import java.util.stream.IntStream;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		
		
		int rev=IntStream.iterate(num, n->n>0,n->n/10)
				.map(n->n%10)
				.reduce(0, (reversed, digit)-> reversed*10+digit);
		
		System.out.println("Reverse of the given number: "+rev);
	}

}
