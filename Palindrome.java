class Palindrome {

    static void checkPalindrome(String word) {

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if(word.equals(reversed)) {
            System.out.println(word + " is palindrome");
        }
        else {
            System.out.println(word + " is not palindrome");
        }
    }
}