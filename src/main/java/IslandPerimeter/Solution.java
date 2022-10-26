package IslandPerimeter;

public class Solution {

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length ; i++){
            int[] arr = grid[i];
            for (int j = 0; j < arr.length ; j++){
                if (arr[j] == 1){
                    if (i-1 < 0) {
                        perimeter++;
                    }else if (grid[i-1][j] == 0){
                        perimeter++;
                    }
                    if ((i+1) > grid.length-1  ){
                        perimeter++;
                    }else if ((grid[i+1][j] == 0)){
                        perimeter++;
                    }
                    if (j-1 < 0){
                        perimeter++;
                    }else if (arr[j-1] == 0){
                        perimeter++;
                    }
                    if ((j+1) > arr.length-1 ){
                        perimeter++;
                    } else if (arr[j+1] == 0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }
}
