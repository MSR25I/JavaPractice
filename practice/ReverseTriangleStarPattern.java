package practice;

public class ReverseTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=num;j++) {
				if(i<=j) {
				System.out.print("* ");
				}
				
			}
			System.out.println();
		}

	}

}
