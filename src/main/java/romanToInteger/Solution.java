package romanToInteger;

public class Solution {
    public int romanToInt(String s) {
        int count = 0;
        int prevLetter = 0;
        int current = 0;
        for (int i = 0 ; i < s.length () ; i++){
            switch (s.charAt (i)){
                case 'I':{
                    current = 1;
                    System.out.println ("I");
                    count++;
                    prevLetter = current;
                    break;
                }
                case 'V':{
                    current = 5;
                    count = checkCount (count , prevLetter , current);
                    prevLetter = current;
                    break;
                }
                case 'X':{
                    current = 10;
                    count = checkCount (count , prevLetter , current);
                    prevLetter = current;
                    break;
                }
                case 'L':{
                    current = 50;
                    count = checkCount (count , prevLetter , current);
                    prevLetter = current;
                    break;
                }
                case 'C':{
                    current = 100;
                    count = checkCount (count , prevLetter , current);
                    prevLetter = current;
                    break;
                }
                case 'D':{
                    current = 500;
                    count = checkCount (count , prevLetter , current);
                    prevLetter = current;
                    break;
                }
                case 'M':{
                    current = 1000;
                    count = checkCount (count , prevLetter , current);
                    prevLetter = current;
                    break;
                }
            }
        }
        return count;
    }
    private int checkCount(int count , int prevLetter , int current) {
        if (prevLetter != 0 && prevLetter > current) {
            count += current;
        } else if (prevLetter != 0 && prevLetter < current) {
            count -= prevLetter;
            current -= prevLetter;
            count += current;
        } else {
            count += current;
        }
        return count;
    }
}
