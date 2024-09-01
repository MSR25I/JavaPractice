package javaSe8;

public class ArraylengthReputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		int[] num= {0,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0};
		int count=0;
		
		for(int i=1;i<num.length;i++) {
			if(num[i] == num[i-1]) {
				count=count+1;
				
				
			}
			System.out.println(count);
		}
		
		*/
		

		        int[] num = {0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0};
		        
		        int maxCount = 1; // To store the maximum consecutive count
		        int currentCount = 1; // To count the current consecutive numbers
		        int maxNum = num[0]; // To store the number that has the maximum count
		        int currentNum = num[0]; // To track the current number
		        
		        for (int i = 1; i < num.length; i++) {
		            if (num[i] == currentNum) {
		                currentCount++;
		            } else {
		                // Update maxCount and maxNum if currentCount is greater
		                if (currentCount > maxCount) {
		                    maxCount = currentCount;
		                    maxNum = currentNum;
		                }
		                // Reset currentNum and currentCount
		                currentNum = num[i];
		                currentCount = 1;
		            }
		        }
		        
		        // Check for the last sequence
		        if (currentCount > maxCount) {
		            maxCount = currentCount;
		            maxNum = currentNum;
		        }

		        System.out.println("Max consecutive number: " + maxNum);
		        System.out.println("Size of consecutive occurrences: " + maxCount);
		    


	}

}
