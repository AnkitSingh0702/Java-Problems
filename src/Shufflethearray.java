import java.util.Arrays;

public class Shufflethearray {
    static int[] shuffle(int []nums, int n){
        int a[] = new int[2*n];
        int b =0;
        for (int i = 0; i < 2*n; i=i+2) {
            a[i] = nums[b];
            a[i+1] = nums[n+b];
            b++;
        }
        return a;
    }
    public static void main(String[]args) {
        int []nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
