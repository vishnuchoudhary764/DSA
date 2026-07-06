public class lowerBound {
     public static int lowerBound(int[] nums, int x) {
       int ans = 0;
       int s = 0;
       int e = nums.length-1;
       while(s<=e){
        int mid = s + (e-s)/2;
        if(nums[mid] >= x ){
            ans = mid;
            e = mid-1;

        }
        else{
            s = mid+1;
        }
       }
       return ans;
     }
    public static void main(String[] args) {
  int arr[] = {10,20,30,30,30,30,40};
  int x = 30;
  System.out.println(lowerBound(arr, x));
    }
}