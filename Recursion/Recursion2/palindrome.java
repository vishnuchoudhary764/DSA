
import java.util.Scanner;

public class palindrome {

     static int sum = 0;
     static void reverse(int n){
    if(n == 0){
        return;
    }
    int rem = n%10;
    sum = sum*10 + rem;
    reverse(n/10);
 }
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number :");
   int n = sc.nextInt();
    reverse(n);
   if(sum == n){
    System.err.println("This number is palindrome number !");
   }
   else{
     System.err.println("This number is not a palindrome number !");
   }
    }


}