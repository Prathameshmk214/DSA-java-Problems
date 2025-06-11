import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);  // Sorts in place

        int longest = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                currentStreak++; // sequence continues
            } else {
                longest = Math.max(longest, currentStreak);
                currentStreak = 1; // reset streak
            }
        }

        return Math.max(longest, currentStreak);  // longest sequence
    }
}
