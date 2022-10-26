package threeSumWithMul;

// TODO: 2022-10-13  
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int threeSumMulti(int[] arr, int target) {

        ArrayList<Integer> list = new ArrayList<> ();
        Arrays.stream (arr).forEach (i -> list.add (i));
        int count = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<> ();
        for (int i = 0 ; i < arr.length ; i++)
            map.computeIfAbsent (arr[i], x -> new ArrayList<> ()).add (i);
        System.out.println (map);

        for (int i = 1 ; i <= map.size () ; i++){
            System.out.println (map.get (i).size ());
        }
        return count;
    }
}
