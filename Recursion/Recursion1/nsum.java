public class  nsum {
    public static void printSum(int n , int sum){
        if(n==0){
            System.out.println(sum);
          return;
        }
        else{
            sum = sum +n;
            printSum(n-1, sum);
      }
    }
    public static void main(String[] args) {
       printSum(2,0);
    }
}