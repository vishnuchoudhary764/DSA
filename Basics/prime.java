import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int mul = 0;
        for (int i = 2 ;i <= n-1; i++) {
       if(n%i == 0){
       mul = mul + 1;
       }
           else{
             mul = mul + 0;
           
        
           } 
        
        }
        if(mul>1){
            System.out.println("composite");
        }
        else{
            System.out.println("prime");
        }
        
    }
}