package arrayPractice;

public class ArrayPrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr ={2,3,5,7,9,11,13};
		 int arrCount=0;

		for(int i=0;i<=arr.length-1;i++) {   
			int count=0;
			
			for(int j=2;j<arr[i];j++) {    
			if(arr[i]%j==0) {  
				 count++;
			}
		}
		if(count==0) {
			arrCount++;
			System.out.println(arr[i]);
			
		}
		
	}
		System.out.println("Total no.of Prime numbers in the given array: "+arrCount);
	}
}
