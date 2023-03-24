package dsaPractice.largestNeighbour;

public class LargestNeighbour {

    public int maxHouse(int[][] arr, int n, int m, int x, int y, int count1){
        if(arr[x][y] == 1){
            int count = findPattern(arr, n, m, x, y, 0);
            count1 = count > count1 ? count : count1;
        }
        if(y < m - 1){
            y++;
        }
        else if(y == m - 1 && x < n - 1){
            x++;
        }
        else{
            return count1;
        }
        return maxHouse(arr, n, m, x, y, count1);

    }

    public int findPattern(int[][] arr, int n, int m, int x, int y, int v){
        if(!(checkValid(arr, n, m, x, y, v))){
            return 0;
        }
        arr[x][y] = 0;
        int count = 1 + findPattern(arr, n, m, x, y - 1, 1) +
                findPattern(arr, n, m, x, y + 1, 1) +
                findPattern(arr, n, m, x - 1, y, 1) +
                findPattern(arr, n, m, x + 1, y, 1);
        return count;
    }

    public boolean checkValid(int[][] arr, int n, int m, int x,  int y, int v){
        if((v == 1) && (x < 0 || y < 0 || x >= n || y >= m || arr[x][y] == 0)){
            return false;
        }
        return true;
    }

}
