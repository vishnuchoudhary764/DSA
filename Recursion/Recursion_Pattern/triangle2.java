public class triangle2 {
    static void printTriangle(int r,int c){
  if (r == 4) {
            return;
        }
        if(r<c){
            System.out.print("*");
            printTriangle(r,c+1);

        }
        else{
            System.out.println();
            printTriangle(r+1,0);


        }
        }
    public static void main(String[] args) {
  printTriangle(0, 4);
    }
}