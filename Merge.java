import java.util.*;
public class MergeInterval {
    public static void main(String[] args){
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = merge(intervals);
        System.out.println(result);
    }
}
