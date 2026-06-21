import java.util.Scanner;
public class swap{
public static void main(String[] args) {
    swap();
}
static void swap(){
    Scanner sc = new Scanner(System.in);
    System.err.print("enter the first number:");
    int a = sc.nextInt();
    System.err.print("enter the second number:");
    int b = sc.nextInt();
     int temp = a;
     a = b;
     b = temp;
     System.err.println("first number is: "+a);
     System.err.println("second number is: "+b);
    
}
}