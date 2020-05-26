package com.gprasad.interviewbit.programing.javasol.level2.math;

public class MathBug01 {
    public static int isPrime(int A) {
        if(A<2){
            return 0;
        }
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }
}
