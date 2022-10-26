package happyNumber;

import java.util.ArrayList;

public class Solution {
    public boolean isHappy(int n){
        ArrayList<Integer> visited = new ArrayList<> ();
        
        while (( n != 1) && !visited.contains (n)){
            visited.add (n);
            n = getSum (n);
        }
        return n == 1;
    }
    private int getSum(int n){
        int sum = 0;
        while (n > 0){
            int num = n %10;
            n = n /10;
            sum =  sum + (int) Math.pow (num, 2);
            System.out.println (sum);
        }
        return sum;
    }
}
