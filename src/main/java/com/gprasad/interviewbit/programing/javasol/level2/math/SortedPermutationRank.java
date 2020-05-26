package com.gprasad.interviewbit.programing.javasol.level2.math;
/*
Given a string, find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Example :

Input : 'acb'
Output : 2

The order permutations with letters 'a', 'c', and 'b' :
abc
acb
bac
bca
cab
cba
The answer might not fit in an integer, so return your answer % 1000003
* */
public class SortedPermutationRank {
    public static int findRank(String A) {
        long result = 0;
        long faculty = 1;
        for (int i = A.length() - 1; i >= 0; --i) {
            char ai = A.charAt(i);
            long numSmaller = 0;
            for (int j = i + 1; j < A.length(); ++j) {
                if (ai > A.charAt(j)) numSmaller++;
            }
            result += (numSmaller * faculty) % 1000003;
            faculty *= (A.length() - i);
            faculty %= 1000003;
        }

        return (int)((result + 1) % 1000003);
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Output : "+findRank(input));
    }

}
