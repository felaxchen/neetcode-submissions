class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<9;i++){
            set.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                continue;
                if(set.contains(board[i][j]))return false;
                set.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            set.clear();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')
                continue;
                if(set.contains(board[j][i]))return false;
                set.add(board[j][i]);
            }
        }
        for(int box=0;box<9;box++){
            set.clear();
            int row=(box/3)*3;
            int col=(box%3)*3;
            for(int i=row;i<row+3;i++){
                for(int j=col;j<col+3;j++){
                    if(board[i][j]=='.')continue;
                    if(set.contains(board[i][j]))return false;
                    set.add(board[i][j]);

                }
            }
        }
return true;


        }

        
    }

