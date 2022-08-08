public class Maximumsubarray {
    static int maxsubarray(int arr[]){
        int sum = 0;
        int maxsum = -Integer.MAX_VALUE;
        for(int i =0; i< arr.length;i++){
            sum += arr[i];
            if (sum > maxsum) {
                maxsum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
        

    }
    public static void main(String[]args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(maxsubarray(arr));
    }
}
