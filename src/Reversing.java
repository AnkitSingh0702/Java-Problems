public class Reversing {
    static int reverse(int num){
        int rev_num = 0;
        while(num != 0)
        {
           int y = rev_num * 10 + num % 10;
            if(( y - num%10)/10 !=  rev_num){
                return 0;
            }
            else{
                 rev_num = y;
            }
            num = num / 10;
        }
       
        return rev_num;
    
    }
    public static void main(String [] args) {
        int num = -1234;
        System.out.println(reverse(num)); 
    }
}
