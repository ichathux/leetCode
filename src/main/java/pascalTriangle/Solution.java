package pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> list = new ArrayList<> ();

        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<> ();
            subList.add (1);
            if (i > 0){
                if (i == 1){
                    subList.add (1);
                }
                if (i > 1){
                    List<Integer> prevSubList = list.get (i-1);
                    for (int j = 1 ; j <= prevSubList.size () ; j++){
                        if (j < prevSubList.size ()){
                            subList.add (prevSubList.get (j-1)+ prevSubList.get (j));
                        }else {
                            subList.add (1);
                        }
                    }
                }
            }
            list.add (subList);
        }
        System.out.println (list);
        return list;
    }
}
