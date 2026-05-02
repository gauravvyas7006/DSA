import java.util.*;
public class ProductOfArray{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        int pointer = arr[0];
        List<Integer> list= new ArrayList<>(); 
        for(int i = 0; i < arr.length;i++){
            int current = arr[0];
            int temp = 0;
              for(int j = 0; j < arr.length; j++){
                 if(arr[j] != arr[i]){
                    if(temp == 0){
                        temp = arr[j];
                    }
                    else{
                        temp = temp * arr[j];
                    }
                 }
            
              }
              list.add(temp);
        }
        System.out.println(list);
    }
}