package javaSe8;

import java.util.Arrays;
import java.util.List;

public class ReommveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] c= {1,2,3,4,4,5,5,6,7};
		
		  int[] union = Arrays.stream(c)  
                  .distinct() 
                  .toArray(); 
		   System.out.println("Union Array: " + Arrays.toString(union));
		   
		   
		   Arrays.stream(c)
		   .distinct()
		   .forEach(System.out::println);
	    } 		
	

}
