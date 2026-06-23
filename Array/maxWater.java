
import static java.lang.Math.max;
import static java.lang.Math.min;

public class maxWater {

    static int CalculateArea(int arr[]) {
        int left = 0, right = arr.length-1, maxWater = 0;
        while (left < right) {
            int width = right - left;
            int height = min(arr[left], arr[right]);
            int currentArea = width * height;

            maxWater =  max(currentArea, maxWater);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
 int arr[] = {1,8,6,2,5,4,8,3,7};
 int ans = CalculateArea(arr);
 System.out.println("maximum water contain : " + ans );
    }
}
