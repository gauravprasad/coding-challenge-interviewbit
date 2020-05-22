package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
InterviewBit Java Solution : Anti Diagonals (https://www.interviewbit.com/problems/anti-diagonals/)

Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

Example:


Input:

1 2 3
4 5 6
7 8 9

Return the following :

[
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]


Input :
1 2
3 4

Return the following  :

[
  [1],
  [2, 3],
  [4]
]

* */
public class AntiDiagonals {
    public static ArrayList<ArrayList<Integer>> diagonal(List<List<Integer>> A) {
        int size = A.size();
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        //Move the column diag
        ArrayList<Integer> dList = null;
        for (int col = 0; col < size; col++) {
            dList = new ArrayList<>();
            int row = 0;
            int tCol = col;
            while (tCol >= 0 && row < size) {
                dList.add(A.get(row).get(tCol));
                row++;
                tCol--;
            }
            output.add(dList);
        }
        //move the row diag
        for (int row = 1; row < size; row++) {
            dList = new ArrayList<>();
            int tRow = row;
            int col = size - 1;
            while (tRow < size && col >= 0) {
                dList.add(A.get(tRow).get(col));
                tRow++;
                col--;
            }
            output.add(dList);
        }
        return output;
    }

    public static void main(String[] args) {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
        System.out.println(diagonal(input));
    }
}
