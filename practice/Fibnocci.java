package practice;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		int num=10;
		int firstTerm=0;
		int secondTerm=1;
		
		
		for(int i=1;i<num;i++)
		//while(secondTerm <= num)
		{
			System.out.print(firstTerm+",");
		int nthTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nthTerm;
			
			}
	}

}
