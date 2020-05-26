package com.gprasad.interviewbit.programing.javasol.level2.math;
/*
Given a number N, verify if N is prime or not.

Return 1 if N is prime, else return 0.

Example :

Input : 7
Output : True
Problem Approach:

* */
public class VerifyPrime {
    public static int isPrime(int A) {
        if(A==1) return 0;
        int i =2;
        while (i<=Math.sqrt(A)){
            if(A%i==0) return 0;
            i++;
        }
        return 1;
    }

    public static void main(String[] args) {
        int input = 29;
        System.out.println("Is "+input+" prime ? : "+isPrime(input));
    }
}
