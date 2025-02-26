package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,7,2,8,91,9,16,47};
		
		int[] reversedArray=new int[arr.length];
		
	//	for(int i=arr.length-1;i>=0;i--)
		for(int i=0;i<arr.length;i++){
			
			reversedArray[i]=arr[arr.length-1-i];
		}
		
		System.out.println("Reversed array: "+Arrays.toString(reversedArray));

	}

}
