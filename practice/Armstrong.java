package practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int sum=0;
		int temp=num;
		while(temp>0) {
			rev=temp%10;
			sum=sum+(rev*rev*rev);
			temp=temp/10;
		}
		if (sum==num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

}
