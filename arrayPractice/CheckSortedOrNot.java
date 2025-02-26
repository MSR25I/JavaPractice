package arrays;

public class CheckSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,7,2,8,91,9,16,47};
		
		boolean isSorted=true;
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>arr[i+1]) {
					isSorted=false;
					break;
					
				}
				
			}
			
		if(isSorted) {
			System.out.println("Sorted");
			
		}
		else {
			System.out.println("Not Sorted");
		}
		

	}

}
