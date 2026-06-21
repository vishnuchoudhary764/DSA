
import java.util.Scanner;

class func{

    public static void main(String[] args) {
        
        greeting();
         Print();
          Sum();
       
       
    }

    static void Sum() {
        Scanner sc = new Scanner(System.in);
        System.err.print("enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("enter the second number : ");
        int num2 = sc.nextInt();
        int Sum = num1 + num2;
        System.err.println("Sum is : " + Sum);

    }

    static void Print() {
        System.out.println("HELLO JAVA BY KK");
    }

    static int /* to use string return type we need to make class name with string*/ greeting() {
        System.err.println("I AM JAVA DEVELOPER");
        return 0;

    }
  

}

