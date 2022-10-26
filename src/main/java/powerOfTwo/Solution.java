package powerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {

        double div = n;

        while (div >= 1){
            if (div == 1){
                return true;
            }

            div = div/2;
            System.out.println ("answer : "+div);
        }


        return false;
    }
}
