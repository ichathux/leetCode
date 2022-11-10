package RansomNote;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] chars = ransomNote.toCharArray();
        StringBuilder sb = new StringBuilder (magazine);
        for(char c : chars){
            if(sb.indexOf (c+"") < 0){
                return false;
            }else {
                sb.deleteCharAt (sb.indexOf (c+""));
            }
        }
        return true;
    }
}
