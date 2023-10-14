package DSA_Revision;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingElementInArray {
    // Simple Solution is to use two loops. The outer loop picks elements one by one
    // and the inner loop checks if the element is present more than once or not..
    public static int findFirstNonRepeatingElementInArrayBruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j)
                    break;
                if (j == arr.length - 1)
                    return i;
            }
        }
        return -1;
    }

    public static int findFirstNonRepeatingElementInArrayHashMap(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]) == 1)
                return arr[i];
        }
        return -1;

    }

    public static void main(String str[]) {
        int[] arr = new int[] { 1, 2, 3, 1, 2, 3, 4 };
        // Using simple approach
        int result = FindFirstNonRepeatingElementInArray
                .findFirstNonRepeatingElementInArrayBruteForce(arr);
        if (result == -1)
            System.out.println("No non-repeating elements.");
        else
            System.out.println(arr[result]);

        // Using HashMap approach
        int result1 = FindFirstNonRepeatingElementInArray.findFirstNonRepeatingElementInArrayHashMap(arr);
        if (result1 == -1)
            System.out.println("No non-repeating elements.");
        else
            System.out.println(result1);

    }
}
