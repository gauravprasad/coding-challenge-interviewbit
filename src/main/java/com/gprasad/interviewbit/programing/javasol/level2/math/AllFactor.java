package com.gprasad.interviewbit.programing.javasol.level2.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
Given a number N, find all factors of N.

Example:

N = 6
factors = {1, 2, 3, 6}
Make sure the returned array is sorted.
* */
public class AllFactor {
    public static ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> output = new ArrayList<>();
        int i = 1;
        while (i <= Math.sqrt(A)) {
            if (A % i == 0) {
                output.add(i);
                if(i!=Math.sqrt(A)) output.add(A/i);
            }
            i++;
        }
        Collections.sort(output);
        return output;
    }

    public static void main(String[] args) {
        int input = 100;
        System.out.println("all factors of " + input + " is : " + allFactors(input));
    }
}
