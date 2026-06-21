public class BS {
    static void search(int arr[],int target , int start,int end){

 if(start > end){
   return;
 }
 int mid = start + (end-start)/2;

 if(target == arr[mid]){
    System.out.println(mid);
 }
 if(target < arr[mid]){
     search(arr, target, start, mid-1);
 }
 else{
    search(arr, target, mid+1, end);
 }
    }
    public static void main(String[] args) {
   int arr[] = {4,0,3,2,6,8,1,9};
   int target = 2;
   int start = 0;
   int end = arr.length-1;
   search(arr, target, start, end);
   
    }

}