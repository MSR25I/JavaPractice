package javaSe8;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Raju";
		String temp=str;
		 String rev="";
			 
			for(int i=temp.length()-1;i>=0;i--) {
			
			 rev=rev+temp.charAt(i);
			 
		 }
			System.out.println(rev);
			
			if(rev.equalsIgnoreCase(str)) {
				System.out.println(str+"is a Palindrome");
			}
			else {
				System.out.println(str+" is not a Palindrome");
			}
	}

}
