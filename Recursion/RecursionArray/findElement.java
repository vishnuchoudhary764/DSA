public class findElement {
    static void findEle(int arr[],int target,int idx){
if(idx == arr.length){
    System.out.println("Element not found");
    return;
}
if(arr[idx] == target){
System.out.println("Target element at : "+idx);
}
else{
    findEle(arr, target, idx+1);
}
    }
    public static void main(String[] args) {
  int arr[] = {3,2,1,18,9};
  findEle(arr,9,0);
    }
}