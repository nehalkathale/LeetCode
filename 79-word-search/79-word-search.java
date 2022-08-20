class Solution {
    boolean ifExist = false;
    int wordLength = 0;
    public boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;
        if(word.length() == 0){ return true; }                                          
		if(rows * cols < word.length()){ return false; }
        for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
				if(board[r][c] == word.charAt(0)){
                    boolean isFound = dfs(board, new boolean[rows][cols], r, c, word, 0);   
					if(isFound){ return true; }
                }
            }
       }
        return false;
        
    }
    public boolean dfs(char[][]board,boolean[][] visitedBoard,int row,int col,String word,int wordInd){
        if( (row < 0 || row >= board.length)   ||   (col < 0 || col >= board[0].length)  ||   board[row][col] != word.charAt(wordInd) ){
            return false;
		}
        if(visitedBoard[row][col] ){ return false; }                                             
		if(wordInd == word.length() - 1){ return true; }
		visitedBoard[row][col] = true;  
        if( dfs(board, visitedBoard, row, col-1, word, wordInd + 1) ){ return true; }     
		if( dfs(board, visitedBoard, row, col+1, word, wordInd + 1) ){ return true; }     
		if( dfs(board, visitedBoard, row-1, col, word, wordInd + 1) ){ return true; }     
		if( dfs(board, visitedBoard, row+1, col, word, wordInd + 1) ){ return true; }      
		visitedBoard[row][col] = false;
        return false;
    }
}