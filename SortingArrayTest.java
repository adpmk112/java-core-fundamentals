public class SortingArrayTest {
    public static void main(String[] args) {
        int[] randomNumArr = {34, 7, 23, 89, 12, 45, 67, 90, 56, 78};

        // Note: The second parameter (toIndex) in the Arrays.sort method specifies the end index (exclusive). 
        // For example, using 10 as the second parameter sorts elements from index 4 up to, but not including, index 10.
        java.util.Arrays.sort(randomNumArr, 4, 10);

        Helper.declareTitle("Testing java.util.Arrays.sort");
        Helper.showResult(randomNumArr);

    }
}
