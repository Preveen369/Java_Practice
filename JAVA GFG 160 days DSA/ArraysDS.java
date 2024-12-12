import java.util.ArrayList;

@SuppressWarnings("unused")
public class ArraysDS {

    // BASIC OPERATIONS ON ARRAYS:

    // 1] TRAVERSAL IN ARRAY:

    // 2] INSERTION IN ARRAY:
    static int[] insertElement(int[] arr, int n, int x, int pos) {
        // Create a new array with extra space
        int[] newArr = new int[n + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i]; // Swap left
        }
        return newArr;
    }

    // 2] SEARCHING IN ARRAY:
    static int findElement(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // 3] DELETION IN ARRAY:
    static int[] deleteElement(int[] arr, int n, int key) {
        int pos = findElement(arr, n, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return arr;
        }

        int[] newArr = new int[n - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos; i < n - 1; i++) {
            newArr[i] = arr[i + 1]; // Swap left
        }
        System.out.print("After deletion of 7: ");
        return newArr;
    }

    public static void main(String[] args) {
        // DECLARATION AND INITIALIZATION OF ARRAY:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;

        // Traversal:
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Insertion:
        array = insertElement(array, n, 23, 3);
        n = array.length;
        System.out.print("After insertion of 23 at index 3: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Searching:
        int elemPos = findElement(array, n, 5);
        if (elemPos != -1) {
            System.out.println("The index of value 5 is: " + elemPos);
        } else {
            System.out.println("Value 5 not found");
        }

        // Deletion:
        array = deleteElement(array, n, 13);
        n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
