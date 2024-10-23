package streamPractice;

import java.util.stream.Stream;

public class AnyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("Raja","John","Mani","Devi","siva")
		.map(s->{System.out.println("Map: "+s);
		return s.toUpperCase();
			})
		.anyMatch(s->{System.out.println("any match: "+s);
		return s.startsWith("M");
		});
		
	}

}
