package squarRoot;

import java.util.Arrays;

public class Solution {
    public int mySqrt(int x) {

//        int i = 1;
//        int count = 0;
//        int num = x;
//
//        while ( num > 0){
//            num = num - i;
//            count++;
//            i += 2;
//
//            if (num < count && (long) count * count > x){
//                System.out.println ("this happen");
//                count--;
//            }
//        }
//
//        return count;

        System.out.println ("original : "+ x );
        String num = String.valueOf (x);

        String []arr = num.split ("(?<=\\G.{2})");
        int count = 0;

        StringBuilder sb = new StringBuilder ();

        for (int j = 0; j < arr.length; j++) {
            int num1 = Integer.valueOf (arr[j].trim ());
            System.out.println ("num1 "+num1);
            int temp = 0;
            int i = 1;
            int og = num1;

            while ( num1 > -1){
                num1 = num1 - i;
                temp++;
                i += 2;
                System.out.println ("num1 (2) : "+num1);
                System.out.println ("temp (2) : "+(temp * temp));

                if (temp * temp > og){
                    System.out.println ("this happen ");
                    temp--;
                }
            }
            sb.insert (0,temp);
            System.out.println ("temp "+temp);
            System.out.println ("sb "+sb);
            count = count + temp;
            System.out.println (num1);
            System.out.println (Arrays.toString (arr));

    }
        return count;
    }

}
