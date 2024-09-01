package javaSe8;

import java.util.HashSet;

public class intersectionOfTwoArays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// ---->using for loop
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {4,5,6,7,8,9};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i] == arr2[j]) {
					
					System.out.println(arr1[i]);
				}
				
			}
		
		}
	}

	}
		
	/*	
	 * ----->using iteration 
	
	   //  int arr1[] = {2, 6, 7, 8, 9};
	     //  int arr2[] = {6, 9, 10};
	 
	       /**
	        Take two indexes,
	        and initialize with zero.
	       
	       int i = 0;
	       int j = 0;
	 
	       while(i < arr1.length && j < arr2.length) { 
	         if(arr1[i] == arr2[j]) { 
	            System.out.println(arr1[i]); 
	            i++; 
	            j++; 
	         } 
	         else if(arr1[i] > arr2[j]) {
	           j++;
	         } else {
	           i++;
	        }
	    } 
		
	       
	       //----> using Hashset
	       
	       int arr1[] = {2, 3, 4, 5, 6};
	       int arr2[] = {4, 6, 7, 8, 9};
	       
	       //Declare hashset   
	       HashSet<Integer> set1 = new HashSet();
	       
	       //Traverse an array, put each element in a set
	       for(int val: arr1){
	         set1.add(val);
	       }
	   
	       
	         Traverse second array values,
	         Search the value in a set (set1),
	         If element is found then print it.
	       
	       for(int val: arr2){
	         if(set1.contains(val)){
	            System.out.println(val);
	         }
	      } 
	       */
	
