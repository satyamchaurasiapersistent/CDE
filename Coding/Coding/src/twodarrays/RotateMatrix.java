package twodarrays;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        for(int i=0;i< matrix.length;i++){
            for(int j=i;j< matrix[0].length;j++){
                int temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

        int left =0,righ=matrix[0].length-1;

        while (left<righ){
            for(int i=0;i<matrix.length;i++){
                int temp = matrix[i][righ];
                matrix[i][righ]=matrix[i][left];
                matrix[i][left]=temp;
            }
            left++;
            righ--;
        }


        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

    }
}
