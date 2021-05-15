package com.arithmetic.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class OnesAndZeros {

    public static void main(String[] args) {
        String[] strs = {"10","0001","111001","1","0"};
        int m = 5, n = 3;

        int ans=findMaxForm(strs,m,n);
        int ansCopy=findMaxFormCopy(strs,m,n);
        System.out.println(ans+"Copy print: "+ansCopy);
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (String st : strs) {
            int mcount = 0, ncount = 0;
                for (char c : st.toCharArray()) {
                    if (c == '0') mcount++;
                    else ncount++;
                    for (int i = m; i >= mcount; i--)
                        for (int j = n; j >= ncount; j--)
                            dp[i][j] = Math.max(dp[i][j], dp[i - mcount][j - ncount] + 1);
                }
        } return dp[m][n];
    }

    public static int findMaxFormCopy(String[] S, int M, int N) {
        int[][] dp = new int[M+1][N+1];
        for (String str : S) {
            int zeros = 0, ones = 0;
            for (char c : str.toCharArray())
                if (c == '0') zeros++;
                else ones++;
            for (int i = M; i >= zeros; i--)
                for (int j = N; j >= ones; j--)
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeros][j-ones] + 1);
        }
        return dp[M][N];
    }
}
