public class findPivot {
    static int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = nums[0];
        for(int i = 1 ;i<n;i++){
            leftSum[i] = leftSum[i-1] + nums[i];

        }
             rightSum[n-1] = nums[n-1];
        for(int i = n-2; i>=0;i--){
            rightSum[i] = rightSum[i+1] + nums[i];

        }
        for(int i = 0;i<n;i++){
            if(rightSum[i] == leftSum[i] ){
                return i;
            }
        }
        
   return -1;


    }
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivot = pivotIndex(nums);
        if (pivot != -1) {
            System.out.println("Pivot index: " + pivot);
        } else {
            System.out.println("No pivot index found.");
        }
    }
}