package Fib;

import java.util.*;

public class Solution {

    HashMap<Integer, Integer> memo = new HashMap<> ();
    public int fib(int n){
        int result;
        if (memo.isEmpty ()){
            memo.put (0,1);
            memo.put (1,1);
        }
        if (n == 0 ){
            return 0;
        }else if(n  <= 2){
            return 1;
        }
        if (null != memo.get (n)){
            return memo.get (n-1);
        } else {
            result = fib (n-1)+fib (n-2);
            memo.put (n-1,result);
        }

        System.out.println (memo);
        return result;
    }
}
