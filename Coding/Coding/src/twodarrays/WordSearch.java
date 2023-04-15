package twodarrays;

import java.util.Arrays;

public class WordSearch {
    public static void main(String[] args) {

        Character[][] words = new Character[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        boolean[][] visitedArray = new boolean[words.length][words[0].length];
        for(boolean[] ar : visitedArray){
            Arrays.fill(ar, false);
        }

        String findWord = "SEEE";
        boolean isWordFound = false;
        //Call Find Word :

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length; j++) {
                if (isWordFound) break;
                if (findWord.charAt(0) == words[i][j]) {
                    isWordFound = findWordfn(words, visitedArray, findWord, i, j);
                    if (isWordFound) break;
                }
            }
        }

        System.out.println("Word " + findWord + " is Found in this matrix this statement is : " + isWordFound);


        //Check left right up down sahi hai k ni hana
        //visited dekh lo
        //character match hota hai to theek ni to backtrack karna hai
        //Break Condition

    }

    private static boolean findWordfn(Character[][] words, boolean[][] visitedArray, String findWord, int row, int col) {
        if (!isSafeToGo(words.length, words[0].length, row, col)) return false;

        if (visitedArray[row][col]){
            return false;
        }else{
            visitedArray[row][col]=true;
        }

        if (findWord.length()==1 && findWord.charAt(0)==words[row][col]) {
            return true;
        }

        boolean found = false;
        if (findWord.charAt(0) == words[row][col]) {

           found= findWordfn(words, visitedArray, findWord.substring(1), row, col + 1) ||
            findWordfn(words, visitedArray, findWord.substring(1), row, col - 1) ||
            findWordfn(words, visitedArray, findWord.substring(1), row + 1, col) ||
            findWordfn(words, visitedArray, findWord.substring(1), row - 1, col);
        }
        return found;

    }

    private static boolean isSafeToGo(int rowlength, int collength, int row, int col) {
        if ((row >= 0 && row < rowlength) && (col >= 0 && col < collength)) return true;
        return false;
    }
}
