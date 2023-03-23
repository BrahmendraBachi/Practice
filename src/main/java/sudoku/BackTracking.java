package sudoku;


import org.jetbrains.annotations.Contract;

public class BackTracking {

    public void printSudoku(int[][] numArr){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    @Contract(pure = true)
    private boolean checkRow(int[][] numArr, int num, int i) {
        for (int rNum : numArr[i]) {
            if (rNum == num) {
                return false;
            }
        }
        return true;
    }

    private boolean checkCol(int[][] numArr, int num, int j) {
        for (int ind = 0; ind < 9; ind++) {
            if (numArr[ind][j] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean checkGrid(int[][] numArr, int num, int i, int j) {

        int r = (i / 3) * 3;
        int c = (j / 3) * 3;
        for (int x = r; x < r + 3; x++) {
            for (int y = c; y < c + 3; y++) {
                if (numArr[x][y] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkNumber(int[][] numArr, int num, int i, int j) {
        return checkRow(numArr, num, i) &&
                checkCol(numArr, num, j) &&
                checkGrid(numArr, num, i, j);
    }

    public boolean isSudoku(int[][] numArr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (numArr[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] fillNumbers(int[][] numArr, int a, int b, int num) {
        if (num != 0) {
            numArr[a][b] = num;
            if (b < 8) {
                b++;
            } else if (a < 8) {
                a++;
                b = 0;
            } else {
                return numArr;
            }
        }
        for (int i = a; i < 9; i++) {
            for (int j = b; j < 9; j++) {
                if (numArr[i][j] == 0) {
                    for (int sNum = 1; sNum < 10; sNum++) {
                        if (checkNumber(numArr, sNum, i, j)) {
                            fillNumbers(numArr, i, j, sNum);
                            if (isSudoku(numArr)) {
                                return numArr;
                            }

                            numArr[i][j] = 0;
                        }
                    }
                }
                if (numArr[i][j] == 0) {
                    return numArr;
                }
            }
            b = 0;
        }
        return numArr;
    }
}
