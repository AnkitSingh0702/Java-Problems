//Fibonacci numbers
import java.util.*;
public class Fibonacci {
   static int fibo(int n){
        if (n <= 1) {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Fibonacci of number: "+fibo(n)); 
        in.close();
    }
}
