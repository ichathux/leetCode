package MultiplyString;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String multiply(String num1, String num2) {


//        System.out.println ("Num 1 : "+num1);
//        System.out.println ("Num 2 : "+num2);
//
//        String longNum;
//        String shortNum;
//
//        if (num1.length () != num2.length ()){
//             longNum = num1.length () <= num2.length () ? num2  : num1;
//             shortNum = num1.length () < num2.length () ? num1  : num2;
//        }else {
//            longNum = num1;
//            shortNum = num2;
//        }
//        double []sum = new double[shortNum.length ()];
//        for (int i = shortNum.length ()-1 ; i >= 0 ; i--){
//            System.out.println ("shortNumLength : "+shortNum.length ());
//            int num = (shortNum.charAt (i)-48);
//            int tempNum = 0;
//            int tempRem = 0;
//            double sum1 = 0;
//            for(int j = longNum.length ()-1 ; j >= 0 ; j--){
//                System.out.println ("longNum length : "+longNum.length ());
//                System.out.println (num+"*"+(longNum.charAt (j)-48));
//
//                int sum2 = (num*(longNum.charAt (j)-48))+tempRem;
//                System.out.println ("sum : "+sum2);
//                if (longNum.length () != 1) {
//
//                    if (sum2 > 10) {
//                        tempNum = sum2 % 10;
//                        tempRem = sum2 / 10;
//                    } else {
//                        tempNum = sum2;
//                        tempRem = 0;
//                    }
//                    System.out.println ("tempNum : "+tempNum);
//                    sum1 = sum1+(Math.pow (10,longNum.length ()-1-j)*tempNum);
//                }else {
//                    sum1 = sum2;
//                }
//                System.out.println ("int : "+tempNum);
//                System.out.println ("rem : "+tempRem);
//
//            }
//            System.out.println ("sum1 : "+sum1);
//
//            sum[i] = sum1;
//        }
//        System.out.println (Arrays.toString (sum));
//        double total = 0;
//
//        for (int i = 0, j = sum.length-1; i < sum.length ; i++, j--){
//
//            total = sum[i]*Math.pow (10,j)+total;
//            System.out.println ("subTotal : "+total);
//        }
//
//        System.out.println ("Total : "+total);
//        return String.valueOf (Math.round (total));


        String shortNum = num1.length () > num2.length () ? num2 : num1;
        String longNum = num2.length () > num1.length () ? num2 : num1;

        if (num1.length () == num2.length ()){
            longNum = num1;
            shortNum = num2;
        }

        System.out.println ("long num : " + longNum);
        System.out.println ("short num : " + shortNum);

        long total = 0;
        for (int s = shortNum.length () - 1; s >= 0; s--) {
            long intFromShortNum = shortNum.charAt (s) - 48;
            long rem = 0;
            long tempSum = 0;
            for (int l = longNum.length () - 1; l >= 0; l--) {
                long intFromLongNum = longNum.charAt (l) - 48;
                long unitTotal = (intFromShortNum * intFromLongNum)+rem;
//                System.out.println (intFromShortNum + "x" + intFromLongNum+"+"+rem+"="+unitTotal);
                if (unitTotal > 9){
                    rem = unitTotal/10;
                    unitTotal= unitTotal%10;
                }else {
                    rem = 0;
                }
                if (l==0 && rem != 0){
                    tempSum = tempSum+rem*((long)Math.pow (10,longNum.length ())-l);
                }
                tempSum = (long) (unitTotal * Math.pow (10,Math.abs ((longNum.length ()-1)-l))+tempSum);
//                System.out.println (tempSum);
//                System.out.println ("rem :"+rem);
//                System.out.println ("total :"+unitTotal);
            }
            System.out.println (tempSum);
//            System.out.println (tempSum*((int)Math.pow (10,(shortNum.length ()-1)-s)));
//            subTotalList[s] = tempSum*((long)Math.pow (10,(shortNum.length ()-1)-s));
            total = total+tempSum*((long)Math.pow (10,(shortNum.length ()-1)-s));
        }
        StringBuilder sb = new StringBuilder ();
        sb.append (total);

        return sb.toString ();
        }

}
