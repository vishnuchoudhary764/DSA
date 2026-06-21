
import java.util.Arrays;

public class reverseArray {

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        //M1--- two pointer method
        reverse(arr);
       
        System.out.println(Arrays.toString(arr));


        //M2
        //   int a[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //       a[i] = arr[arr.length-1-i];
        // }
        // System.out.println(Arrays.toString(a));
    }
}
