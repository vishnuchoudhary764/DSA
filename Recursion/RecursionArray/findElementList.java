import java.util.ArrayList;

public class findElementList {
     static ArrayList<Integer> findEle(int arr[],int idx,int target, ArrayList<Integer> list){
    if(idx == arr.length-1){
    return list;
    }
     if(arr[idx] == target){
      list.add(idx);
     
     }
     return findEle(arr, idx+1, target, list);
    }
    public static void main(String[] args) {
  int arr[] = {1,2,3,4,4,8};
  int target = 4;
 ArrayList<Integer> list = new ArrayList<>();
  findEle(arr,0,target,list);
    System.out.print(list);

    }
}