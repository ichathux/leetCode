package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visited = new HashMap<> ();
        for (int i = 0; i < nums.length ; i++){
            int ans = target - nums[i];
            if (visited.containsKey (ans)){
                return new int[]{visited.get (ans), i};
            }
            visited.put (nums[i],i);
        }
        System.out.println (visited);
        return new int[]{0,0};
    }
}
