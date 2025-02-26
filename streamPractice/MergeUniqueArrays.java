package streamPractice;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUniqueArrays {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {3, 4, 5, 6};
/*
        // Merging and removing duplicates using streams
        int[] mergedUniqueArray = IntStream.concat(Arrays.stream(ar1), Arrays.stream(ar2))
                                           .distinct() // Ensures unique elements
                                           .toArray();

        // Printing the result
        System.out.println("Merged Unique Array: " + Arrays.toString(mergedUniqueArray));
        
        */
        
        
        int[] merge=IntStream.concat(Arrays.stream(ar1), Arrays.stream(ar2))
        		.distinct()
        		.toArray();
        
        System.out.println("Merged Arrays: "+Arrays.toString(merge));
    }
}
