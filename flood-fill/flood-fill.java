class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevColor = image[sr][sc];
        int row = image.length;
        int col = image[0].length;
        if(image[sr][sc] != color){
            image[sr][sc] = color;
            Queue <int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        while(!queue.isEmpty()){
            int size = queue.size();
                for(int i=0;i<size;i++){
                    int currentCell[] = queue.poll();
            for(int[] direction:directions){
                int x = currentCell[0] + direction[0];
                int y = currentCell[1] + direction[1];
                if(x >= 0 && y >= 0 && x<row && y<col){
                    if(image[x][y] == prevColor){
                        image[x][y] = color;
                        queue.offer(new int[]{x,y});
                    }
                    
                }
            }
                }
            
        }
        }
        
        return image;
        
    }
    
}