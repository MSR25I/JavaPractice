package practice;
public class StringComparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";

        boolean result = areStringsEqual(s1, s2, s3);
        System.out.println(result);  // Output: true
    }

    public static boolean areStringsEqual(String s1, String s2, String s3) {
        return s1.equals(s2) && s2.equals(s3);
    }
}
