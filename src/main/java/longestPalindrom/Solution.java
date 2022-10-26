package longestPalindrom;

// TODO: 2022-10-13
import java.util.HashMap;

public class Solution {
    public String longestPalindrome(String s) {

//        System.out.println ("original S: "+s);
//        StringBuilder sb = new StringBuilder (s);
//        sb.reverse ();
//        System.out.println ("reversed : "+sb );
//        StringBuilder tempSB1 = new StringBuilder ();
//        StringBuilder tempSB2 = new StringBuilder ();
//        int tempCount = 0;
//        if (s.equals (sb.toString ())){
//            return s;
//        }
//        for (int i = 0 ; i < s.length (); i++){
//
//            int k = i;
//            for (int j = 0; j < sb.length (); j++){
//                System.out.println ("first arr : "+k);
//                System.out.println ("second arr : "+j);
//                if (s.charAt (k) == sb.charAt (j)){
//                    if (tempCount > j){
//                        System.out.println ("new line");
//                        if (tempSB2.length () < tempSB1.length ()){
//                            tempSB2 = tempSB1;
//                            tempSB1 = new StringBuilder ("");
//                        }else {
//                            tempSB1 = new StringBuilder ("");
//                        }
//                    }
//                    System.out.println ("equal : "+" s.charAt (k) : "+s.charAt (k) + " sb.charAt (j) : "+sb.charAt (j));
//                    k++;
//                    tempCount = j;
//
//                    tempSB1.append (sb.charAt (j));
//                    System.out.println (tempSB1);
//                }else {
//                    System.out.println ("not equal");
//                    if (tempSB2.length () < tempSB1.length ()){
//                        tempSB2 = tempSB1;
//                        tempSB1 = new StringBuilder ("");
//                    }else {
//                        tempSB1 = new StringBuilder ("");
//                    }
//                }
//                if (k > sb.length ()-1){
//                    System.out.println ("k limit reached -> "+k);
//                    break;
//                }
//
//            }
//        }
//        tempSB2 = tempSB1.length () > tempSB2.length () ? tempSB1:tempSB2;
//
//        return  tempSB2.toString ();

        int maxLength = 0;
        StringBuilder sb = new StringBuilder ();
        StringBuilder sbTemp = new StringBuilder ();
        if (s.length () >= 2){
            sb.append (s.charAt (0));
            sb.append (s.charAt (1));

        }else{
            return s;
        }
        for (int right = 2, left = 0; right < s.length () ; right++){
            System.out.println (sb);
            if (sb.append (s.charAt (right)).toString ().equals (sb.reverse ().toString ())){
                    System.out.println ("equals");
                    System.out.println (sb);
                    left++;
            }else {
                System.out.println ("in else : "+sb);
                if (sbTemp.length () < sb.length () && sb.toString ().equals (sb.reverse ().toString ())){
                    sbTemp = sb;
                }
                sb.replace (left,left+1,"");
            }
        }
        System.out.println ("final "+sbTemp);
        return sb.toString ();
    }
}
