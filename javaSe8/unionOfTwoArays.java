package javaSe8;

import java.util.Arrays;

public class unionOfTwoArays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     //----->output=2,6,7,8,9,10
		
		int[] a= {1,2,3,4};
		int[] b= {4,5,6};
		
		int[] c=new int[a.length + b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i + a.length ] =b[i];
		}
		System.out.println("Merged array: "+Arrays.toString(c));
		
		   int[] union = Arrays.stream(c)  
                   .distinct() 
                   .toArray(); 
		   System.out.println("Union Array: " + Arrays.toString(union));
	    } 		
	}
