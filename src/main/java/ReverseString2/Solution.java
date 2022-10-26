package ReverseString2;

public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.length () <= k){
            return sb.reverse ().toString ();
        }
        for(int i = 0 ; i < sb.length(); i+=(k*2)){
            StringBuilder sub;
            int startPoint;
            int endPoint;
            if (i+k < s.length ()) {
                startPoint = i;
                endPoint = i+k;
                sub = new StringBuilder (sb.substring (startPoint , endPoint));
            }else {
                startPoint = sb.length ()-(sb.length ()%(2*k));
                endPoint = sb.length ();
                sub = new StringBuilder (sb.substring (startPoint,endPoint));
            }
            sb.replace (startPoint,endPoint, sub.reverse ().toString ());
        }
        return sb.toString();
    }
}
