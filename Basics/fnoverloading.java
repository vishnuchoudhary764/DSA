 public class fnoverloading{
    public static void main(String[] args) {
        fun(5);
        fun("vishnu");
        sum(2, 2);
        sum(4, 4,8);
       // demo(2,3,4);
        

    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);


    }
    static void sum(int a,int b){
       int sum = a+b;
       System.out.println(sum);
    }
       static void sum(int a,int b,int c){
        int sum = a+b+c;
         System.out.println(sum);
    }
   // static void demo(int ...v){
    //    System.out.println(Arrays.toString(v));
   // }
}
