package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpiralOrderMatrixII {
    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {

        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        for (int i=0;i<A;i++) {
            ArrayList<Integer> temp = new ArrayList<>(Collections.nCopies(A, 0));
            output.add(temp);
        }
        int num = 0;
        int r = A;
        int c = A;
        int tr = 0;
        int br = r - 1;
        int lc = 0;
        int rc = c - 1;
        int direction = 0;// this is my assumption of direction, 0= left -> right, 1 = top -> down, 2 = right -> left, 3 = down -> top;
        while (tr <= br && lc <= rc) {
            switch (direction) {
                case 0:
                    for (int i = lc; i <= rc; i++) {
                        output.get(tr).set(i, ++num);
                    }
                    tr++;
                    break;
                case 1:
                    for (int i = tr; i <= br; i++) {
                        output.get(i).set(rc,++num);
                    }
                    rc--;
                    break;
                case 2:
                    for (int i = rc; i >= lc; i--) {
                        output.get(br).set(i,++num);
                    }
                    br--;
                    break;
                case 3:
                    for (int i = br; i >= tr; i--) {
                        output.get(i).set(lc,++num);
                    }
                    lc++;
                    break;
            }
            direction = (direction+1)%4;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(generateMatrix(5));
    }
}
