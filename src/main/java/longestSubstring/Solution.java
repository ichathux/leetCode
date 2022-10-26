package longestSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        Map<Character, Integer> visitedChar = new HashMap<> ();

        int maxLength = 0;
        for (int right = 0, left = 0; right < s.length (); right++ ){
            char current = s.charAt (right);

            if (visitedChar.containsKey (current) && visitedChar.get (current) >= left){
                left = visitedChar.get (current) + 1;

            }
            maxLength = Math.max (maxLength, right-left+1);
            visitedChar.put (current, right);
        }
        return maxLength;
    }
}
