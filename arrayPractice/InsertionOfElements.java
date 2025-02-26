package arrayPractice;

import java.util.Scanner;

public class InsertionOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,7,2,8,1,43,65,232,98,54,32};
		int temp;
		System.out.println("Length of the Array: "+arr.length);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Insert: ");
		int num=sc.nextInt();
		System.out.println("Enter the position to be added: ");
		int index=sc.nextInt();
		
		if(index>0 && index<=arr.length) {
		
		for(int i=0;i<=index;i++){
			
				if(index==arr[i]) {
					
					arr[i]=num;
					
				}
			

			}
			
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
		else {
		System.out.println("Enter the correct index");
		}

	}

}
