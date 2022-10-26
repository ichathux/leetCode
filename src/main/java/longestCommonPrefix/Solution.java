package longestCommonPrefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder ();

        int j = 0;
        String firstString = strs[0];

        if (strs.length == 1){
            return firstString;
        }

        try{
            while (j != firstString.length ()){
                for (int i = 0 ; i < strs.length ; i++){
                    StringBuilder sb2 = new StringBuilder (strs[i]);
                    if (sb2.equals ("")){
                        return "";
                    }
                    if (i == 0){
                        sb.append (sb2.charAt (j));
                    }else {
                        if (sb.length () > sb2.length ()){
                            sb.deleteCharAt (j);
                            return sb.toString ();
                        }
                        if (!sb2.substring (0,j+1).equals (sb.toString ())){
                            sb.deleteCharAt (j);
                            return sb.toString ();
                        }
                    }
                }
                if (j == strs[0].length ()-1){
                    return sb.toString ();
                }
                j++;
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println (e.getMessage ());
            return "";
        }catch (Exception e){
            System.out.println ("Error");
        }

        return sb.toString ();
    }
}
