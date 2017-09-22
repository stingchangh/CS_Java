package question_651;

public class Q674_Longest_Continuous_Increasing_Subsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 1, max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) count++;
            else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
