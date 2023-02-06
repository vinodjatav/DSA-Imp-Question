import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Using HashMap: O(N)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    // Using two pointer: O(N*log(N)
    public static int[] twoSumUsingSorting(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                result[0] = nums[i];
                result[1] = nums[j];
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = TwoSum.twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        int[] result1 = TwoSum.twoSumUsingSorting(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println("Indices of the two numbers such that they add up to target: " + Arrays.toString(result));
    }
}
