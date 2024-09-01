package practice;

import java.util.Scanner;
public class SumOfDigitsInNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println(sum);
	}

}
