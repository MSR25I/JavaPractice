package practice;

public class ABCGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=32, b=101, c=101;
		int large;
		
		if (a>=b && a>=c) {

			large=a;
		}
		 
		 if (b>=a && b>=c) {
			
			large=b;

		 }
		 else {
			 large=c;
		 }
		 System.out.println("Largest among three nubers: "+large);	 
}

}