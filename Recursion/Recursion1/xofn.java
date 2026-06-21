//stack height = n;
//public class  xofn{
//     public static int printXn(int x , int n){
//         if( n == 0){
//             return 1;
//         }
//          if(x == 0){
//             return 0;
//         }
//      int ans = x*printXn(x, n-1);
//      return ans;
//     }
//     public static void main(String[] args) {
//         int fans = printXn(19,2);
//         System.out.println(fans);
//     }
// }

//stack height = logn
public class  xofn{
    public static int printXn(int x , int n){
        if( n == 0){
            return 1;
        }
         if(x == 0){
            return 0;
        }
        // n = even
        if(n%2 == 0){
           return   printXn(x, n/2)*printXn(x, n/2);
        }
        //n = odd
        else{
        return   printXn(x, n/2)*printXn(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int ans = printXn(2,5);
        System.out.println(ans);
    }
}