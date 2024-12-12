import java.util.Arrays;
import java.util.stream.Stream;

public class MergeWithoutExtraSpace {
    // Function to merge the arrays
    public static void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = n - 1, j = 0;

        // Rearrange the arrays to sort them later
        while (i >= 0 && j < m) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i--] = b[j];
                b[j++] = temp;
            } else {
                break; // If elements are already in order, stop swapping
            }
        }

        // Sort both arrays individually
        Arrays.sort(a);
        Arrays.sort(b);

        // Merge the two arrays using Stream and print the result
        int[] mergedArray = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed())
                                  .mapToInt(Integer::intValue)
                                  .toArray();

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};
        mergeArrays(a, b);
    }
}
