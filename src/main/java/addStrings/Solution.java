package addStrings;

import java.util.Arrays;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder ();
        String shortStr;
        String longStr;
        if (num1.length () != num2.length ()){
             shortStr = num1.length () > num2.length () ? num2: num1;
             longStr = num1.length () < num2.length () ? num2: num1;
        }else {
             shortStr = num1;
             longStr = num2;
        }
        int shortIntLength = shortStr.length ()-1;
        int longIntLength = longStr.length ()-1;
        int rem = 0;
        int sum;

        for (int i = longIntLength; i >= 0; i--) {
            int n1 = longStr.charAt (i)-48;
            int n2 = 0;
            if (shortIntLength >= 0){
                n2 = shortStr.charAt (shortIntLength)-48;
                shortIntLength--;
            }
            sum = n1 + n2 + rem;
            rem = 0;
            if (sum > 9){
                sum = sum % 10;
                rem = 1;
            }
            sb.append (sum);
            if (shortIntLength < 0 && i == 0 && rem > 0) {
                sb.append (1);
            }

            System.out.println (n1);
            System.out.println (n2);
        }

        return sb.reverse ().toString ();
    }
}
