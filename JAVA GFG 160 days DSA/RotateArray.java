import java.util.Arrays;

public class RotateArray {
    void reverseArray(int[] arr, int start, int end){
        // start = 0; end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    public void rotateArray(int arr[], int d) {
        // // Approach -> Reversal Algorithm
        // int n = arr.length; 
        // d = d % n; // for (d steps > n)
        // reverseArray(arr, 0, d-1);
        // reverseArray(arr, d, n-1);
        // reverseArray(arr, 0, n-1);

        // for (int val: arr){
        //     System.out.print(val + " ");
        // }
        
        // Approach -> (n*d) rotation
        // int n = arr.length; 
        // for (int i=0; i<d; i++){
        //     // outer loop: rotation
        //     int temp = arr[0];
        //     for (int j=0; j<n-1; j++){
        //         // inner loop: swapping
        //         arr[j] = arr[j+1];  
        //     }
        //     arr[n-1] = temp;
        // }

        // Approach -> temp[] array creation
        int n = arr.length;  //6
        int[] temp = new int[n];
        d = d % n;  // for d>n
        for (int i=0; i<n-d;i++){
            temp[i] = arr[d + i];
        } 
        for (int i=0; i<d;i++){
            temp[n-d+i] = arr[i];
        } 
        for (int i=0; i<n; i++){
            arr[i] = temp[i];
        }

    }
    public static void main(String[] args) {
        RotateArray ro_arr = new RotateArray();
        int arr[] = {1,2,3,4,5};
        ro_arr.rotateArray(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
   
}
