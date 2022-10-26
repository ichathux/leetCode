package firstBadVersion;

public class Solution {
    public int firstBadVersion(int n) {

        System.out.println ("init -> "+n);

        for (int i = n ; i > 0; i/=2){
            if (!isBadVersion (i)){
                System.out.println ("first good verion "+i);
                for (int j = i-1; j <= i*2 ; j++){
                    System.out.println (j);
                    if (isBadVersion (j)){
                        return j;
                    }
                }
                break;
            }
        }
        return 1;
    }

    boolean isBadVersion(int badversion){
        if (badversion == 1){
            return true;
        }
        if (badversion == 2){
            return true;
        }
        return false;
    }

}
