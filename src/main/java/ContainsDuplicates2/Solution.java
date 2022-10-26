package ContainsDuplicates2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        System.out.println ("Array - "+ Arrays.toString (nums) + " and key "+k);
        Map<Integer, ArrayList<Integer>> visited = new HashMap<> ();
         int finalI = 0;
        for (int num : nums){
            if (visited.containsKey (num)) {
                int finalI1 = finalI;
                if (visited.get (num).stream ().filter (x -> Math.abs (x - finalI1) <= k).count () > 0) {
                    visited.clear ();
                    return true;
                } else {
                    visited.computeIfAbsent (num , (x) -> new ArrayList<> ()).add (finalI);
                }
            }else {
                visited.computeIfAbsent (num , (x) -> new ArrayList<> ()).add (finalI);
            }
            finalI++;
        }
        System.out.println (visited);
        return false;
    }
}
