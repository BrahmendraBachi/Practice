package dsaPractice.largestNeighbour;

public class MainMethod {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 1, 1}};

        LargestNeighbour largestNeighbour = new LargestNeighbour();
        System.out.println(largestNeighbour.maxHouse(arr, 4, 5, 0, 0, 0));
    }



}
