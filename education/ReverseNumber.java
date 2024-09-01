package education;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rev=0;
		int x=12345;
		
		while(x!=0) {
				int y=x%10;
				rev=rev*10+y;
				x=x/10;
		
		}
		System.out.println(rev);
		if (x==rev) {
			System.out.println(x+" is Palindrome");
		}
		else {
			System.out.println(x+" is not a Palindrome");
		}
	}

}
