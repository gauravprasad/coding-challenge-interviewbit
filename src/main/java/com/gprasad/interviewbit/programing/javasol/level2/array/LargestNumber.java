package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
InterviewBit Java Solution : Largest Number (https://www.interviewbit.com/problems/largest-number/)

Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
* */
public class LargestNumber {
    public static String largestNumber(final List<Integer> A) {
        String output = A.stream().map(num -> String.valueOf(num)).sorted((a, b) -> (a + b).compareTo(b + a) > 0 ? -1 : 1).collect(Collectors.joining());
        return output.charAt(0) == '0' ? "0" : output;
    }

    public static void main(String[] args) {
//        List<Integer> input = Arrays.asList(3, 30, 34, 5, 9);
        List<Integer> input = Arrays.asList(0, 0, 0, 0, 0);
        System.out.println(largestNumber(input));
    }

}
