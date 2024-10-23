package streamPractice;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random =new Random();
		random
		.ints(5,0,11)
		.forEach(a->System.out.println(a));
		

	}

}
