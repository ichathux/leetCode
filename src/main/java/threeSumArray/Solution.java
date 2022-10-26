package threeSumArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        System.out.println(nums.length);

        List<List<Integer>> returnList = new ArrayList<> ();
        int i = 0;
        int j = i+1;
        int k = j+1;
        while (i <  nums.length && j < nums.length && k  < nums.length ){
            System.out.println("i "+i+": "+nums[i]);
            System.out.println("j "+j+": "+nums[j]);
            System.out.println("k "+k+": "+nums[k]);
            if (nums[i]+nums[k]+nums[j]  == 0 && (i != j || i != k || j != k)){
                System.out.println("got zero");
                List<Integer> list = new ArrayList<> ();
                list.add (nums[i]);
                list.add (nums[j]);
                list.add (nums[k]);
                System.out.println(list);
                list = list.stream ().sorted ().toList ();
                if (!returnList.contains (list)){
                    returnList.add (list);
                }
            }
            if( k == nums.length-1){
                System.out.println("last k");
                k=j+1;
                if (j == nums.length-2){
                    j = i+1;
                    k = j +1;
                    i++;
                    System.out.println ("last j -> i -> "+i+" k-> "+k);
                }
                j++;
            }
            k++;

        }
        return returnList;
    }

}
