package Easy;
public class ValidateSubsequence {
    // Concept of Subsequence : using while loop
    // O(n) time | o(1) space
    public static boolean validateSubsequence(int[] array, int[] sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.length && seqIdx < sequence.length) {
            if (array[arrIdx] == sequence[seqIdx])
                seqIdx++;
            arrIdx += 1;
        }
        return seqIdx == sequence.length;
    }

    // Concept of Subsequence : using for loop
    // O(n) time | o(1) space
    public static boolean validateSubsequenceForLoop(int[] array, int[] sequence) {
        int seqIdx = 0;
        for (int value : array) {
            if (seqIdx == sequence.length)
                break;
            if (value == sequence[seqIdx])
                seqIdx += 1;
        }
        return seqIdx == sequence.length;
    }

    public static void main(String[] args) {
        boolean result = ValidateSubsequence.validateSubsequence(new int[] { 5, 1, 22, 25, 6, -1, 8, 10 },
                new int[] { 1, 6, -1, 10 });
        boolean result1 = ValidateSubsequence.validateSubsequenceForLoop(new int[] { 5, 1, 22, 25, 6, -1, 8, 10 },
                new int[] { 1, 6, -1, 10 });
        System.out.println("Valid subsequence: " + Boolean.valueOf(result1).toString());
    }
}
