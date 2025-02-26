package streamPractice;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("Raja","John","Mani","Devi","siva")
		.filter(s->{System.out.println("Filter: "+s);
		return true;
		})
		.forEach(s -> System.out.println("forEach: " + s));

	}

}
