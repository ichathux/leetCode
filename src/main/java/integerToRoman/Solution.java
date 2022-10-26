package integerToRoman;

import java.util.Arrays;

public class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder ();
        if (num > 1000){
            System.out.println ("grear than 1000");
            int i = num / 1000;
            System.out.println (i);
            for (int j = 0; j < i; j++){
                sb.append ("M");
            }
            if (num % 1000 > 0){
                int i1 = num % 1000;

            }
        }

        return sb.toString ();
    }
}
