package arrayPractice;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {6,2,4,7,9,12,34,2,78,23,6,54};
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println("Total no.of duplicates: "+count);
	}

}
