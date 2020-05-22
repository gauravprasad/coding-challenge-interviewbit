package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.ArrayList;
import java.util.List;


public class AddOneToNumber {

    public static ArrayList<Integer> plusOne(List<Integer> A) {
        int index = 0;
        while (index < A.size() && A.get(index) == 0) {
            index++;
        }
        A.subList(0, index).clear();
        if (A.size() == 0) {
            A.add(1);
            return (ArrayList<Integer>) A;
        }
        int x = A.get(A.size() - 1) + 1;
        int carryOver = x / 10;
        A.set(A.size() - 1, x % 10);
        for (int i = A.size() - 2; i >= 0; i--) {
            x = A.get(i) + carryOver;
            carryOver = x / 10;
            A.set(i, x % 10);
        }
        if (carryOver > 0) {
            A.add(0, carryOver);
        }

        return (ArrayList<Integer>) A;
    }

    // by vishnu
    private static void arrayOfDigitsPlusOne1() {
        int[] a = {9, 9, 9};
        int s = 0;
        if (a == null || a.length == 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (s == 0 && a[i] == 0) {
                continue;
            }
            s = s + (int) (a[i] * Math.pow(10, (double) a.length - 1 - i));
        }
        s = s + 1;
        String temp = Integer.toString(s);
        int[] r = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            r[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }
    }

    public static void main(String[] args) {
//        List<Integer> input = Arrays.asList(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
        //0 3 7 6 4 0 5 5 6
        //System.out.println(arrayOfDigitsPlusOne());
        List<Integer> input = new ArrayList<>();
        input.add(0);
        //input.add(0);
        /*input.add(3);
        input.add(7);
        input.add(6);
        input.add(4);
        input.add(5);
        input.add(5);
        input.add(5);*/
        /*input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);
        input.add(9);*/
        System.out.println("Input : " + input);
        System.out.println("Output : " + plusOne(input));
    }
}
