package com.gprasad.interviewbit.programing.javasol.level2.math;

public class ReverseInteger {

    public static int reverse(int A) {
        long reverse = 0l;
        while(Math.abs(A)>0){
            reverse = reverse*10 + Long.valueOf(A%10);
            A/=10;
        }
        return reverse==(int)reverse?(int)reverse:0;
    }

    public static void main(String[] args) {
        int input = 0;
        System.out.println("For input  0 : "+reverse(input));
        input=-10;
        System.out.println("For input  -10 : "+reverse(input));
        input = 2147483647;
        System.out.println("For input  2147483647 : "+reverse(input));
        input = -2147483648;
        System.out.println("For input  -2147483648 : "+reverse(input));

    }
}
