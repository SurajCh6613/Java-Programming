package Backtracking;

public class generateParenthesis {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        generateValidParenthesis(3,0,0,sb);
    }

////    Using String
//    public static void generateValidParenthesis(int n,int open,int close,String ans){
//        if(close>open || open>n){
//            return;
//        }
//        if(ans.length()==2*n){
//            System.out.println(ans);
//            return;
//        }
//        generateValidParenthesis(n,open+1,close,ans+'(');
//        generateValidParenthesis(n,open,close+1,ans+')');
//    }

    public static void generateValidParenthesis(int n,int open,int close,StringBuilder ans){
        if(close>open || open>n){
            return;
        }
        if(ans.length()==2*n){
            System.out.println("True "+ans);
            return;
        }

        generateValidParenthesis(n,open+1,close,ans.append('('));
        ans.deleteCharAt(ans.length()-1);
        generateValidParenthesis(n,open,close+1,ans.append(')'));
        ans.deleteCharAt(ans.length()-1);
    }
}
