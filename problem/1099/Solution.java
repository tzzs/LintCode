public class Solution {
    /**
     * @param nums: an array
     * @return: if it could become non-decreasing by modifying at most 1 element
     */
    public boolean checkPossibility(int[] nums) {
        // Write your code here
        int ret = 0, k = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i] || k > nums[i + 1]) {
                if (i != 0)
                    k = nums[i];
                ret++;
            }

            if (ret > 1)
                return false;
        }

        return true;
    }
}
