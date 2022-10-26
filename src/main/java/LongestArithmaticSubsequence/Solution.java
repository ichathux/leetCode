package LongestArithmaticSubsequence;

import java.util.ArrayList;

public class Solution {
    public int longestSubsequence(int[] arr, int difference) {

        ArrayList<Integer> tempList = new ArrayList<> ();
        ArrayList<Integer> finalList = new ArrayList<> ();
        ArrayList<Integer> checkedList = new ArrayList<> ();


        for (int count = 0; count < arr.length; count++){

            int tempInt1 = arr[count];

            if (checkedList.contains (tempInt1)){
                System.out.println ("already checked");
                continue;
            }

                tempList.add (tempInt1);
                System.out.println ("checking with : " + tempInt1);

                for (int i = count; i < arr.length; i++) {
                    checkedList.add (arr[count]);
                    int tempInt2 = arr[i];
                    if (i != count) {
                        if ((tempInt1 + difference) == tempInt2) {
                            System.out.println ("adding to tempList -> " + tempInt1 + " with " + tempInt2);
                            tempInt1 = tempInt2;
                            tempList.add (tempInt2);

                            System.out.println ("adding indexed -> " + count + " with " + i);
                        } else {
                            System.out.println ("not adding -> " + tempInt1 + " with " + tempInt2);
                        }
                        if (i == arr.length - 1 && finalList.size () <= tempList.size ()) {
                            System.out.println ("clearing");

                            finalList.clear ();
                            finalList.addAll (tempList);
                            tempList.clear ();
                            System.out.println ("tempList final: " + tempList);
                            System.out.println ("finalList final: " + finalList);
                        }
                        if (i == arr.length - 1) {
                            tempList.clear ();
                        }
                    }


            }
            System.out.println ("final finalList : "+finalList);
        }

        if (finalList.size ()==0){
            return 1;
        }
        return finalList.size ();
    }
}
