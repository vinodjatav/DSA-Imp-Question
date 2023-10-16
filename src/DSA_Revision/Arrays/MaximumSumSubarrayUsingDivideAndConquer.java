package DSA_Revision.Arrays;

public class MaximumSumSubarrayUsingDivideAndConquer {
    public static int maxCrossingSum(int[] arr, int l, int m, int r) {
        // Include elements on left of mid.
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = m; i >= 1; i--) {
            sum += arr[i];
            if (sum > leftSum)
                leftSum = sum;
        }
        // Include elements on right of mid
        sum = 0;
        int rightSum = 0;
        for (int i = m; i <= r; i++) {
            sum += arr[i];
            if (sum > rightSum)
                rightSum = sum;
        }
        return Math.max(leftSum + rightSum - arr[m], Math.max(leftSum, rightSum));
    }

    public static int maximumSubarraySum(int[] arr, int l, int r) {
        if (l > r)
            return Integer.MIN_VALUE;
        if (l == r)
            return arr[l];
        int m = (l + r) / 2;
        return Math.max(Math.max(maximumSubarraySum(arr, l, m - 1), maximumSubarraySum(arr, m + 1, r)),
                maxCrossingSum(arr, l, m, r));
    }

    public static void main(String[] str) {
        System.out.println("Maximum Sum Subarray Using Divide And Conquer");
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int max_sum = MaximumSumSubarrayUsingDivideAndConquer.maximumSubarraySum(arr, 0, n - 1);
        System.out.println("Maximum contiguous sum is " + max_sum);

    }
}
