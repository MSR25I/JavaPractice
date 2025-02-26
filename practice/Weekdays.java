package practice;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int dayNum=sc.nextInt();
		
		String day;
		
		switch(dayNum) {
		case 1:
			day="Sunday";
			break;
		case 2:
			day="Monday";
			break;
		case 3:
			day="Tuesday";
			break;
		case 4:
			day="Wednesday";
			break;
		case 5:
			day="Thursday";
			break;
		case 6:
			day="Friday";
			break;
		case 7:
			day="Saturday";
			break;
		default:
			day = "Invalid input! Please enter a number between 1 and 7.";
		
		}
		 System.out.println(day);

	}

}
