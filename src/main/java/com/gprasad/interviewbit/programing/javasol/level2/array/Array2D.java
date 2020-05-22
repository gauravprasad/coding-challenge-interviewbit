package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2D {
    static ArrayList<ArrayList<Integer>> performOps(List<List<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }

    public static void main(String[] args) {
//[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        List<List<Integer>> A = Arrays.asList(Arrays.asList(1, 2, 3, 4),Arrays.asList(5, 6, 7, 8),Arrays.asList(9, 10, 11, 12));
        System.out.println("A : "+A);
        System.out.println("B : "+performOps(A));

    }
}
