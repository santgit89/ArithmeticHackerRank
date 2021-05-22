package com.arithmetic.solutions.arithmetic;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class JumpingOnClouds {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        //List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
               // .map(Integer::parseInt)
                //.collect(toList());  {0, 0, 1, 0, 0, 1, 0};
        Integer[] arr={0, 0, 1, 0, 0, 1, 0};
                      //  {0, 1, 0, 0, 0, 1, 0};
        List<Integer> li= Arrays.asList(arr);

        int result = jumpingOnClouds(li);

        System.out.println("result: "+result);
       // bufferedReader.close();
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int count=0;
        for (int i=0;i<c.size()-1;i++){
            System.out.println("iterator---"+i);
            count++;
            if(c.get(i + 2) == 0 && i  + 2 < c.size()){
                i++;
            }
        }
        return count;

    }
}
