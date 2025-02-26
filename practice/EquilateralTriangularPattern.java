package practice;

public class EquilateralTriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+k+" ");
		}
			System.out.println();

	}
	
	}
}
