package com.arithmetic.solutions.ZeroToMaster;

// Given an array = [2,5,1,2,3,5,1,2,4] : Should return 2
//Given an array = [2,1,1,2,3,5,1,2,4] :Should return 1
//[2,3,4,5] should return undefined

import java.util.HashMap;
import java.util.Map;

public class FindRecurringElemet {
    public static void main(String[] args) {
        int array1[]={2,5,1,2,3,5,1,2,4};
        int array2[]={2,1,1,2,3,5,1,2,4};
        int array3[]={2,3,4};
        //System.out.println(firstRecurringElement(array2));
        int n=firstRecurringElement2(array1);
        if(n!=0){
            System.out.println(n);
        } else {
            System.out.println("Undefined");
        }
    }

    static  int firstRecurringElement(int arr[]){
        int ans=arr.length;
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    //System.out.println(j);
                     if(j<ans){
                        ans=j;
                    }
                    break;
                }
            }
        }
        //System.out.println(ans);
        if(ans== arr.length){
            return 0;
        } else {return arr[ans];}
    }

    static  int firstRecurringElement2(int arr[]) {
        Map map=new HashMap();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                //System.out.println(arr[i]);
                return arr[i];
            } else {
                map.put(arr[i],i);
            }
        }
        return 0;
    }
    }
