package maxLengthOfRepeatedSubArray;

import java.util.*;

public class Solution {
    public int findLength(int[] nums1, int[] nums2) {
//
        System.out.println ("num1 array : "+ Arrays.toString (nums1));
        System.out.println ("num2 array : "+ Arrays.toString (nums2));

//        int tc = 0;
//        int count = 0;
//        int tempcount = 0;
//        try{
//        for(int i = 0 ; i < nums1.length ; i++){
//                tc = i;
//                System.out.println ("tc -> "+tc);
//                System.out.println ("checking init : "+nums1[tc]);
//                for (int j = 0 ; j < nums2.length ; j++){
//                        System.out.println ("i counting : "+tc);
//                        System.out.println ("j counting : "+j);
//                        if (tc > nums2.length){
//                            tc = 0;
//                        }
//                        System.out.println ("checking : "+nums1[tc]);
//                        System.out.println ("with checking : "+nums2[j]);
//                        if (nums1[tc] == nums2[j]){
//                            System.out.println ("equal in 2nd array "+j);
//                            tc++;
//                            tempcount++;
//                        }else {
//                            System.out.println ("not equal");
//                            if (tempcount > count) {
//                                count = tempcount;
//                                tempcount = 0;
//                            }else {
//                                tempcount = 0;
//                            }
//                        }
//                        if (tempcount> nums1.length-1 || count > nums1.length){
//                            count = nums1.length;
//                            tempcount = nums1.length;
//                        }
//                        if (j > nums2.length){
//                            j = 0 ;
//                        }
//                        System.out.println ("count : "+count);
//                        System.out.println ("temp count : "+tempcount);
//
//                }
//        }
//            System.out.println ("final count : "+count);
//            return count;
//        }catch (ArrayIndexOutOfBoundsException e){
//            int c = tempcount > count ? tempcount:count;
//            return c;
//
//        }



            int ans = 0;
            Map<Integer, ArrayList<Integer>> Bstarts = new HashMap();
            for (int j = 0; j < nums2.length; j++) {
                Bstarts.computeIfAbsent(nums2[j], x -> new ArrayList()).add(j);
            }

            for (int i = 0; i < nums1.length; i++) if (Bstarts.containsKey(nums1[i])) {
                for (int j: Bstarts.get(nums1[i])) {
                    int k = 0;
                    while (i+k < nums1.length && j+k < nums2.length && nums1[i+k] == nums2[j+k]) {
                        k++;
                    }
                    ans = Math.max(ans, k);
                }
            }
            return ans;


    }
}
