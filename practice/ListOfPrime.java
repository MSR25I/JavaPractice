package practice;

import java.util.Scanner;


public class ListOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int c1=0;
		for(int i=2;i<num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {	
				if(i%j==0) {
					count++;
				}
			}
		if (count==0) {
			c1++;
			System.out.println(i);
		}
		}
		System.out.println("Total number of Prime numbers: "+c1);
	}
}
