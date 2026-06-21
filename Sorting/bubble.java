public class bubble{
    public static void main(String[] args) {
        int arr[] = {7,3,9,12,11};
        for(int i = 0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                 if(arr[i]>arr[i+1]){
                int temp =  arr[i] ;
                arr[i] = arr[i+1];
                 arr[i+1] = temp;
            }
            }
           
        }
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] +" ");
        }
    }
}