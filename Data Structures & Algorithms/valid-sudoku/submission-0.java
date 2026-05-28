class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char current=board[row][col];
                if(current!='.'){
                    String rowkey=current+"in row"+ row;
                    String colkey=current+"in col"+ col;
                    String bolkey=current+"in box"+ (row/3)+"-"+(col/3);
                    if(set.contains(rowkey))\\set.contains(colkey)\\set.contains(boxkey){
                        return false;

                    }
                    set.add(rowkey);
                    set.add(colkey);
                    set.add(boxkey);
                }
            }
        }
        return true;
        
    }
}
