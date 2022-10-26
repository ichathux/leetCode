package validParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution2 {

    public boolean isValid(String s){
        HashMap<Character, Character> map = new HashMap<> ();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<> ();
        for (int i = 0; i < s.length () ; i++){
            char current = s.charAt (i);
            if (map.keySet ().contains (current)){
                stack.push (current);
            }else if (map.values ().contains (current)){
                stack.push (current);
                if (!stack.empty () && map.get (stack.peek ()) == current){
                    stack.pop ();
                }else return false;

            }
        }
        return stack.empty ();

    }
}
