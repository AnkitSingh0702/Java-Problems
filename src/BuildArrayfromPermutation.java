import java.util.Arrays;

//Build Array from Permutation
// ans[i] = nums[nums[i]]
public class BuildArrayfromPermutation {
    static int[] arrayfrompermuation(int arr[]){
    int s = arr.length;
    int []a = new int[s];
     for (int i = 0; i < s; i++) {
     int main = s*(arr[arr[i]]%s)+arr[i];
     a[i] = main;
     }
     for (int i = 0; i < s; i++) {
       int temp = a[i];
       a[i] = temp/s;
     }
    return a;
     
    }
    public static void main(String [] args) {
        int arr[] = {5,0,1,2,3,4};
        System.out.print(Arrays.toString(arrayfrompermuation(arr)));
     }
}
