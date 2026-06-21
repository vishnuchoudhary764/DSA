

public class  factorial {
    public static int  printfact(int n){
        if(n == 0){
            return 1;
        }
    // int fact_nm1 = printfact(n-1);
    // int fact_n = n*fact_nm1;
    // return fact_n;
    return n*printfact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
       int ans = printfact(n);
        System.out.print("factorial of "+ n + " is : "+ ans);

    }
}