package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        List<List<Integer>> big = new ArrayList<>();
        int arr[] = {1,2,3};
        int arr2[]={1,1,2};
//        subset(arr,0,big,new ArrayList<>());
//        System.out.println(big);
        subset2(arr2,0,big,new ArrayList<>(),true);
        System.out.println(big);
    }

    // Subset of unique elements in array
    static void subset(int arr[], int vidx, List<List<Integer>> big,List<Integer> temp){
        if(vidx==arr.length){
            big.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[vidx]);
        subset(arr,vidx+1,big,temp);
        temp.remove(temp.size()-1);
        subset(arr,vidx+1,big,temp);
    }

    // subset of duplicate elements in array
    static void subset2(int arr[],int vidx,List<List<Integer>> big,List<Integer> temp,boolean flag){

        if(vidx==arr.length){
            big.add(new ArrayList<>(temp));
            return;
        }
        if(flag==false && arr[vidx]==arr[vidx-1]){
            subset2(arr,vidx+1,big,temp,false); // exclude
        }
        else{
            temp.add(arr[vidx]);
            subset2(arr,vidx+1,big,temp,true); //include
            temp.remove(temp.size()-1);
            subset2(arr,vidx+1,big,temp,false); // exclude
        }
    }
}
