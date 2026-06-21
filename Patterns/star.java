public class star {
    public static  void leftStar(int n){
     for (int i = 0; i < n; i++) {
       
         for (int j = 0; j <= i; j++) {
             System.out.print("*"+" ");
             
         }
         
               System.out.println("");
           
        
     }
       }
      
       public static  void rightStar(int n){

     for (int i = 0; i < n; i++) {

      //space
        for (int k = 0; k < n-i-1; k++) {
            System.out.print("  ");
        }
       
       //star
         for (int j = 0; j <=i; j++) {
             System.out.print("*"+" ");
             
         }
         
               System.out.println("");
           
        
     }
       }
         public static  void triangle(int n){
     for (int i = 0; i < 5; i++) {


        for (int k = 0; k < 5-i; k++) {
            System.out.print(" ");
        }
       
         for (int j = 0; j <= i; j++) {
             System.out.print("*"+" ");
             
         }
         
               System.out.println("");
           
        
     }
       }
          public static  void leftNum(int n){
     for (int i = 0; i < n; i++) {
       
         for (int j = 0; j <= i; j++) {
             System.out.print(j+1+" ");
             
         }
         
               System.out.println("");
           
        
     }
       }
          public static  void leftNum1(int n){
            
     for (int i = 0; i < n; i++) {
       
         for (int j = 0; j <= i; j++) {
             System.out.print(i+1+" ");
             
         }
         
               System.out.println("");
           
        
     }
       }
          public static  void leftNum1U(int n){
            
     for (int i = 0; i < n; i++) {
     
         for (int j = 0; j <= i; j++) {
             System.out.print(i+1-j+" ");
              
             
         }
         
               System.out.println("");
           
        
     }
       }
         public static  void rightNum(int n){

     for (int i = 0; i < n; i++) {

      //space
        for (int k = 0; k < n-i-1; k++) {
            System.out.print("  ");
        }
       
       //star
         for (int j = 0; j <=i; j++) {
             System.out.print(j+1+" ");
             
         }
         
               System.out.println("");
           
        
     }
       }
    public static void main(String[] args) {

   leftStar(5);
   rightStar(5);
   triangle(5);
   leftNum(5);
   rightNum(5);
   leftNum1(5);
   leftNum1U(5);
      
    }
}