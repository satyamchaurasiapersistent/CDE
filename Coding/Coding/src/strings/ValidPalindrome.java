package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z]+", "").toLowerCase().trim();
        int left = 0, right = s.length() - 1;
        boolean palindromeFlag=true;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                System.out.println("String is not Palindrome :-( ");
                palindromeFlag=false;
                break;
            }
        }
        if(palindromeFlag)
        System.out.println("String is Palindrome :-) ");

    }

}
