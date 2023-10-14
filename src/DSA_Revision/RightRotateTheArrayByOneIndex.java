package DSA_Revision;

import java.util.Arrays;

public class RightRotateTheArrayByOneIndex {
    public static int[] rightRotateTheArrayByOneIndex(int[] arr){
        int l = arr.length;
        int lastElement = arr[l-1];
        for(int i=l-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        return arr;
    }
    public static void main(String[] str){
        int[] result = RightRotateTheArrayByOneIndex.rightRotateTheArrayByOneIndex(new int[] {1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(result));
    }
}
