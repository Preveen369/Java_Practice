import java.util.Arrays;

public class ReverseArray {
    public void reverseArray(int arr[]) {
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    public static void main(String[] args) {
        ReverseArray rv = new ReverseArray();
        int arr[] = {1,2,3,4,5,6};
        rv.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
