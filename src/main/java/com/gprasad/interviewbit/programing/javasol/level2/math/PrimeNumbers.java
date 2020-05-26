package com.gprasad.interviewbit.programing.javasol.level2.math;

import java.util.ArrayList;

public class PrimeNumbers {
    public static ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> output = new ArrayList<>();
        if (A < 2) {
            return output;
        }
        int[] x = new int[A+1];
        for(int i = 2;i<=Math.sqrt(A);i++){
            if(x[i]==0){
                for(int j = 2;i*j<=A;j++){
                    x[i*j]=1;
                }
            }
        }
        for(int i = 2; i<x.length;i++){
            if(x[i]==0) output.add(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int input = 1;
        System.out.println(sieve(input));
    }
}
