package com.arithmetic.solutions.ZeroToMaster;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
    int numbers[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

    int sortedArray[] =   bubbleSort(numbers);
    Arrays.stream(sortedArray).forEach(x->System.out.println(x));
    System.out.println(Arrays.toString(sortedArray));
    }
    static int[] bubbleSort(int[] array) {
        int arrVar;
        int counter=0;
        while (counter<array.length){
        for(int i=0;i< array.length-1; i++){
            if(array[i] >array[i+1]){
                arrVar=array[i];
                array[i]=array[i+1];
                array[i+1]=arrVar;
            }
        }
        counter++;
        }
        return array;
    }

}
