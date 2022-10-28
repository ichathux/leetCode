package AssignCookies;

import java.util.ArrayList;

// TODO: 2022-10-28
public class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int temp = 0;

        for(int i = 0; i < g.length; i++){
            try{
                if(g[i] <= s[i]){
                    temp = Math.max (s[i],temp);
                }
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }

        }
        return temp;
    }
}
