import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        
        // Compute GCD using the Euclidean algorithm
        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        
        return max; // GCD is stored in max
    }
}
