package strings;

import java.util.Arrays;

public class SetZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int x = Integer.MIN_VALUE;

//Marking zero in submatrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = x;
                    matrix[i][0] = x;
                }
            }
        }

        //Marking zero in sub matrix Vertially
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == x) {
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
//Marking zero in sub matrix Horizontally
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == x) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {

                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {

                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }


        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == x) {
                matrix[0][i] = 0;
            } else if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[0][j] = 0;
                }
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == x) {
                matrix[i][0] = 0;
            } else if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][0] = 0;
                }
                break;
            }
        }


        System.out.println(Arrays.deepToString(matrix));


    }
}
