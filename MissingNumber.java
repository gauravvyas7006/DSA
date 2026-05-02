public class MissingNumber {
    public static void main(String[] args){
        int[] num = {3,0,1};
        int n = num.length;
        int expected = n * (n+1) / 2;
        int actual = 0;
        for(int i = 0; i < num.length; i++){
            actual += num[i];
        }

        int result = expected - actual;
        System.out.print(result);
    }
}