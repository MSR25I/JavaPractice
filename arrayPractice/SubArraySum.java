package arrays;
public class SubArraySum { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	arr[] = {2, 3, -8, 7, -1, 2, 3}  -->11
				
				int arr[] = {2, 3, -8, 7, -1, 2, 3};
				
				int max=0;

		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i;j<arr.length;j++) {
				
				count=count+arr[j];
				
				if (count > max) {
				    max = count;
				}

			}
		}
		System.out.println(max);
		
		
		
	}

}