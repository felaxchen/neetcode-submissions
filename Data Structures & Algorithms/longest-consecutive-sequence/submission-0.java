class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
            // ⏭️ Empty array → no sequence → return 0
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            // 📦 Add all numbers to HashSet
            // HashSet removes duplicates automatically
            // and lets us check if a number exists in O(1)
        }

        int maxLength = 0;
        // 📏 Track the longest sequence found so far

        for (int num : set) {
        // 🔁 Loop through every number in the set

            if (!set.contains(num - 1)) {
            // 🚪 Only START counting if num is the
            // BEGINNING of a sequence
            // A number is a start if num-1 doesn't exist
            // Example: for sequence 1,2,3,4
            // only 1 has no num-1 in set → start from 1
            // This prevents counting same sequence multiple times!

                int currentNum = num;
                // 📍 Start of current sequence

                int currentLength = 1;
                // 📏 Current sequence length starts at 1

                while (set.contains(currentNum + 1)) {
                // 🔁 Keep extending sequence as long as
                // next consecutive number exists in set

                    currentNum = currentNum + 1;
                    // ➡️ Move to next number

                    currentLength = currentLength + 1;
                    // ➕ Increase sequence length
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    // 📏 Update maxLength if we found longer sequence
                }
            }
        }

        return maxLength;
        // ✅ Return the longest consecutive sequence length
    }
}