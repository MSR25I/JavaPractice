package practice;
public class ReverseWordsWithOutSplit {
    public static void main(String[] args) {
        String str = "Hello Mani Siva";
        String result = "";

        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word; 
            
            } else {
                result += word + " "; 
                word = ""; 
              
            }
        }
        result += word;

        System.out.println(result);
    }
}
