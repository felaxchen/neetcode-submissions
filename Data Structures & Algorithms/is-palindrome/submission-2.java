class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        // 👈 left pointer starts at beginning of string

        int right = s.length() - 1;
        // 👉 right pointer starts at end of string
        // s.length()-1 because arrays are 0 indexed
        // "abca" → length=4, last index=3

        while (left < right) {
        // 🔁 Keep going until pointers meet in the middle
        // When left >= right we've checked everything

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                // ⏭️ Skip non-alphanumeric characters from LEFT
                // isLetterOrDigit returns true for a-z, A-Z, 0-9
                // ! flips it → skip if NOT a letter or digit
                // Example: "  a" → skip spaces, stop at 'a'
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                // ⏭️ Skip non-alphanumeric characters from RIGHT
                // Same logic but moving right pointer leftward
                // Example: "a  " → skip spaces, stop at 'a'
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
                // 🔤 Convert both characters to lowercase then compare
                // We convert to lowercase so 'A' and 'a' are treated same
                // s.charAt(left) → gets character at left index
                // Character.toLowerCase() → converts to lowercase
                // If they don't match → NOT a palindrome → return false
            }

            left++;
            // ➡️ Move left pointer forward toward middle

            right--;
            // ⬅️ Move right pointer backward toward middle
        }

        return true;
        // ✅ All characters matched → it IS a palindrome!
    }
}