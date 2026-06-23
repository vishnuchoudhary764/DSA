public class buyAndSell {
    static int bestTimeToBuyAndSell(int arr[]){
 int minPrice = arr[0];
 int maxProfit = 0;
 for(int price : arr){
  minPrice = Math.min(price,minPrice);
  int profit = price - minPrice ;
   maxProfit = Math.max(profit,maxProfit);
 }


        return maxProfit;
    }
    public static void main(String[] args) {
   int arr[] = {7,1,5,3,6,4};
   int ans = bestTimeToBuyAndSell(arr);
   System.out.println(ans);
    }
}