public class  maxVal {


    static int max(int arr[]){
   int maxVal = arr[1];
      for (int i = 1; i < arr.length; i++) {
          if(arr[i] > maxVal){
            maxVal = arr[i];
          }
      }
      return maxVal;
    }
    public static void main(String[] args) {
        int arr[] = {8,5,11,3,67,2,78};
       
      System.out.println(max(arr));
    }
}