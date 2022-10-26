package pascalTriangle2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> generate(int rowIndex) {

        ArrayList<Integer> list = new ArrayList<> (rowIndex);
        list.add (1);
        int start = 1;
        int end = rowIndex-1;
        while (end >= 0){
            long n1;
            long n2;
            long ans;
            if (end >= start){
                System.out.println ("start - "+start);
                n1 = getFactorial (rowIndex-start+1,rowIndex);
                n2 = getFactorial (1,start);
                System.out.println ("n1 - "+n1);
                System.out.println ("n2 - "+n2);
                ans =  (n1/n2);
                System.out.println ("ans - "+ans);
                list.add (start,(int)ans);
            }else {
                list.add (start, list.get (end));
            }

            end--;
            start++;
        }
        System.out.println (list);
        return list;
    }

    private long getFactorial(int start, int end){
        long sum = 1;
        for (long i = start;  i <= end  ; i++) {
            sum = sum * i;
            System.out.println ("i "+i+ " * sum -> "+sum);
        }
        System.out.println ();
        return sum;
    }
}
