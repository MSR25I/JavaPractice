package practice;

public class EquilateralTriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
		}
			System.out.println();

	}
	
	}
}
