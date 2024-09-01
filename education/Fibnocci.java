package education;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0, second=1;
		int n=10;
		for(int i=1;i<=n;i++) {
			System.out.print(first+",");
			int nthterm=first+second;
			first=second;
			second=nthterm;
		
		}

	}

}
