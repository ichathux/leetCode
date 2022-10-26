package numOfSubArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        System.out.println ("original array : "+Arrays.toString (arr));

        int count = 0;
//        int subTotal = 0;
//
//        double avg = 0 ;
//        for (int start = 0, pointer = k-1 ; pointer < arr.length || start < arr.length-k; pointer++, start++){
//            System.out.println ("sub array start : "+start+" end : "+pointer);
//
//            for (int i = start; i <= pointer ; i++){
//                System.out.println (arr[i]);
//                subTotal += arr[i];
//            }
//            avg = subTotal/k;
//            System.out.println (" sum : "+subTotal+" avg : "+avg);
//            if (avg >= threshold){
//                System.out.println ("true");
//                count++;
//            }else {
//                if (arr[pointer+1] < pointer){
//                    start++;
//                    pointer++;
//                }
//            }
//            subTotal = 0;
//            avg = 0;
//            System.out.println ();
//            if (pointer == arr.length){
//                System.out.println ("end reached");
//            }
//        }
        int tempSum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            tempSum += arr[i];
            if (i >= (k-1)){
                if (tempSum >= (threshold*k)){
                    count++;
                }
                tempSum -= arr[i-(k-1)];
            }
        }
        return count;
    }
}
