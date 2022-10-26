package BasicCal;

import java.util.Arrays;

public class Solution {
    public int calculate(String s) {

        String []arr = s.replaceAll ("[\\n\t ]","").split("(?=[-+*/])");
        int subTotal = 0;

        for(int i = 1 ; i < arr.length ; i++){
            StringBuilder s1 = new StringBuilder (arr[i]);
            StringBuilder s2 = new StringBuilder (arr[i-1]);
            if (s1.indexOf ("*") == 0){
                s1.replace (0,1,"");
                arr[i-1] = "0";
                arr[i] = String.valueOf (Integer.valueOf (s1.toString ()) * Integer.valueOf (s2.toString ()));
            }
            if (s1.indexOf ("/") == 0){
                s1.replace (0,1,"");
                arr[i-1] = "0";
                arr[i] = String.valueOf (Integer.valueOf (s2.toString ()) / Integer.valueOf (s1.toString ()));
            }
        }

        for (int i = 0 ; i < arr.length ; i++){
            subTotal = subTotal + Integer.valueOf (arr[i].replaceAll ("[\\n\t ]",""));
        }
        return subTotal;

    }

}
