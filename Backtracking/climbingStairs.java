package Backtracking;

public class climbingStairs {
    public static void climbStairs(int n,int step,String ans){
        if(step==n){
            System.out.println(ans);
            return;
        }
        if (step>n){
            return;
        }
        climbStairs(n,step+1,ans+"1");
        climbStairs(n,step+2,ans+"2");
    }

//    static int climbStairs(int n, int step) {
//        if (step == n) return 1;
//        if (step > n) return 0;
//
//        return climbStairs(n, step + 1) + climbStairs(n, step + 2);
//    }
    public static void main(String[] args) {
//        System.out.println(climbStairs(4,0));
        climbStairs(4,0,"");
    }
}
