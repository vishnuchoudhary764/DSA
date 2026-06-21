public class selection{
    public static void main(String[] args) {
         int arr[] = {7,3,9,12,11};
         for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                 min = j;
                } 
                
            }
                int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
         }
           for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}