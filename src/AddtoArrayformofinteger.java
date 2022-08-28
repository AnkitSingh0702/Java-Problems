import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
           int n = num.length-1;
        List<Integer> ans = new ArrayList<Integer>();
        
        while(n>=0 || k>0) {
            if(n>=0){
                k+=num[n];
            }
            ans.add(0,k%10);
            k/=10;
            n--;
        }
        return ans;
    }
}