package com.buck.algorithm.leetcode;

public class RomanToInt {

    public static int romanToInt(String s){
        int[] values = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I':
                    values[i] = 1;
                    break;
                case 'V':
                    values[i] = 5;
                    break;
                case 'X':
                    values[i] = 10;
                    break;
                case 'L':
                    values[i] = 50;
                    break;
                case 'C':
                    values[i] = 100;
                    break;
                case 'D':
                    values[i] = 500;
                    break;
                case 'M':
                    values[i] = 1000;
                    break;
            }
        }
        int sum = 0;
        for(int j = 0;j<values.length-1;j++){
            if(values[j]<values[j+1]){
                sum -= values[j];
            }else{
                sum += values[j];
            }
        }
        sum += values[values.length-1] ;
        return sum;
    }
}
