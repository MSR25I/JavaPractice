package arrayPractice;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,5,6,7,8};
		System.out.println("length of the array: "+arr.length);
		int temp=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
			}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
		
			for(int j=1;j<=arr[0];j++) {
				if(arr[i]==j) {
					count++;
				}
				if(count==0) {
					System.out.print(j);
			}
			
			}
		}
	}}
	

