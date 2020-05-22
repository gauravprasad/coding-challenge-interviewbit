package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBug {

    public static ArrayList<Integer> rotateArray(List<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
//            ret.add(A.get(i + B));
            ret.add(A.get((i + B)%A.size()));
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("A : "+A);
        System.out.println("B : "+rotateArray(A, 1));
    }
}
