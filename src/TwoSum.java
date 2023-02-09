import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Using HashMap: O(N)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    // Using two pointer: O(N*log(N)
    public static int[] twoSumUsingSorting(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                return new int[]{nums[i], nums[j]};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = TwoSum.twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        int[] result1 = TwoSum.twoSumUsingSorting(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println("Indices of the two numbers such that they add up to target: " + Arrays.toString(result));
    }
}
