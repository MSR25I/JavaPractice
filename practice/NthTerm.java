package practice;

public class NthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,3,6,10,15,21
		int n=5;
		int sCount=0;
		int count=1;
		for(int i=0;i<=n;i++) {
			
			sCount +=count;
			count++;
			
		}
		System.out.println(sCount);
	}

}
