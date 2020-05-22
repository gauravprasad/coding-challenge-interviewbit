package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrderMatrixI {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> spiralOrder(final List<List<Integer>> A) {
        ArrayList<Integer> output = new ArrayList<>();
        Integer r = A.size();
        Integer c = A.get(0).size();
        Integer tr = 0;
        Integer br = r - 1;
        Integer lc = 0;
        Integer rc = c - 1;
        Integer direction = 0; // this is my assumption of direction, 0= left -> right, 1 = top -> down, 2 = right -> left, 3 = down -> top;
        while (tr <= br && lc <= rc) {
            if (direction == 0) {
                for (int i = lc; i <= rc; i++) {
                    output.add(A.get(tr).get(i));
                }
                tr++;
            } else if (direction == 1) {
                for (int i = tr; i <= br; i++) {
                    output.add(A.get(i).get(rc));
                }
                rc--;
            } else if(direction==2){
                for (int i = rc; i >= lc; i--) {
                    output.add(A.get(br).get(i));
                }
                br--;
            }else if (direction==3){
                for (int i = br; i >= tr ; i--) {
                    output.add(A.get(i).get(lc));
                }
                lc++;
            }
            direction = (direction+1)%4;
        }
        return output;
    }

    public  static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        if(matrix == null ||matrix.length==0)
            return ret;
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0, j=0, loop = 0;
        for(int k=0; k< m*n; k++) {
            int maxj = n-1-loop, maxi = m-1-loop;
            int minj = loop, mini = loop;
            //System.out.println(matrix[i][j]);
            ret.add(matrix[i][j]);
            if(i==mini && j < maxj) j++;
            else if (j==maxj && i<maxi) i++;
            else if (i==maxi && j>minj) j--;
            else if (j==minj && i>mini+1) i--;
            else {
                loop++;
                i=j=loop;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
        System.out.println("Input : " + input);
        System.out.println("Output : " + spiralOrder(input));
    }
}
