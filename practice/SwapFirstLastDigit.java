package practice;

public class SwapFirstLastDigit {
	public static void main(String[] args) {
	
	int n=12345;
	
	String num=String.valueOf(n);
	
	char firstDigit=num.charAt(0);
	char lastDigit=num.charAt(num.length()-1);
	
	String swap=lastDigit + (num.substring(1, num.length()-1)) +firstDigit;
	
	System.out.println(swap);
	
    }

}
