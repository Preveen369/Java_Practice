// import java.util.Arrays;

public class SecondLargestElement {
    public int getSecondLargest(int[] arr) {
        // Approach: Two Parts
        int n = arr.length;
        int first_max = -1, second_max = -1;
        for (int i = 0; i<n; i++){
            if (arr[i] > first_max){
                first_max = arr[i];
            }
        }
        for (int i = 0; i<n; i++){
            if (arr[i] > second_max && arr[i] != first_max){
                second_max = arr[i];
            }
        }
        return second_max;

        // Approach: Array sort and reverse
        // Arrays.sort(arr);
        // int n = arr.length;
        // for (int i = n-2; i>=0; i--){
        //     if (arr[i] != arr[n-1])
        //         return arr[i];
        // }
        // return -1;
    }

    public static void main(String[] args) {
        SecondLargestElement se = new SecondLargestElement();
        int arr[] = new int[]{12,35,1,10,34,1};
        System.out.println(se.getSecondLargest(arr));
    }
}
