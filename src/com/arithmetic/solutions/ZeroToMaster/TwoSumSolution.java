package com.arithmetic.solutions.ZeroToMaster;

import java.util.*;

public class TwoSumSolution {
    public static void main(String[] args) {

        int array[]= twoSum(new int[]{2, 3, 4}, 6);
        System.out.println(Arrays.toString(array));
    }

    public static  int[] twoSum(int[] nums, int target) {
        int output[]=new int[2];
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                }
            }
        }
        return output;
    }
}
