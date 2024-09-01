package education;

public class vowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "apple";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			
		char f=	str.charAt(i);
		if(f=='A' || f=='E' || f=='I' || f=='O' || f=='U' || f=='a' || f=='e' || f=='i' || f=='o' || f=='u' ) {
			
			count=count+1;
			
		}
		
		}
		System.out.println(count);
	}

}
