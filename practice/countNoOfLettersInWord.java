package practice;

public class countNoOfLettersInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Mani Sivaraja Indana has an experience of 3 years in Infosys";
		
			
			int count=0;
			for(int i=0;i<str.length();i++) {
				if( str.charAt(i) !=' ') {
					
					count++;
					
				}
				else {
					System.out.println(count);
					count=0;
				}
						}

	}

}
