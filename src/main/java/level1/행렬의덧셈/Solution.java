package level1.행렬의덧셈;

public class Solution {

    public int[][] solution1(int[][] arr1, int[][] arr2) {
        int sizeOfRow = arr1.length;
        int sizeOfColumn = arr1[0].length;
        int[][] answer = new int[sizeOfRow][sizeOfColumn];
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public int[][] solution2(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
