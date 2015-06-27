package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] a = new long[t];
        for (int i = 0; i < t ; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < t; i++) {
            System.out.println(flipBits(a[i]));
        }
    }
    public static long flipBits(long n){
        String stBinInv="";
        String stBin = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
        for (int i = 0; i < stBin.length(); i++) {
            if (stBin.charAt(i) == '0') {
                stBinInv = stBinInv + "1";
            }
            else {
                stBinInv = stBinInv + "0";
            }
        }
        long Result = Long.parseLong((stBinInv), 2);
        return Result;
    }
}
