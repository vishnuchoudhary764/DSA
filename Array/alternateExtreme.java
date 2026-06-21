public class alternateExtreme {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int ans[]=new int[arr.length];
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                ans[i]=arr[start];
                start++;
            }
            else{
                ans[i]=arr[end];
                end--;
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}