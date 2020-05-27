package com.gprasad.interviewbit.programing.javasol.level2.math;

import java.util.ArrayList;
import java.util.Map;

/*
InterviewBit Java Solution : Prime Sum (https://www.interviewbit.com/problems/prime-sum/)

Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture
* */
public class PrimeSum {
    public static ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(A < 2)
            return result;

        int first = 2;
        int second = A - first;
        while(first <= second){
            second = A - first;
//            System.out.printf("isPrime(%d) : %s \n ", second, isPrime(second));
//            System.out.printf("isPrime(%d) : %s \n ", first, isPrime(first));
            if(isPrime(second) == true && isPrime(first)){
                result.add(first);
                result.add(second);
                return result;
            }
            first++;
        }

        return result;
    }
    public static boolean isPrime(int n){
        if(n==1) return false;
        int i =2;
        while (i<=Math.sqrt(n)){
            if(n%i==0) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int input = 590;
        System.out.println(primesum(input));
    }
}
