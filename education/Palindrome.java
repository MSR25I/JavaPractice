package education;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121;
		int temp=num;
		int rev=0;
		
		while(temp >0) {
			int num1=temp%10;
			rev=rev*10+num1;
			temp=temp/10;
		}
		System.out.println(rev);
		
		if (rev==num) {
			
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
