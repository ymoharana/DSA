package com.example;

import com.example.twosum.TwoSumBruteForce;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        TwoSumBruteForce twoSum = new TwoSumBruteForce();
        System.out.println(Arrays.toString(twoSum.twoSumBruteForce(new int[]{1, 2, 3, 5, 6}, 45)));
    }



}
