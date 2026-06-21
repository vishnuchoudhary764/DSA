public class insertion{
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 5};
        //we assume that first element is sorted and other is unsorted part
        //that's why we start loop from i=1
      for (int i = 1; i < arr.length; i++) {
        int current = arr[i];
         int j=i-1;
         while(j >= 0 && current < arr[j]){
      arr[j+1] = arr[j];
      j--;
         }
    arr[j+1] = current;
      }  
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
      }
    }
}