package practice;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=1;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				count++;
				
			}
		}
		System.out.println("Total no.of words in the given sentance: "+count);
	}

}
