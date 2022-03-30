public class Solution {
    /**
     * @param a: an integer array
     * @return: nothing
     */
    public void sortIntegers2(int[] a) {
        // write your code here
        int n = a.length;

        quickSort(a, 0, n - 1);
    }

    private void quickSort(int[] a, int start, int end) {
        if (start >= end)
            return;

        int pivot = a[start];
        int left = start;
        int right = end;

        while (left < right) {
            while (left < right && a[right] >= pivot)
                right--;
            a[left] = a[right];

            while (left < right && a[left] <= pivot)
                left++;
            a[right] = a[left];
        }

        a[left] = pivot;

        quickSort(a, start, left - 1);
        quickSort(a, left + 1, end);
    }
}
