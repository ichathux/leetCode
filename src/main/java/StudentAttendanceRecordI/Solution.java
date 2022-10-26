package StudentAttendanceRecordI;

public class Solution {
    public boolean checkRecord(String s) {

        StringBuilder sb = new StringBuilder (s);
        if(sb.indexOf("LLL") != -1){
            return false;
        }
        int count = 0;
        while (sb.indexOf ("A") != -1){
            count++;
            sb.deleteCharAt (sb.indexOf ("A"));
            if (count >= 2){
                return false;
            }
        }
        return true;
    }
}
