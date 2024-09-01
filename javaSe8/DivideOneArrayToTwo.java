package javaSe8;

import java.util.ArrayList;

public class DivideOneArrayToTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2,3,5,8,9,10,56,25};
		
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		
		for(int num1 : num) {
			if(num1 % 2==0) {
				evenList.add(num1);
			}
			else {
				oddList.add(num1);
			}
		}
			 System.out.println("Even numbers: ");
		        for (int evennum : evenList) {
		            System.out.println(evennum + ",");
		        }

		        System.out.println("Odd numbers: ");
		        for (int oddnum : oddList) {
		            System.out.println(oddnum + ",");
		            
		            
			
		
		}

	}}
