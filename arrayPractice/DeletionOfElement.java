package arrayPractice;

import java.util.Scanner;

public class DeletionOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int[] arr = {5, 7, 2, 8, 1, 43, 65, 232, 98, 54, 32};
        System.out.println("Length of the Array: " + arr.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to remove the number: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.println("Array after removal:");
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
                }
            }
        } else {
            System.out.println("Enter a valid index.");
        }

        sc.close();

	}

}
