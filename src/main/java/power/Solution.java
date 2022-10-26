package power;

public class Solution {
    public double myPow(double x, int n) {
        int signN = n < 0 ? -1 : 1;
        n = Math.abs (n);

        if(1 == Math.abs(x)){
            int signX = x < 0 ? -1 : 1;
            if (signX < 0 && signN > 0){
                return 1*signX;
            }else if (signX < 0 && signN < 0){
                return 1*signX*signN;
            }else if (signX > 0 && signN < 0){
                return 1;
            }else {
                return 1;
            }
        } else if (n == 0){
            return 1;
        } else if (x > 0 && x < 0.001  || n < 0){
            return 0;
        } else {
            double sum = 1;
            for(int i = 1; i <= n ; i++){
                sum = sum * x;
            }
            if(signN < 0){
                sum =  1/sum;
            }
            return sum;
        }
    }
}
