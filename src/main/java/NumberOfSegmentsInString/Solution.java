package NumberOfSegmentsInString;

import java.util.Arrays;

public class Solution {
    public int countSegments(String s) {
        return Arrays.stream (s.split ("\s")).filter (x -> !x.equals ("")).toList ().size ();

    }
}
