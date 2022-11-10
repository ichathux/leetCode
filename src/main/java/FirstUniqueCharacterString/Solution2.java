package FirstUniqueCharacterString;

import java.util.ArrayList;
import java.util.HashMap;
public class Solution2 {

    public int firstUniqChar(String s) {
//        HashMap<Character, ArrayList<Integer>> map = new HashMap<> ();
//        int result = -1;
//        char[] chars = s.toCharArray ();
//        for (int i = chars.length-1; i >=0; i--){
//            map.computeIfAbsent (chars[i], x -> new ArrayList<Integer> ()).add (i);
//        }
//        for (char c : chars){
//            if (map.get (c).size () == 1){
//                return map.get (c).get (0);
//            }
//        }
//        return result;


        System.out.println ("String : "+s);
        StringBuilder sb = new StringBuilder (s);
        for (int i = 0 ; i < s.length (); i++){
            StringBuilder sub = new StringBuilder (sb.substring (i+1));
            if (-1 == sb.indexOf (s.charAt (i)+"",i+1)){
                return i;
            }else {
            }
        }
        return -1;
    }
}
