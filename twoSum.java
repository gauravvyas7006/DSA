import java.util.HashMap;

public class twoSum {
public static void main(String[] args) {
    int[] arr = {2, 7, 11, 15};
    int target = 9;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int j = 0 ; j < arr.length; j++) {
        int val = target - arr[j];
        if(map.containsKey(val)){
            System.out.println(map.get(val) + " " + j);
        }
        else {
            map.put(arr[j], j);
        }
    }


}
}