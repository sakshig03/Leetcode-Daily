class Solution {
    public int differenceOfSum(int[] nums) {
        int digiSum = 0;
        int eleSum = 0;
        for (int i = 0; i < nums.length; i++) {
            eleSum += nums[i];
            // digiSum
            if (nums[i] > 9) {
                while (nums[i] > 0) {
                    int ld = nums[i] % 10;
                    digiSum += ld;
                    nums[i] = nums[i] / 10;

                }
            }
            else{
                digiSum+=nums[i];
            }
        }
        return Math.abs(eleSum-digiSum);

    }
}