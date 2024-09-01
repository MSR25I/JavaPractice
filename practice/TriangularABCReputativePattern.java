package practice;

public class TriangularABCReputativePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		 char letter = 'A';
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(letter+" ");
			}
			System.out.println();
			letter++;
		}
	}

}
