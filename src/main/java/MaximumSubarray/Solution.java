package MaximumSubarray;

import java.util.*;

public class Solution {

    public int maxSubArray(int[] nums) {

//        int sum = 0, i = 0, j = 0, max = nums[0];
//        while (i < nums.length){
//            if (j < nums.length){
//                sum += nums[j];
//                max = Math.max(sum,max);
//                j++;
//            }else {
//                i++;
//                j=i;
//                sum=0;
//            }
//        }
        SortedSet<Integer> sumList = new TreeSet<> ();
        System.out.println ("Original Len : "+nums.length);
        int sum = 0;
        Stack <Integer> s = new Stack<> ();
        

        for (int i : nums){
            sum += i;
        }
        int max = sum;
//        int start= 0;
//        int end = nums.length;
//        for (int length = nums.length-1; length >= 0 ; length--){
//            start = 0;
//            end = length + start;
//            System.out.println ("s1 : "+start);
//            System.out.println ("e1 : "+end);
//            start = nums.length-length;
//            end = nums.length;
//            System.out.println ("s2 : "+start);
//            System.out.println ("e2 : "+end);
//        }
//        for (int length = nums.length; length >= 0 ; length--){
//            System.out.println ("length : "+length);
//            for (int start = 0 ; start <= nums.length - length; start++){
//                int end = start+length;
//                System.out.println ("Start : "+start);
//                System.out.println ("End : "+(end));
//                if (start < end) {
//                    int sum = 0;
//                    int[] tempArr = Arrays.copyOfRange (nums,start,end);
//                    System.out.println ("temp Array : "+Arrays.toString (tempArr));
//                    for(int i : tempArr){
//                        sum = sum + i;
//                    }
//                    System.out.println ("sum : "+sum);
//
//                    sumList.add (sum);
//                }
//            }
//        }
        System.out.println ("Original Array : "+Arrays.toString (nums));
        Queue<Integer> q = new LinkedList<> ();
        System.out.println ("Init sum : "+sum);
        for (int length = nums.length; length > 0 ; length--){
            System.out.println ("Step "+length);
            for (int start = 0 ; start <= nums.length - length; start++){
                int end = start+length-1;
                System.out.println ("Start : "+start+" End : "+(end)+" length : "+length);
                System.out.println ("Prev Sum : "+sum);
                if (!q.isEmpty ()) {
                    if (end < nums.length-1) {
                        sum = q.poll ();
                        System.out.println ("removing : "+nums[end+1] +" from "+sum);
                        sum = sum - nums[end+1];
                        max = Math.max (sum, max);
                        q.add (sum);
                        System.out.println ("sum2 : " + sum);
                        System.out.println ("max3 : " + max);
                    }
                    if (start> 0){
                        sum = q.poll ();
                        System.out.println ("adding : "+nums[end]+ " and removing "+nums[start-1]+" from "+sum);
                        sum = sum - nums[start-1];
                        max = Math.max (sum, max);
                        q.add (sum);
                        System.out.println ("sum1 : "+sum);
                        System.out.println ("max1 : "+max);
                    }


                }else {
                    System.out.println ("filling the queue : "+sum);
                    q.add (sum);
                    q.add (sum);
                }

                System.out.println (q);
            }
        }
        System.out.println (q);
        return max;
    }
}
