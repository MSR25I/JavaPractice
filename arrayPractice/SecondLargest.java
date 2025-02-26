package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,7,2,8,91,9,16,47};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			
		}
		System.out.println("Second largest: "+arr[1]);

	}

}
