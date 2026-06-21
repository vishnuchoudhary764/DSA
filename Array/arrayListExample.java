
import java.util.ArrayList;

public class arrayListExample{


    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

         for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i));
         }
   System.out.println(list.get(7));
  list.set(2, 15);
   list.remove(9);
   System.out.println( list.contains(6));

    
         for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i));
         }
       
    }
}