package com.company;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            boolean dalinasi = true;
            int temp = x;
            Set<Integer> skirtingi = new HashSet<>();
            int xLength = Integer.toString(x).length();
            for (int i = 0; i < xLength; i++) {
                int pirmas = temp / (int) Math.pow(10, xLength - 1);
                int y = ((temp * 10) % (int) Math.pow(10, xLength)) + pirmas;
                skirtingi.add(pirmas);
                if (y % x != 0) {
                    dalinasi = false;
                }
                temp = y;
            }
            if (dalinasi && skirtingi.size() > xLength/2 && x > 10) {
                System.out.println("It's magic!");
            } else System.out.println("No");
        } catch (InputMismatchException e) {
            System.out.println("To big for an integer or not an integer at all");
        }
    }
}