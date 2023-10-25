package DSA_Revision.Stack;

public class NextGreaterElement {
    // TC- O(N^2), AS- O(1)
    public static void NGE(int[] arr) {
        int i, j, next;
        for (i = 0; i < arr.length; i++) {
            next = -1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " ---> " + next);
        }
    }
    public static void main(String[] args){
        System.out.println("Next greater element using a stack: ");
        int arr[] = { 11, 13, 21, 3 };
        NextGreaterElement.NGE(arr);
    }
}
