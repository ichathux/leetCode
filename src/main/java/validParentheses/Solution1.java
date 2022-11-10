package validParentheses;

import java.util.HashMap;

public class Solution1 {

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<> ();
        StringBuilder sb = new StringBuilder (s);
        System.out.println ("Original String : "+s);
        map.put ('{','}');
        map.put ('[',']');
        map.put ('(',')');

        if (s.length () % 2 == 1){
            return false;
        }
        return checkString (sb,map);
    }
    public boolean checkString(StringBuilder s, HashMap<Character, Character> map){
        int start = 0;
        int pointer = start+1;
        StringBuilder subString = new StringBuilder ();

        while (pointer <= s.length ()){

        }
        return true;
    }
}
