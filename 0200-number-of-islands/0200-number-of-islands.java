class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length=='0')return 0;
        int island=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j,grid);
                    island++;
                }
            }
        }
        return island;
    }
    void dfs(int i,int j,char[][] grid)
    {
        if(i<0||j<0||i>grid.length-1||j>grid[0].length-1)return;
        if(grid[i][j]=='0')return;
        if(grid[i][j]=='1')
        {
            grid[i][j]='0';
        }
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }
}
