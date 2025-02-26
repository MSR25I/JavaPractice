package arrayPractice;

public class StockPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,5,7,8};
		int count=0;
		
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if((arr[i]+arr[j]+arr[k])%5==0) {
					
					count++;
					
				}
			}
		}
	}
	
	System.out.println(count);	

	}

}