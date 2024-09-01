package practice;

import java.util.Scanner;

public class NoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			char f=str.charAt(i);
			if(f == 'A' || f=='E' || f=='I' || f=='O' || f=='U' || f=='a' || f=='e' || f=='i' || f=='o' || f=='u' ) {
				count++;
			}
		}
		System.out.println(count);
			
	}

}
