package MoveZeros;

import java.util.Arrays;

class Solution {
    public int[] moveZeroes(int[] nums) {

        int start = 0;
        int last = nums.length-1;

        for (int i = 0; i < last; i++) {
            if (nums[i] == 0){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
            }
        }
        System.out.println (Arrays.toString (nums));
        return nums;
    }
}