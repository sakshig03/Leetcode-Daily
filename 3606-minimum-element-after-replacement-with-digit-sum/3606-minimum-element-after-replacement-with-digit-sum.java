import java.util.Arrays;

class Solution {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE; // Initialize with a large number
        
        for (int num : nums) {
            int sum = 0;
            // Calculate sum of digits for the current number
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            // Track the minimum sum of digits encountered
            minSum = Math.min(minSum, sum);
        }
        
        return minSum;
    }
}
