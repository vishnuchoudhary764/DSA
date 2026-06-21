
 //Worst : O(N) , where N = Size of array

public class linearSearch {

     static int linearSearch(int arr[], int target){

             if(arr.length == 0){
                return -1;
             }

            for(int i = 0; i< arr.length;i++){
             int element = arr[i];
             if(element == target){
                return i;
             }
            }
               
        return -1;
     }


    public static void main(String[] args) {
        int arr[] = {18, 12, 9, 14, 77, 50};

        //find 14 ?
        int target = 77;
        int ans = linearSearch(arr, target);
          System.out.println(ans);
    }
}
   
    

