package stringPalindromeWithModification;

public class Solution {
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length ()-1;

        char []arr = s.toCharArray ();
        System.out.println (j);
        while (i < j){
            if (arr[i] == arr[j]){

            }else {
                break;
            }

            i++;
            j--;
        }
        System.out.println ("i "+i);
        System.out.println ("j "+j);

        return false;
    }
}
