package arrayPractice;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,2,6,1,7,3};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		System.out.println("5th largest element in the array: "+arr[4]);
	}

}
