package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.Arrays;
import java.util.List;

public class MaxSumContiguousSubarray {

    public static int maxSubArray(final List<Integer> A) {
        Integer max = A.get(0);
        Integer currMaxSum = max;
        for(int i=1;i<A.size();i++){
            currMaxSum = Math.max(A.get(i), currMaxSum+A.get(i));
            max = Math.max(max, currMaxSum);
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3);
        System.out.println("Input : "+input);
        System.out.println("Output : "+maxSubArray(input));
    }
}
