package Backtracking;

public class blocked_maze {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
        int row=0,col=0;
        String ans = "";
        boolean [][]visited = new boolean[grid.length][grid[0].length];
        maze(grid,row,col,ans,visited);
    }

    public static void maze(int [][]grid,int row,int col,String ans, boolean[][]visited){
        if(row==grid.length-1 && col==grid[0].length-1){
            System.out.println(ans);
            return;
        }

        if(row<0 || row>=grid.length|| col<0|| col>=grid[0].length|| visited[row][col]==true || grid[row][col]==1){
            return;
        }

        visited[row][col] =true; // Set visited
        maze(grid, row-1, col,ans+"T", visited); // Top Call
        maze(grid, row+1, col,ans+"D", visited); // Down Call
        maze(grid, row, col-1,ans+"L", visited);  // Left Call
        maze(grid, row, col+1,ans+"R", visited);  // Right Call
        visited[row][col]=false; // Reset visited
    }
}
