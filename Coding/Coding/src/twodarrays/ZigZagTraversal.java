package twodarrays;

public class ZigZagTraversal {
    static int row;
    static int column;

    public static void main(String[] args) {
        int M[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
        };

        row = M.length;
        column = M[0].length;

        for (int i = 0; i < row; i++) {
            System.out.print(M[i][0] + " ");

            int k = i - 1;
            int j = 1;

            while (isValidIndex(k, j)) {
                System.out.print(M[k][j] + " ");
                k--;
                j++;
            }
            System.out.println("");
        }


        for (int i = 1; i < column; i++) {
            System.out.print(M[row - 1][i] + " ");

            int k = row-2;
            int j = i+1;

            while (isValidIndex(k, j)) {
                System.out.print(M[k][j] + " ");
                k--;
                j++;
            }
            System.out.println("");
        }

    }

    public static boolean isValidIndex(int i, int j) {
        if ((i >= 0 && i < row) && (j >= 0 && j < column)) {
            return true;
        }
        return false;
    }

}
