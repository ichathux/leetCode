package IntersectionofTwoArrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, ArrayList<Integer>> containList = new HashMap<> ();
        int key = 0;
        int i = nums1.length-1;

        while (i >= 0 ){
            System.out.println (nums1[i]);
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]) {
                    System.out.println (nums1[i]+" equal "+nums2[j]);
                    containList.computeIfAbsent (key,(v) -> new ArrayList<> ()).add (nums2[j]);
                    break;
//                    if (i <= 0){
//                        return containList.get (0).stream ().mapToInt (x -> x).toArray ();
//                    }else {
//                        i--;
//                    }

                }

                if (j == nums2.length-1 && !containList.isEmpty ()){
                    return  containList.get (0).stream ().mapToInt (x -> x).toArray ();
                }
            }
            i--;
        }
        System.out.println (containList);
        return  containList.get (0).stream ().mapToInt (x -> x).toArray ();
    }
}
