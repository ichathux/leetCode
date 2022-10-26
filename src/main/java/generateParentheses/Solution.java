package generateParentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Solution {
    public List<String> generateParenthesis(int n) {

        HashMap<String, String> paraMap = new HashMap<> ();
        paraMap.put ("(", ")");
        StringBuilder sb = new StringBuilder ();
        String open = "(";
        String close = ")";

        String full = open+close;
        ArrayList<String> arrayList = new ArrayList<> ();


        return arrayList;
    }
}
