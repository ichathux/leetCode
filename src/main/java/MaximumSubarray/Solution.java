package MaximumSubarray;

import java.util.Arrays;

public class Solution {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 1; i <= nums.length ; i++){
            for (int j = 0 ; j+i <= nums.length ; j+=1){
                max = Math.max (Arrays.stream(Arrays.copyOfRange (nums,j, j+i)).sum (),max);
            }
        }

        return max;
    }
}
