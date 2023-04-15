package strings;

import java.util.Arrays;

public class PrintDuplicate {
    public static void main(String[] args) {
        String str = "test string";
        int MAX_CHAR=26;
        int bitVector = 0; // Initialize the bit vector to zero
        int[] charCounts= new int[MAX_CHAR]; // Initialize an array to keep track of
        Arrays.fill(charCounts,0);
        // character counts

        for (int i = 0; i < str.length(); i++) {
            int bitIndex
                    = str.charAt(i) - 'a'; // Get the bit index for the
            // current character
            if ((bitVector & (1 << bitIndex))
                    == 0) { // Check if the bit is already set
                bitVector |= (1 << bitIndex); // Set the bit
            }
            else {
                charCounts[bitIndex]++; // Increment the count
                // for the duplicate
                // character
            }
        }


        System.out.println("Program Ends....");


//        for (int i = 0; i < MAX_CHAR; i++) {
//            if (charCounts[i] > 0) {
//                char c
//                        = i
//                        + 'a'; // Get the character corresponding
//                // to the current bit index
//                cout << c << ", count = " << charCounts[i] + 1
//                        << endl; // Print the duplicate character
//                // and its count
//            }
//        }


    }
}
