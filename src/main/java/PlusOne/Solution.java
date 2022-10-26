package PlusOne;

import java.math.BigInteger;

public class Solution {

    public int[] plusOne(int[] digits) {

        StringBuilder sb = new StringBuilder ();
        for (int i : digits){
            sb.append (i);
        }
        BigInteger value = new BigInteger (sb.toString ());
        value = value.add (new BigInteger ("1"));
        sb =  new StringBuilder (String.valueOf (value));
        int[] arr = new int[sb.length ()];
        int i =0;
        for (int c : sb.chars ().toArray ()){
            arr[i] = c-48;
            i++;
        }


        return arr;
    }
}
