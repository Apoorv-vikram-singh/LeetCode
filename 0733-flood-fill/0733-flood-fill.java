class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        
        DFS(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    void DFS(int[][] grid,int sr,int sc,int color,int old)
    {
        if(sr<0||sc<0||sr>=grid.length||sc>=grid[0].length||grid[sr][sc]!=old)
        {
            return;
        }
        
        grid[sr][sc]=color;
        DFS(grid,sr+1,sc,color,old);
        DFS(grid,sr-1,sc,color,old);
        DFS(grid,sr,sc+1,color,old);
        DFS(grid,sr,sc-1,color,old);
        
    }
}