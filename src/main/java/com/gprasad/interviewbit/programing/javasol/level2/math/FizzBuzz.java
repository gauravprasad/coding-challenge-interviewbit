package com.gprasad.interviewbit.programing.javasol.level2.math;

import java.util.ArrayList;
/*
InterviewBit Java Solution : FizzBuzz (https://www.interviewbit.com/problems/fizzbuzz/)

Fizzbuzz is one of the most basic problems in the coding interview world. Try to write a small and elegant code for this problem.
Given a positive integer A, return an array of strings with all the integers from 1 to N.
But for multiples of 3 the array should have “Fizz” instead of the number.
For the multiples of 5, the array should have “Buzz” instead of the number.
For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.

Look at the example for more details.

Example

A = 5
Return: [1 2 Fizz 4 Buzz]
* */
public class FizzBuzz {
    final static String  FIZZ = "Fizz";
    final static String  BUZZ = "Buzz";
    public static ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> output = new ArrayList<>();
        for(int i = 1; i <=A; i++){
            if(i%3==0 && i%5==0){
                output.add(FIZZ+BUZZ) ;
            }else if(i%3==0){
                output.add(FIZZ) ;
            }else if(i%5==0){
                output.add(BUZZ) ;
            }else{
                output.add(String.valueOf(i)) ;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int input =  15;
        System.out.println(fizzBuzz(input));
    }
}
