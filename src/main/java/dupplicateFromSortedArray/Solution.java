package dupplicateFromSortedArray;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length ; i ++){
            int prevValue = nums[i-1];
            if(prevValue != nums[i]){
                count++;
            }
        }
        return count;
    }
}
