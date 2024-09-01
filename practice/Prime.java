package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the Number: ");
		 
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int count=0;
		 
		 for(int i=2;i<num;i++) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 if(count==0) {
			 System.out.println(num+" is a Prime Number");
		 }
		
		 else {
			 System.out.println(num+" is not a Prime Number");
		 }
	}

}
