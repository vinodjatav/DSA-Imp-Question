package DSA_Revision.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInReverseOrder {
    // Using Collections.reverseOrder() method
    public static void sortArrayInReverseOrderUsingCollection() {
        Integer[] array= {1,2,3,4,5,6};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortArrayInReverseOrder(int[] arr) {
        Arrays.sort(arr);
        reverse(arr);
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] str) {
        System.out.println("Using Collections.reverseOrder() method: ");
        SortArrayInReverseOrder.sortArrayInReverseOrderUsingCollection();
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] result = SortArrayInReverseOrder.sortArrayInReverseOrder(arr);
        System.out.println(Arrays.toString(result));
    }
}
