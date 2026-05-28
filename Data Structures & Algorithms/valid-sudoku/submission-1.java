class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();
        // 📦 HashSet stores all keys we've seen so far
        // Each key is a unique string like "5 in row 3"
        // If we see the same key twice → duplicate → invalid!

        for (int row = 0; row < 9; row++) {
        // 🔁 Loop through all 9 rows

            for (int col = 0; col < 9; col++) {
            // 🔁 Loop through all 9 columns

                char current = board[row][col];
                // 📍 Get the character at this cell
                // Could be '1'-'9' or '.' (empty)

                if (current != '.') {
                // ⏭️ Skip empty cells — we only check filled ones

                    String rowkey = current + " in row " + row;
                    // 🔑 Key for row check
                    // Example: "5 in row 3"
                    // If we see this key again → same number in same row!

                    String colkey = current + " in col " + col;
                    // 🔑 Key for column check
                    // Example: "5 in col 2"
                    // If we see this key again → same number in same col!

                    String boxkey = current + " in box " + (row/3) + "-" + (col/3);
                    // 🔑 Key for 3×3 box check
                    // row/3 and col/3 gives box coordinates (0,1,2)
                    // Example: row=4,col=4 → box (1,1) → "5 in box 1-1"
                    // All cells in same 3×3 box get same box number!

                    if (set.contains(rowkey) || set.contains(colkey) || set.contains(boxkey)) {
                    // ❓ Have we seen this number in same row OR col OR box?
                    // || means OR — if ANY of these is true → invalid!
                        return false;
                    }

                    set.add(rowkey);
                    set.add(colkey);
                    set.add(boxkey);
                    // 📝 Add all three keys to our set
                    // So future cells can detect duplicates
                }
            }
        }

        return true;
        // ✅ No duplicates found anywhere → valid sudoku!
    }
}