package StringPalindrome;

public class Solution {

    public boolean isPalindrome(String s) {

        String s1 = s.replaceAll ("[^A-Za-z0-9]","").toLowerCase ().replaceAll ("\s", "");
        StringBuilder sb = new StringBuilder (s1);

        System.out.println (s1.equals (sb.reverse ().toString ()));



        return false;
    }
}
