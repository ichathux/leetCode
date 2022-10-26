package timeToRearrangeBinaray;

import java.util.Arrays;

public class Solution {
    public int secondsToRemoveOccurrences(String s) {

        int count = 0;

        StringBuilder sb = new StringBuilder (s);

        while (s.contains ("01")){
            count++;
            System.out.println ("contain");
            s = s.replaceAll ("01","10");
            System.out.println ("replaced "+s);
            System.out.println ("count "+count);
        }

        return count;
    }


}
