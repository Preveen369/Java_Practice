public class MoveZeroesToEnd {
    static int[] pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j=0;
        for (int i=0; i<n; i++){
            if (arr[i] != 0){
                temp[j++] = arr[i];
            }
        }
        for (int i=0; i<n; i++){
            arr[i] = temp[i];
        }
        return arr;

        // int n = arr.length;
        // int count = 0;
        // for (int i=0; i<n; i++){
        //     if (arr[i] != 0){
        //         arr[count] = arr[i];
        //         count++;
        //     }
        // }
        // for (int i=count; i<n; i++){
        //     arr[i] = 0;
        // }
        // return arr;

        // int n = arr.length;
        // int count = 0;
        // for (int i=0; i<n; i++){
        //     if (arr[i] != 0){
        //         int temp = arr[i];
        //         arr[i] = arr[count];
        //         arr[count] = temp;
        //         count++;
        //     }
        // }
        // return arr;
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 5, 0, 0};
        arr = pushZerosToEnd(arr);
        for (int value : arr){
            System.out.print(value + " ");
        }
    }
}
