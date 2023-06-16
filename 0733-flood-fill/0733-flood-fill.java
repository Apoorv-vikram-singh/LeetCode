class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int nr = image.length;
        int nc = image[0].length;
        //Error Checks
        //If the starting pixel is already colored as 'colar',no changes are made to the image.
        if(image == null || image.length == 0 || image[sr][sc] == color)
            return image;
        //image, sr, sc, startColor, fillColor, no. of rows, no. of Cols
        return dfs(image, sr, sc,image[sr][sc],color, nr, nc);
    }
    private int[][] dfs(int[][] image, int sr, int sc, int startColor,
                        int fillColor,int nr, int nc) {
        //Check for boundaries and current pixel color not equal start pixel color
        if (sr < 0 || sc < 0 || sr >= nr || sc >= nc || image[sr][sc] != startColor) {
          return image;
        }
        //Fill the pixel with new value 
        image[sr][sc] = fillColor;
        //call recursively for 4 co-ordinates
        dfs(image, sr - 1, sc,startColor, fillColor, nr, nc);
        dfs(image, sr + 1, sc,startColor, fillColor, nr, nc);
        dfs(image, sr, sc - 1,startColor, fillColor, nr, nc);
        dfs(image, sr, sc + 1,startColor, fillColor, nr, nc);
        return image;
        
    }
}