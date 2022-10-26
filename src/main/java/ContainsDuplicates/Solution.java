package ContainsDuplicates;

import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<> ();
        Map<Integer,Integer> visit = new HashMap<> ();
        int start = 0;
        int end = nums.length-1;
        if(nums.length == 1){
            return false;
        }
        while(start <= end){
            if(visited.contains(nums[start])){
                return true;
            }else{
                visited.add(nums[start]);
                if(start != end){
                    start++;
                }else{
                    break;
                }
            }
            if(visited.contains(nums[end])){
                return true;
            }else{
                visited.add(nums[end]);
                end--;
            }
        }
        return false;
    }
}
