import java.util.*;

public class linearSearch2D {
static int[] search(int arr[][],int target){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] == target ){
                return new int[]{i,j};
            }
            
        }
    }
    return new int[]{-1,-1};
}

    public static void main(String[] args) {
  int arr[][] = {
    {3,5,1,90},
    {77,2,60},
    {12,64,55,15},
    {18,7,4,12}
  };
  int target = 64;
  int ans[] = search(arr, target);
  System.out.println(Arrays.toString(ans));

    }
}