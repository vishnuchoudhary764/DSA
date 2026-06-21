public class digitSum {

    // sum
    static int sumOfDigit(int n){
        if(n == 0){
         return 0;
        }
        return (n%10)+sumOfDigit(n/10);
    }

    // production
      static int prodOfDigit(int n){
        if(n%10 == n){
         return n;
        }
        return (n%10)*prodOfDigit(n/10);
    }

    public static void main(String[] args) {
     int n = 102;

     System.out.println(sumOfDigit(n));
     
     System.out.println(prodOfDigit(n));
    }
}