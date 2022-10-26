package serchInsert;

import java.util.Arrays;

public class Solution2 {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        int mid = (end-start)/2;
        int position = -1;
        boolean isFound = false;

        System.out.println ("Original Array : "+ Arrays.toString (nums));
        System.out.println ("Target : "+target);

        while (!isFound){
            System.out.println ("Mid is : "+mid);
            if (nums[mid] == target){
                position = mid;
                isFound = true;
            }else if (nums[mid] > target){
                start = 0;
                end = mid;
                mid = (end - start)/2;
            }else if (nums[mid] < target){
                start = mid;
                mid = (end - start)/2;
            }else if (nums[0] == target){
                position = 0;
                isFound = true;
            }if (mid >= end){
                break;
            }
        }

        return position;
    }
}
