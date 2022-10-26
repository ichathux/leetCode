package triangularSumOfArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int triangularSum(int[] nums) {
        for (int i = 1; i < nums.length ; i++){
            for (int j = 1; j <= nums.length-i; j++){
                int sum = nums[j-1]+nums[j];
                if (sum > 9){
                    sum = sum%10;
                }
                nums[j-1] = sum;

            }
        }
        return nums[0];
    }
}
