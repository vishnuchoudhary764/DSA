
import java.util.*;
public class multidArrayList {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();
        //initially lists are empty so we add acc. to our need.

        //Initialization
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
        //add elements

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(sc.nextInt());

            }

        }

        System.out.println(arr);

    }
}
