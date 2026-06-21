
import java.util.HashMap;

public class minMaxFreqElement {
    static int[] getMaxMinFreqElement(int arr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();

        //insert data
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        //hashmap is ready

        //for highest freq
        int highFreq = Integer.MIN_VALUE;
        int highNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq>highFreq){
                highFreq = currentFreq;
                highNum = currentKey;
            }

        }
      

        //for lowest freq
          int lowFreq = Integer.MAX_VALUE;
        int lowNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowFreq){
                lowFreq = currentFreq;
                lowNum = currentKey;
            }

        }
        int ans[] = {highNum,lowNum};
        return ans;

    }
    public static void main(String[] args) {
  int arr[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
  int ans[] = getMaxMinFreqElement(arr);
  for(int i : ans){
    System.out.println(i);
  }
    }
}