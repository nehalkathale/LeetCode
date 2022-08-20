class Solution {
    static boolean found = false;
    public boolean searchMatrix(int[][] matrix, int target) {
        found = false;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        dfs(matrix, 0, 0, target, visited);
        return found;
    }
    public void dfs(int[][] matrix, int x, int y, int target,boolean[][] visited){
        visited[x][y] = true;
        if(matrix[x][y] == target){
            found = true;
            return;
        }
        if(x-1 >= 0 && visited[x-1][y] == false)
            dfs(matrix, x-1, y, target, visited);
        
        if(y-1 >= 0 && visited[x][y-1] == false)
            dfs(matrix, x, y-1, target, visited);
        
        if(x+1 < matrix.length && visited[x+1][y] == false)
            dfs(matrix, x+1, y, target, visited);
        
        if(y+1 < matrix[0].length && visited[x][y+1] == false)
            dfs(matrix, x, y+1, target, visited);
    }
}