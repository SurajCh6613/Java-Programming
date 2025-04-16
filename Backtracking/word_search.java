package Backtracking;

import java.util.ArrayList;

public class word_search {
    static void exist(char[][] board,int row,int col, String word,boolean[][] visited,String ans,ArrayList<String> list){
//        System.out.println("Row->"+row+" Col->"+col+" "+ans);

        if(row<0 || row>=board.length|| col<0|| col>=board[0].length|| visited[row][col]==true){
            return;
        }
        if(board[row][col]!=word.charAt(ans.length())){
            return;
        }
        ans = ans+board[row][col];
        if(ans.equals(word)){
            list.add(ans);
            return;
        }

        visited[row][col] = true;  //Set visited
        exist(board,row-1,col,word,visited,ans,list); // Top
        exist(board,row+1,col,word,visited,ans,list); // Down
        exist(board,row,col-1,word,visited,ans,list); // Left
        exist(board,row,col+1,word,visited,ans,list); // Right
        visited[row][col]= false;

    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "BCCEE";
        boolean[][] visited = new boolean[board.length][board[0].length];
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                exist(board,i,j,word,visited,"",list);
            }
        }
//        exist(board,0,0,word,visited,"",list);
        System.out.println(list);
    }
}
