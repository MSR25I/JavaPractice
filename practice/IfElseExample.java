package practice;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=3;
		 if(N%2==0){
	            if(N>=2 && N<=5){
	                 System.out.println("Not Weird");
	                
	            }
	            else if(N>=6 && N<=20){
	                System.out.println("Weird");
	            }
	            else {
	                System.out.println("Not Weird");
	            }
	        }
		 else {
			 System.out.println("Weird");
		 }

	}

}
