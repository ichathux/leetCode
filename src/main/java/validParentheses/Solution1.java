package validParentheses;

import java.util.HashMap;

public class Solution1 {
    HashMap<Character, Character> map = new HashMap<> ();
    public boolean isValid(String s) {

        System.out.println ("Original String : "+s);
        map.put ('}','{');
        map.put (']','[');
        map.put (')','(');
        if (s.length () % 2 == 1){
            return false;
        }
        return checkString (new StringBuilder (s),map);
    }
    public boolean checkString(StringBuilder s, HashMap<Character, Character> map){

        int tempIndexAtOpenPara = -1;
        if (map.keySet ().contains (s.charAt (0))){
            return false;
        }
        System.out.println (s.length ());
        for (int i = 0; i < s.length (); i++){
            if (map.keySet ().contains (s.charAt (i))){
                if (i == 0){
                    return false;
                }
                if (map.get (s.charAt (i)) != s.charAt (i-1)){
                    return false;
                }else {
                    s.deleteCharAt (i-1).deleteCharAt (i-1);

                    if (s.length () == 0){
                        return true;
                    }else {
                        return checkString (s , map);
                    }
                }

            }
        }
        if (tempIndexAtOpenPara == -1){
            return false;
        }

        return true;
    }
}
