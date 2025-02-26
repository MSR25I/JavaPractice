package practice;


public class CountForNoOfCharacters {

    public static void main(String[] args) {
        String s1 = "hello world";
        int[] count = new int[256]; 

      
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }

     
        for (int i = 0; i < s1.length(); i++) {
        	 char ch = s1.charAt(i);
        	
        	if(s1.charAt(i)==' ') {
				count[ch]=0;
			}
        	
        	
           
        	if (count[ch] > 0) { 
                System.out.println(ch + "=" + count[ch]);
                count[ch] = 0; 
            }
        }
    }
}
