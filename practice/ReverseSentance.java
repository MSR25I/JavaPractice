package practice;

public class ReverseSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="the sky is blue";
		
		String a[] = str.split(" ");
		
		for(int i=a.length-1;i>=0;i--) {
		
				System.out.print(a[i]+" ");
			
		}

	}

}
