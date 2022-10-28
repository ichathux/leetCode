package AllNumbersDisappearedInArray;

import java.util.*;

// TODO: 2022-10-28  
public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<> ();
        ArrayList<Integer> missingLIst= new ArrayList<> ();
        Arrays.stream (nums).forEach (i -> set.add (i));
        int firstNode = set.iterator ().next ();
        if (firstNode != 1){
            firstNode = 1;
            set.add (firstNode);
            missingLIst.add (firstNode);
        }
        if (firstNode == 1 && set.size () == 1){
            missingLIst.add (2);
            return missingLIst;
        }
        Iterator<Integer> itt = set.iterator ();
        int nextNode = firstNode+1;
        int curr;
        System.out.println (set);

        while (itt.hasNext ()){
            curr = itt.next ();
            if (itt.hasNext () && !set.contains (nextNode)){
                missingLIst.add ( nextNode);
            }
            nextNode = nextNode+1;

        }
        return missingLIst;
    }



}
