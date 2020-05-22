package com.gprasad.interviewbit.programing.javasol.level2.array;

import java.util.*;
import java.util.stream.IntStream;

public class HotelBookingsPossible {
    public static boolean hotel(List<Integer> arrive, List<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int i = 0;
        int j = 0;
        while (i < arrive.size() && j < depart.size()) {
            if (arrive.get(i) < depart.get(j)) {
                i++;
                K--;
            } else if (arrive.get(i) == depart.get(j)) {
                i++;
                j++;
            } else {
                j++;
                K++;
            }
            if (K < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Input :
     * Arrivals :   [1 3 5]
     * Departures : [2 6 8]
     * K : 1
     * <p>
     * Return : False / 0
     * <p>
     * At day = 5, there are 2 guests in the hotel. But I have only one room.
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> arrive = Arrays.asList(1, 2, 3);
        List<Integer> depart = Arrays.asList(2, 3, 4);
        int K = 1;
        System.out.println(hotel(arrive, depart, K));
    }
}
