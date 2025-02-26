package arraysMatrix;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int n=m.length;
		
		int[][] transpose=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				transpose[j][i]=m[i][j];
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(transpose[i][j]+",");
			}
			System.out.println();
		}

	}

}
