package practice;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Iterate over the array to find the two numbers that sum up to the target
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two numbers
                    return new int[] { i, j };
                }
            }
        }
        
        // Return an empty array if no two numbers sum up to the target
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example array and target
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Get the result from twoSum method
        int[] result = sol.twoSum(nums, target);
        
        // Print the result
        if (result.length > 0) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution");
        }
    }
}
