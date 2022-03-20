public class Solution {
    /**
     * @param nums: An array of integers
     * @return: An integer
     */
    public int findMissing(int[] nums) {
        // write your code here
        int n = nums.length;
        int count = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            count -= nums[i];
        }
        return count;
    }
}
