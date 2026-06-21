public class checkArrSorted {
    static void checkArr(int arr[],int idx){
        if(idx == arr.length-1){
            System.out.println("array is sorted"); 
          
        }
        else if(arr[idx] < arr[idx+1] || arr[idx] == arr[idx+1]){
            checkArr(arr, idx+1);
        }
        else{
            System.out.println("unsorted");
        }
    }
    public static void main(String[] args) {
   int arr[] = {1,2,4,8,9,12};
   checkArr(arr, 0);
    }
}