//shift elements of an array by a specified position to the right. The last element of the array should be moved to the first position.
public class shiftByPos {

    static void shiftElements(int[] arr) {
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
      
    }

   
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to shift
        for (int i = 0; i < k; i++) {
            shiftElements(arr);
        }
           for(int a : arr){
        System.out.println(a);
    }
    }
}
