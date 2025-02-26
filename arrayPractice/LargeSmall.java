package arrays;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,7,2,8,91,9,16,47};
		int large=arr[0];
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>large) {
					
					large=arr[i];
					
				}
				if(arr[i]<small) {
					small=arr[i];
				}
				

		}
		System.out.println("Large number: "+large);
		System.out.println("Small number: "+small);
	}

}
