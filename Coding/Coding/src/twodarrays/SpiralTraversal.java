package twodarrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i = 0, j = 0;
        int top = 0, left = 0, right = array[0].length - 1, bottom = array.length - 1;
        while (left <= right && top <= bottom) {

            //Forward
            while (j <= right) {
                System.out.print(array[top][j] + " ");
                j++;
            }
            top++;
            i = top;

            //downward
            while (i <= bottom) {
                System.out.print(array[i][right] + " ");
                i++;
            }
            right--;
            j = right;

            if (top < bottom) {
                //Leftward
                while (j >= left) {
                    System.out.print(array[bottom][j] + " ");
                    j--;
                }
                bottom--;
                i = bottom;
            }

            //Upward
            if (left < right) {
                while (i >= top) {
                    System.out.print(array[i][left] + " ");
                    i--;
                }
                left++;
                j = left;

            }


        }


    }
}
