import java.util.Arrays;
public class passingInFxn{
    public static void main(String[] args) {
        
        int nums[] = {1,21,3,41};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr){
        arr[1] = 99;
    }
}