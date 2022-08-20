package com.java.base.algorithm;

public class NumIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]== '1'){
                    dps(grid,i,j);
                    count++;
                }
            }
        return count;
    }
    public void dps(char[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length || j>=grid[0].length||grid[i][j]=='0') return;
        grid[i][j] = '0';
        dps(grid,i+1,j);
        dps(grid,i,j+1);
        dps(grid,i-1,j);
        dps(grid,i,j-1);
    }
}
