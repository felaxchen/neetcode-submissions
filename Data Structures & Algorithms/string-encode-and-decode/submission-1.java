class Solution {

    public String encode(List<String> strs) {
        String result = "";
        // ✅ changed " " to "" — no space at start
        // A space at the beginning would break decoding!

        for (int i = 0; i < strs.size(); i++) {
            String word = strs.get(i);
            int length = word.length();
            result = result + length + "#" + word;
            // Format: "5#Hello5#World"
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
        // ✅ proper boolean condition

            int j = i;
            // ✅ j declared only ONCE here

            while (str.charAt(j) != '#') {
                j++;
                // move j forward until we find '#'
            }
            // when loop ends, j is sitting ON the '#'

            String lengthString = str.substring(i, j);
            // ✅ substring — all lowercase
            // gets the number part before '#'

            int length = Integer.parseInt(lengthString);
            // ✅ Integer — correct spelling
            // converts "5" string into 5 int

            j = j + 1;
            // move j past the '#' to start of actual word

            String word = str.substring(j, j + length);
            // extract the actual word using the length we found

            result.add(word);
            // add word to our result list

            i = j + length;
            // move i to start of next encoded word
        }

        return result;
        // ✅ return is OUTSIDE the while loop
    }
}
