package com.arithmetic.solutions.arithmetic;

import java.util.Scanner;

public class RepeatedString {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the String ");
        String rs=sc.next();

        System.out.println("Enter the int");
        long n=sc.nextLong();
        RepeatedString rstr=new RepeatedString();
        //String repeatedStr=rstr.filterStringBuilder(rs,n);
        //int count=rstr.findRepeatedString(repeatedStr, n);
        //System.out.println(count);

        System.out.println("Filter () "+rstr.filter(rs, n));

        rstr.calcAs(rs,n);
    }

    public void calcAs(String s, long n){
        long len=s.length(); //if 3
        long remainder=n%len; //10%3 1
        long count=0l;

        for(int i=0;i< len;i++ ){
            char a= s.charAt(i);
            if(a=='a'){
                count++;
            }
        }
        count = count * (n/len);

        for(int i=0;i<remainder;i++)
        {
            char a= s.charAt(i);
            if(a=='a'){
                count++;
            }
        }

        System.out.println(" Count is "+ count);

    }

    public String filter(String s, long n){
        String news=s;
        while(s.length()<n)
            s=s+news;

        System.out.println("Filter s "+s);
        return s;
    }

    public String filterStringBuilder(String s, long n){
        StringBuilder sb=new StringBuilder(s);
        String repeatedStr=s;
        while(s.length()<=n){
            sb.append(s);
            if(sb.length()>n){
                long n1=sb.length()-n;
                //repeatedStr=sb.substring(0,n);
                repeatedStr=sb.toString();

                //System.out.println("Repated String ->"+sb.substring(0,n));
               return repeatedStr;
            }
        }
        System.out.println();
        return repeatedStr;
    }

    public int findRepeatedString(String s, long n){
        //abcabcabca
        int count =0;
        System.out.println("String Length of "+s+" is "+s.length());
        long n1=0;
        if(s.length()>n){
            n1=s.length()-n;
            //repeatedStr=sb.substring(0,n);
        }
        for(int i=0;i<s.length()-n1;i++){
            char a=s.charAt(i);
            System.out.println("Char at index"+i +" is "+a);
            if(a=='a'){
                count ++;
            }
        }
        return count;
    }
}
