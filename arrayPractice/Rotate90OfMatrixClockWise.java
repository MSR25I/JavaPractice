package arraysMatrix;

public class Rotate90OfMatrixClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m={ 
				{1,2,3},
				{4,5,6},
				{7,8,9} 
				};
		
		int n=m.length;
		
		int[][] reverse=new int[n][n];
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				
				reverse[j][n-1-i]=m[i][j];
								
			}
		}
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
			
			System.out.print(reverse[i][j]+",");
			}
			System.out.println();
			}
		
			}
		

	}

