import java.util.*;
public class MergeInterval {
    public static void main(String[] args){
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = merge(intervals);
         for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        
    }

    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            if(merged.size() == 0){
                merged.add(intervals[i]);
            }
            else{
                int[] last = merged.get(merged.size() - 1);
                if(last[1] < intervals[i][0]){
                    merged.add(intervals[i]);
                }
                else{
                    last[1] = Math.max(last[1], intervals[i][1]);
                }
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
