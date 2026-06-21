
import java.util.HashMap;

public class modeOfArray {
    static int getMode(int arr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int a :arr){
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }
        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()){
            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                maxFreqKey = key;
            }
        }
        return maxFreqKey;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        System.out.println("Mode: " + getMode(arr));
    }
}