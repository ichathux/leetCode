package serchInsert;

public class Solution {
    public int searchInsert(int[] nums, int target) {

        int mid = nums.length/2;
        int begin = mid;
        int end = mid;

        if(target > nums[nums.length-1]){
            return nums.length;
        }else if(target < nums[0]){
            return 0;
        }
        while(begin>=0 || end<= nums.length-1 ){
            System.out.println(begin);
            System.out.println(end);
            if(nums[begin] >= target){
                return begin-1;
            }
            if(nums[end] <= target){
                return end+1;
            }

            begin--;
            end++;
            if ((begin == -1 || end == nums.length)) {
                begin = 0;
                end = nums.length - 1;
            }

        }
        return 0;
    }
}
