package Fib;

import java.util.HashMap;

public class Solution2 {
    HashMap<Integer, Integer> memo = new HashMap<> ();
    public int fib(int n){
        if (memo.isEmpty ()){
            memo.put (0,0);
            memo.put (1, 1);
            memo.put (2, 1);
        }
        for (int i = 3; i <= n ; i++ ){
            memo.put (i, memo.get (i-1)+memo.get (i-2));
        }
        return memo.get (n);
    }
}
