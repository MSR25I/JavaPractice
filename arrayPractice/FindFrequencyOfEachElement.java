package arrays;

public class FindFrequencyOfEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,7,2,8,4,7,16,91,9,16,47};
		int count;
		int[] visited=new int[arr.length];
		
		
		
		for (int i = 0; i < arr.length; i++) {
            if (visited[i] == 1) // Skip if already counted
                continue;
            count = 1;
            
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]==arr[j]) {
				
				count++;
				visited[j]=1;
				
				
			}
		}
				
			System.out.println(arr[i]+"=="+count);
			
		}
	}}