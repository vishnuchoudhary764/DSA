public class swapAlternate {

static int[] swapAlternate(int arr[]){

    for(int i=0;i<arr.length-1;i+=2){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
    return arr;
}

    public static void main(String[] args) {
  int arr[]={1,2,3,4,5,6};
    int ans[]=swapAlternate(arr);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");   
    }
}
}