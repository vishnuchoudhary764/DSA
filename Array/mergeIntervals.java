import java.util.*;
public class mergeIntervals {
     static int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
              int[] last = result.get(result.size() - 1);
            int[] curr = intervals[i];

            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                result.add(curr);
            }
            
        }
          return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
  int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
   int[][] ans = merge(intervals);
     for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }
    }

}