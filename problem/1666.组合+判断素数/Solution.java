public class Solution {
    /**
     * @param a: the n numbers
     * @param k: the number of integers you can choose
     * @return: how many ways that the sum of the k integers is a prime number
     */
    public int getWays(int[] a, int k) {
        // Write your code here
        int n = a.length;
        if (n == 0)
            return 0;

        return dfs(a, k, 0, 0, 0);
    }

    private int dfs(int[] a, int k, int i, int numberAlreadyPic, int sum) {
        if (numberAlreadyPic == k) {
            if (isPrime(sum))
                return 1;
            else
                return 0;
        }

        if (i == a.length)
            return 0;

        int ret = 0;
        ret += dfs(a, k, i + 1, numberAlreadyPic + 1, sum + a[i]);
        ret += dfs(a, k, i + 1, numberAlreadyPic, sum);

        return ret;
    }

    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
