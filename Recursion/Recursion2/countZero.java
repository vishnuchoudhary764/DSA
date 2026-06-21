public class countZero {
  static int countZero(int n,int count){

  if(n==0){
    return count;
  }
   int digit = n%10;
   if(digit == 0){
    return countZero(n/10, count+1);
   }
   else{
   return countZero(n/10, count);
   }
   
  }
    public static void main(String[] args) {
  int n= 30200;
  int count = 0;
  System.out.println(countZero(n, count));
    }
}