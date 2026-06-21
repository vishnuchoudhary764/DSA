import java.util.Arrays;
import java.util.Scanner;
public class basic {

    public static void main(String[] args) {
//syntax
//data_type[] name = new data_type[size];

       // int[] rolls = new int[4];
        //or
       // int names[] = new int[4];
        //or
       // int subs[] = {1,2,3,4,5};

       // int subs[]; //declaration of array,subs is getting defined in stack
       // subs = new int[5]; // iniatialization : actually memmory allocation (heap memory)

       

        // for (int i = 0; i < subs.length; i++) {
        //     System.out.print(subs[i] + " ");
           
        // }
        //  System.out.println(" ");

        //  String add[] = new String[5];
        // for(int i = 0; i < add.length; i++) {
        //      System.out.print(add[i] + " ");
        // }
         String str[] = new String[4];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0;i<str.length;i++){
                
                str[i] = sc.next();
            }   }
    
    System.out.println(Arrays.toString(str));  

     str[1] = "vishnu";

    System.out.println(Arrays.toString(str));  

        }

   
}
