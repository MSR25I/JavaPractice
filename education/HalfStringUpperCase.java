package education;

public class HalfStringUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="knowledge";
	System.out.println(str.length());
	
	int length=str.length();
	int mid=length/2;
	
	String firstHalf="";
	String secondHalf="";
	
	for(int i=0;i<mid;i++) {
		char firstHalf1 =str.charAt(i);
		
		if (firstHalf1 > 'A' && firstHalf1 <='Z') {
			firstHalf1 = (char) (firstHalf1 - ('a' - 'A'));
		}
		firstHalf += firstHalf1;
		
	}
	
	for(int i=mid;i<length;i++) {
		char secondHalf1 =str.charAt(i);
		
		if (secondHalf1 > 'a' && secondHalf1 <='z') {
			secondHalf1 = (char) (secondHalf1 - ('a' - 'A'));
		}
		secondHalf += secondHalf1;
		
		
	
	}
	
	System.out.println(firstHalf+secondHalf);
	
	}

}
