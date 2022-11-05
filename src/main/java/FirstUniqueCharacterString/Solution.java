package FirstUniqueCharacterString;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q = new LinkedList<> ();
        int length = s.length ();
        int start = 0;
        StringBuilder sb = new StringBuilder (s);

        while (start <= length){
            if (!q.contains (sb.charAt (start)) && sb.indexOf (sb.charAt (start)+"",start+1) == -1){
                return start;
            }else {
                q.add (sb.charAt (start));
            }


            start++;
            length--;
        }
        return -1;
    }
}
