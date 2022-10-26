package GabageCollect;

// TODO: 2022-10-14
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {


        Map<Character, Integer> travelDestination = new HashMap<> ();
        Map<Character, Integer> collectionTravel = new HashMap<> ();
        int collect = 0;
        int trvlP = 0;
        int trvlG = 0;
        int trvlM = 0;

        for (int i =0 ; i < garbage.length ; i++){
            String type = garbage[i];
            for (char c : type.toCharArray ()){
                if (c == 'G'){
                    travelDestination.put (c,0);
                    travelDestination.put (c,Math.max (travelDestination.get (c), i));
                    collect++;
                    System.out.println (travelDestination);
                }
                if (c == 'M'){
                    travelDestination.put (c,0);
                    travelDestination.put (c,Math.max (travelDestination.get (c), i));
                    collect++;
                    System.out.println (travelDestination);
                }
                if (c == 'P'){
                    travelDestination.put (c,0);
                    travelDestination.put (c,Math.max (travelDestination.get (c), i));
                    collect++;
                    System.out.println (travelDestination);
                }
            }
            System.out.println (travelDestination);
            if (i > 0){

            }
        }
        System.out.println ("collect "+collect);
        Iterator<Character> itt = travelDestination.keySet ().iterator ();
        int timeForTravel = 0;
        while (itt.hasNext ()){
            Integer l = travelDestination.get (itt.next ());
                    for (int j = 0; j < l ; j++){
                        timeForTravel = timeForTravel + travel[j];
                    }
        }

        System.out.println ("time for travel : "+timeForTravel);
        return  collect+timeForTravel;
    }
}
