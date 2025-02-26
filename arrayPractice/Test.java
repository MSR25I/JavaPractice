package arraysMatrix;



public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a=10;
	int b=0;
	
	try {
		int result=divide(a,b);
				System.out.println("Result: "+result);
	}
	catch(ArithmeticException e){
		System.out.println("Error: "+e.getMessage());
		
	}

		
	}

	private static int divide(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0) {
			throw new ArithmeticException("Demoinator can't divide by zero");
			
		}
		return a/b;
	}
	}