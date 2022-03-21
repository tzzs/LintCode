public class Solution {
    /**
     * @param n: an integer
     * @return: return all prime numbers within n.
     */
    public List<Integer> prime(int n) {
        // write your code here

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (check(i)) {
                list.add(i);
            }
        }
        return list;
    }

    boolean check(int k) {
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

}
