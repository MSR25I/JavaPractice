package practice;

import java.util.Scanner;

public class NumberOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Total no.of factors: "+count);

	}

}
