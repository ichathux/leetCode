package dividTwoInt;

public class Solution {


    public int divide(int dividend, int divisor) {

        System.out.println ("Dividend :"+dividend);
        System.out.println ("Divisor :"+divisor);

        int count = 0;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs (dividend);
        divisor = Math.abs (divisor);


        if (dividend == divisor){
            return 1*sign;
        }
        if (divisor == 1){
            if (dividend < 0){
                if (sign == 1){
                    return Math.abs (dividend+1)*sign;
                }
                return dividend;
            }
            return dividend;
        }

        do{
            if (dividend > 0 && dividend < divisor){
                return 0;
            }
            if (divisor < 0 ){
                divisor = Math.abs (divisor+1);
            }
            dividend -= divisor;
            ++count;
        }while (divisor <= dividend);

        System.out.println ("Answer = "+count);
        System.out.println ("d = "+dividend);
        System.out.println ("c = "+divisor);

        return count*sign;
    }
}
