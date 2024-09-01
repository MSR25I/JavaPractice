package practice;

public class TriangularABCPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		
		for(int i=1;i<=num;i++) {
			for(char j='A';j< 'A' +i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
