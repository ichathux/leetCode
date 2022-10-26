package ArrangingCoins;

public class Solution {
    public int arrangeCoins(int n) {
//        if(n < 3){
//            return 1;
//        }
        int count = 0;
        int i = 1;
        for(int sum = 1; sum <= n ; sum+=i,count++ ){
            i++;
            if(sum > n){
                count--;
                break;
            }
            if ( sum < 0){
                break;
            }
        }

        return count;
    }
}
