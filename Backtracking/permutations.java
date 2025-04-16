package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
//        permutation("123","");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<List<Integer>> ans = new ArrayList<>();
        permutationsList(list,ans,new ArrayList<>());
        System.out.println(ans);
    }
    public static void permutation(String ques,String ans){
       if(ques.length()==0){
           System.out.println(ans);
           return;
       }
        for(int i=0;i<ques.length();i++){
            String nq = ques.substring(0,i)+ques.substring(i+1);
            permutation(nq,ans+ques.charAt(i));

        }
    }

    public static void permutationsList(List<Integer> ques, List<List<Integer>> ans,List<Integer> temp){
        if(ques.size()==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<ques.size();i++){
            Integer val = ques.remove(i); 
            temp.add(val);
            permutationsList(ques,ans,temp);
            temp.remove(temp.size()-1);
            ques.add(i,val);
        }
    }
}
