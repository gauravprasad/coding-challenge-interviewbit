package com.gprasad.interviewbit.programing.javasol.level2.math;
/*
InterviewBit Java Solution : Palindrome Integer (https://www.interviewbit.com/problems/palindrome-integer/)

Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False
* */
public class PalindromeInteger {
    public static int isPalindrome(int A) {
        int temp = A;
        int invert=0;
        while(temp>0){
            invert = invert*10 + temp%10;
            temp/=10;
        }
        return A == invert?1:0;
    }

    public static void main(String[] args) {
        int input = 2147447412;
        System.out.println(isPalindrome(input));
    }
}
