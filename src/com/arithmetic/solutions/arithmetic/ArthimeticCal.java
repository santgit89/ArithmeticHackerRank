package com.arithmetic.solutions.arithmetic;

import java.util.StringTokenizer;

public class ArthimeticCal {
    public static void main(String[] args) {
        System.out.println("Intellij Arithmetics Calculation");

        String s = "//[***]1,2***3,-4,\n5,6";
        String s1 = "";

        int arrMultiply = ArthimeticCal.arrMul(s);
        System.out.println(arrMultiply);

    }

    static int arrMul(String s) {
        String[] num;
        int nums = 1;

        if (s.length() == 0) {
            return 0;
        }
        String delimiter = ",|\\n";

        if (s.startsWith("//")) {
            return hashStringMul(s);
        }
        num = s.split(delimiter);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            nums = nums * Integer.parseInt(num[i]);
        }

        return nums;
    }

    static int hashStringMul(String s) {
        int nums = 1;
        String word = s;
        StringTokenizer tokenizer = new StringTokenizer(word, "//,;[***]\n");
        while (tokenizer.hasMoreTokens()) {
            //System.out.println(tokenizer.nextToken());
            int numsi = Integer.parseInt(tokenizer.nextToken());
            try {
                if (numsi < 0) {
                    throw new Exception("Numbers cannot be negative");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            nums = nums * numsi;
        }
        return nums;
    }
}



