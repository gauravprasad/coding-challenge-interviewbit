package com.gprasad.interviewbit.programing.javasol.level2.math;

public class BinaryRepresentation {
    public static String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        int i = A;

        while (i > 1) {
            sb.append(i % 2);
            i /= 2;
        }
        sb.append(i);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(findDigitsInBinary(5));
    }
}
