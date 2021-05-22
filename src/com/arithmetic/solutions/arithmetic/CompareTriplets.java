package com.arithmetic.solutions.arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTriplets {

    public static void main(String[] args) {
        CompareTriplets ct=new CompareTriplets();

        Scanner sc=new Scanner(System.in);
        
        int alice[] = new int[3],bob[]=new int[3];

        System.out.println("Enter elements for alice");
        for(int i=0;i<3;i++){
            alice[i]=sc.nextInt();
        }
        System.out.println("Enter elements for bob");
        for(int i=0;i<3;i++){
            bob[i]=sc.nextInt();
        }

        int[] output=ct.compareTriplets(alice, bob);
        System.out.println(Arrays.toString(output));
    }

    public int[] compareTriplets(int[] alice, int[] bob){
        int acount=0;
        int bcount=0;
        int[] output=new int[2];
        for(int i=0;i<3;i++){
            if(alice[i]>bob[i]){
                acount++;
            } else if(bob[i]>alice[i]){
                bcount++;
            }
        }

        output[0]=acount;
        output[1]=bcount;
        return output;
    }
}
