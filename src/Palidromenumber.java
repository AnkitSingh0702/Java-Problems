public class Palidromenumber {
     static boolean palidrome(int n){
      if (n < 0 ) {
        return false;
      }
      int rev =0;
      int  temp = n;
      while( temp != 0){
      int dig = temp %10;
      rev = rev*10+dig;
      temp = temp/10;
  
      }
      if (rev == n) {
        return true;
      }
     
       else {
        return false;
      }

    }
    public static void main(String [] args ) {
        int n = -8668;
        if (palidrome(n)) {
          System.out.println("This is a palidrome number");  
        } else {
            System.out.println("This is not a palidrome number");
        }
       
    }
}
